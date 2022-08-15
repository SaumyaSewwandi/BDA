package com.example.bda.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.bda.Model.User;
import com.example.bda.R;
import com.google.firebase.auth.internal.RecaptchaActivity;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    private Context context;
    private List<User>userList;

    public UserAdapter(Context context, List<User> userList) {
        this.context = context;
        this.userList = userList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(context).inflate(
               R.layout.user_dispalayed_layout,parent,false);

       return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final User user = userList.get(position);

        holder.type.setText(user.getType());

        if(user.getType().equals("donor")){

            holder.emailnow.setVisibility(View.VISIBLE);

        }

        holder.useremail.setText(user.getEmail());
        holder.username.setText(user.getName());
        holder.phoneNumber.setText(user.getPhonenumber());
        holder.bloodGroup.setText("Blood Group " + user.getBloodgroup());

        Glide.with(context).load(user.getProfilepictureurl()).into(holder.userProfileImage);

    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private CircleImageView userProfileImage;
        private TextView type,username,useremail,phoneNumber,bloodGroup;
        private Button emailnow;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);

            userProfileImage=itemView.findViewById(R.id.userProfileImage);
            type = itemView.findViewById(R.id.type);
            username = itemView.findViewById(R.id.username);
            useremail = itemView.findViewById(R.id.useremail);
            phoneNumber = itemView.findViewById(R.id.phoneNumber);
            bloodGroup = itemView.findViewById(R.id.bloodGroup);
            emailnow = itemView.findViewById(R.id.emailnow);

        }
    }


}

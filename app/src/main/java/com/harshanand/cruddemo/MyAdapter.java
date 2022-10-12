package com.harshanand.cruddemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MyAdapter extends ArrayAdapter<ParkingUser> {

    Context context;
    List<ParkingUser> arrayListParkingUser;


    public MyAdapter(@NonNull Context context, List<ParkingUser> arrayListParkingUser) {
        super(context, R.layout.custom_list_item, arrayListParkingUser);

        this.context = context;
        this.arrayListParkingUser = arrayListParkingUser;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list_item,null,true);

        TextView tvID = view.findViewById(R.id.txt_id);
        TextView tvName = view.findViewById(R.id.txt_name);

        tvID.setText(arrayListParkingUser.get(position).getId());
        tvName.setText(arrayListParkingUser.get(position).getName());

        return view;
    }
}

package com.runkevich8.gmail.test.homework.hw6;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.runkevich8.gmail.test.R;

import java.util.ArrayList;
import java.util.List;



public class RootAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private List<Schedule> itemList = new ArrayList<>();
    public void setItems(List<Schedule> itemList) {
        this.itemList.clear();
        this.itemList.addAll(itemList);
        notifyDataSetChanged();  //поменялись данные - перерисуй их на экране
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hw6_bus,
                parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
     //   Holder myHolder = (Holder) holder;

//        final Root root = itemList.get(position);
//
//        myHolder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(listener!=null) listener.onClick(user,position);
//            }
//        });
//
//        // Glide.with(myHolder.imageView.getContext()).load("sova_anmation_1.png").into(myHolder.imageView);
//        // myHolder.imageView.set//FIXME Implement Glide
//        myHolder.nameTextView.setText(user.getName());
//        myHolder.surnameTextView.setText(user.getSurname());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    private static class Holder extends RecyclerView.ViewHolder {
        TextView nameTextView;


        public Holder(View itemView) {
            super(itemView);
            Log.e("UserAdaaaaaaaaaaaapter", "Holder");

            nameTextView = itemView.findViewById(R.id.hw6_item_bus_text);

        }
    }
}

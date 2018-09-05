package com.example.drishti.retrofitapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    String[] values;
    Context context1;
    public RecyclerViewAdapter(Context context2,String[] values2){

        values = values2;

        context1 = context2;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textView;

        public ViewHolder(View v){

            super(v);

            textView = (TextView) v.findViewById(R.id.textview1);

//            public TextView getText(){
//                return textView;
//            }
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view1 = LayoutInflater.from(context1).inflate(R.layout.recycler_view_items,parent,false);

        ViewHolder viewHolder1 = new ViewHolder(view1);

        return viewHolder1;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
    holder.textView.setText(values[position]);


    }

    @Override
    public int getItemCount() {
        return values.length;
    }
}

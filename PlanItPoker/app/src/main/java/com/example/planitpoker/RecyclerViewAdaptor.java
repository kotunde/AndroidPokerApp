package com.example.planitpoker;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdaptor extends RecyclerView.Adapter<RecyclerViewAdaptor.ViewHolder> {

    private static final String TAG ="RecyclerViewAdapter";

    private ArrayList<String>Names = new ArrayList<>();
    private ArrayList<Integer>Grades_value = new ArrayList<>();
    private ListVoteFragment mContext;

    public RecyclerViewAdaptor(ListVoteFragment mContext, ArrayList<String> names, ArrayList<Integer> grades_value) {
        this.Names = names;
        this.Grades_value=grades_value;
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Log.d(TAG,"onBindViewHolder: Called");

        holder.Names.setText(Names.get(position));
        holder.Grade_value.setText(Grades_value.get(position));
    }

    @Override
    public int getItemCount() {

        return Names.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView Names;
        TextView Grade_value;
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            Names= itemView.findViewById(R.id.Names_id);
            Grade_value= itemView.findViewById(R.id.Grades_id);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }

    }
}

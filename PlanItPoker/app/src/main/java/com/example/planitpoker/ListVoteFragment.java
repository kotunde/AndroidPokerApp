package com.example.planitpoker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListVoteFragment extends Fragment {


    private View retView;
    private ArrayList<String>Names = new ArrayList<>();
    private ArrayList<Integer>Grades_values = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        retView = inflater.inflate(R.layout.listvote_fragment,container,false);

        //Intent intent = getIntent();

        initRecyclerView();

        return retView;
    }

    private void initRecyclerView(){
        RecyclerView recyclerView = retView.findViewById(R.id.Recycler_view);
        RecyclerViewAdaptor adaptor = new RecyclerViewAdaptor(this,Names,Grades_values);
        recyclerView.setAdapter(adaptor);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

    }


}

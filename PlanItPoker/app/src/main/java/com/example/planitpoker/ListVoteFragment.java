package com.example.planitpoker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ListVoteFragment extends Fragment {


    View retView;
    private RecyclerView recyclerView;
    private List<TaskVoteResult> Names;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        retView = inflater.inflate(R.layout.listvote_fragment,container,false);

        recyclerView = (RecyclerView) retView.findViewById(R.id.Recycler_view);
        RecyclerViewAdaptor adaptor = new RecyclerViewAdaptor(getContext(),Names);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adaptor);

        //Intent intent = getIntent();

        return retView;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Names = new ArrayList<>();

        Names.add(new TaskVoteResult("Valaki",6,"valamire"));
        Names.add(new TaskVoteResult("Valaki",6,"valamire"));
        Names.add(new TaskVoteResult("Valaki",6,"valamire"));
        Names.add(new TaskVoteResult("Valaki",6,"valamire"));

    }
}

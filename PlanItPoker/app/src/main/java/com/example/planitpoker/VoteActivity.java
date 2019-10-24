package com.example.planitpoker;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;


public class VoteActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        //ft.replace(R.id.fg_placeholder,new VoteFragment());
        //ft.commit();
        VoteFragment voteFragment = new VoteFragment();
        ft.add(R.id.fg_placeholder,voteFragment);
        ft.commit();

    }
}

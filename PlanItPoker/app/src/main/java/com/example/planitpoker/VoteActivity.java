package com.example.planitpoker;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import java.nio.BufferUnderflowException;


public class VoteActivity extends AppCompatActivity
{
    String loginName;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote);

        Intent intent = getIntent();
        loginName = intent.getStringExtra("Login_name");
        Log.i("Sent through intent: ",loginName);//mukodik
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        //does not work!!!
        //ft.replace(R.id.fg_placeholder,new VoteFragment());
        //ft.commit();

        VoteFragment voteFragment = new VoteFragment();
        //send loginName to the fragment
        Bundle data = new Bundle();
        data.putString("name",loginName);
        voteFragment.setArguments(data);
        ft.add(R.id.fg_placeholder,voteFragment);
        ft.commit();

    }
    public String getLoginName()
    {
        return loginName;
    }
}

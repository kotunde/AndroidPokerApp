package com.example.planitpoker;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageButton;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.Arrays;

public class VoteFragment extends Fragment
{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        View retView = inflater.inflate(R.layout.vote_fragment,container,false);

        ArrayList<String> buttonText = new ArrayList<>(Arrays.asList("0","1/2","1","2","3","5","8","13","20","40","100","?"));
        GridLayout myGridLayout =retView.findViewById(R.id.ly_grid);

        //fill grid with buttons
        for (int i=0; i<12; ++i)
        {
            Button myButton = new Button(getContext());

            myButton.setId(i);
            String btn_text = buttonText.get(i).toString();
            myButton.setText(btn_text);
            myGridLayout.addView(myButton);
        }
        //Space space = new Space(getContext());
        //myGridLayout.addView(space);
        ImageButton myButton = new ImageButton(getContext());
        myButton.setLayoutParams(new GridLayout.LayoutParams());
        int btn_id=12;
        GridLayout.LayoutParams params = new GridLayout.LayoutParams(GridLayout.spec(4),GridLayout.spec(1));
        GridLayout.LayoutParams param = new GridLayout.LayoutParams();
        myButton.setLayoutParams(params);
        myButton.setId(btn_id);
        Drawable dr = getResources().getDrawable(R.drawable.coffe,null);
        Bitmap bitmap = ((BitmapDrawable)dr).getBitmap();
        Drawable d = new BitmapDrawable(getResources(),Bitmap.createScaledBitmap(bitmap,50,50,true));
        myButton.setImageDrawable(d);
        myGridLayout.addView(myButton);


        for(int i = 0; i < 13; ++i)
        {
            myButton = retView.findViewById(i);
            myButton.setOnClickListener();
        }

        return retView;
    }


}

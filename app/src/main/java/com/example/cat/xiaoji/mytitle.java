package com.example.cat.xiaoji;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.LinkedHashMap;

/**
 * Created by cat on 16-3-22.
 */
public class mytitle extends LinearLayout {
    public mytitle(Context context, AttributeSet attrs){
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.mytitle, this);
        Button tb1 = (Button)findViewById(R.id.tbu1);
        Button tb2 = (Button)findViewById(R.id.tbu2);

        tb1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                ((Activity)getContext()).finish();
            }
        });
        tb2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(getContext(), "hhhhhhhhhh", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

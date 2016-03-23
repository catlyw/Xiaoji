package com.example.cat.xiaoji;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.preference.DialogPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    private Button bt1;
    private Button bt2;
    private RadioGroup rg;
    private EditText et1;
    private ImageView iv1;
    private ProgressBar pb1;
    String tmp="1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        bt2 = (Button) findViewById(R.id.button2);
        et1 = (EditText) findViewById(R.id.editText);
         rg = (RadioGroup)findViewById(R.id.radioGroup);
        iv1 = (ImageView)findViewById(R.id.i_view);
        pb1 = (ProgressBar)findViewById(R.id.pjd);
                 rg.setOnCheckedChangeListener(this);
         bt2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        //System.out.println(tmp);
        String inpt = et1.getText().toString();
        Toast.makeText(MainActivity.this, "zongzhi jian"+inpt+tmp, Toast.LENGTH_SHORT).show();
         final Intent intent7 = new Intent(MainActivity.this, activity2.class);
        iv1.setImageResource(R.drawable.ic_launcher);
       int pjdi1=pb1.getProgress();
        pjdi1 = pjdi1+10;
        pb1.setProgress(pjdi1);
        //
        AlertDialog.Builder aaa= new AlertDialog.Builder(MainActivity.this);
        aaa.setTitle("hahah");
        aaa.setMessage("text");
        aaa.setCancelable(false);
        aaa.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                startActivity(intent7);
            }
        });
        aaa.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        aaa.show();
    }
    });

    }
    @Override
    public  void onCheckedChanged(RadioGroup group, int checkdId){
        switch (checkdId){
            case R.id.radio1:
               tmp="1";
                break;
            case R.id.radio2:
                tmp="2";
                break;
            case R.id.radio3:
                tmp="3";
                break;
            case R.id.radio4:
                tmp="4";
                break;
        }
    }

}


      /* //diyizhong
       bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                System.out.println("hahh5555hha");
            }
        });*/
        /*  dierzhong fangfa

        bt1.setOnClickListener(new MyOnCl(){
            @Override
            public void onClick(View v){
                super.onClick(v);
                System.out.println("222222222222");
            }
        });
    }
}

class MyOnCl implements View.OnClickListener{
    @Override
    public  void onClick(View v){
        System.out.println("111111111111");
    }
}*/
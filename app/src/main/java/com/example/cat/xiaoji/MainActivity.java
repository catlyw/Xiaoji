package com.example.cat.xiaoji;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{
    private Button bt1;
    private Button bt2;
    private RadioGroup rg;
    String tmp="1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt2 = (Button) findViewById(R.id.button2);
         rg = (RadioGroup)findViewById(R.id.radioGroup);

                 rg.setOnCheckedChangeListener(this);
bt2.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        System.out.println(tmp);
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
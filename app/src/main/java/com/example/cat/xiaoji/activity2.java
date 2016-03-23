package com.example.cat.xiaoji;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cat on 16-3-22.
 */
public class activity2 extends Activity {
    private Button bt3;



    @Override
    protected void onCreate(Bundle saveis){
        super.onCreate(saveis);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity2);
        Button bt3 =(Button)findViewById(R.id.button);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inlv = new Intent(activity2.this, mylistview.class);
                //Intent intent2 =new Intent(Intent.ACTION_DIAL);
                //intent2.setData(Uri.parse("tel:10086"));
                startActivity(inlv);
                Toast.makeText(activity2.this, "goblack", Toast.LENGTH_SHORT).show();


            }
        });
        Button duihuak = (Button)findViewById(R.id.button3);
        duihuak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent indhk = new Intent(activity2.this, duihuakuang.class);
                startActivity(indhk);
                finish();
            }
        });

    }
}

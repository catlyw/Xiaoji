package com.example.cat.xiaoji;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

/**
 * Created by cat on 16-3-23.
 */
import java.util.ArrayList;
import java.util.List;

public class duihuakuang extends AppCompatActivity {
    //duihuakaung
    private ListView msglv;
    private EditText inpet;
    private Button send;
    private MsgAdapte adapte;
    private List<Msg> msgList = new ArrayList<Msg>();
    protected void onCreate(Bundle saveis){
        super.onCreate(saveis);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.duihuakuang);
        initMsgs();
        adapte = new MsgAdapte(duihuakuang.this, R.layout.msg_item, msgList);
        inpet = (EditText)findViewById(R.id.inptduihua);
        send = (Button)findViewById(R.id.send);
        msglv=(ListView)findViewById(R.id.msg0list);
        msglv.setAdapter(adapte);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String content = inpet.getText().toString();
                if(!"".equals(content)){
                        Msg msg = new  Msg(content,Msg.TYPE_SENT);
                    msgList.add(msg);
                    adapte.notifyDataSetChanged();
                    msglv.setSelection(msgList.size());
                    inpet.setText("");
                }
            }


        });

 }
private void initMsgs(){
        Msg msg1= new  Msg("hdfjsjflk", Msg.TYPE_RECEIVED);
       // for(int i=0; i < 3; i++)
            msgList.add(msg1);
        Msg msg12= new  Msg("hdfjsjflk", Msg.TYPE_SENT);
    msgList.add(msg12);
    Msg msg1e= new  Msg("hdfjsjflk", Msg.TYPE_RECEIVED);
    msgList.add(msg1e);
 }
}

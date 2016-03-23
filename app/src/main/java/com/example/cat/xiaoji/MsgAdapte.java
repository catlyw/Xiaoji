package com.example.cat.xiaoji;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by cat on 16-3-23.
 */
public class MsgAdapte extends ArrayAdapter<Msg> {
    private  int resoumid;
    public MsgAdapte(Context context, int textViewResourceId, List<Msg> objectss){
        super(context, textViewResourceId, objectss);
        resoumid=textViewResourceId;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup paewnt) {
        Msg msg = getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resoumid, null);
            viewHolder = new ViewHolder();
            viewHolder.leftLayout = (LinearLayout) view.findViewById(R.id.left_lay);
            viewHolder.rightlayout = (LinearLayout) view.findViewById(R.id.right_lay);
            viewHolder.leftMag =(TextView)view.findViewById(R.id.left_meg);
            viewHolder.rightMsg = (TextView)view.findViewById(R.id.right_meg);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        if (msg.getType() == Msg.TYPE_RECEIVED) {
            viewHolder.leftLayout.setVisibility(View.VISIBLE);
            viewHolder.rightlayout.setVisibility(View.GONE);
           // System.out.println("rerureuourouerueruou");
            viewHolder.leftMag.setText(msg.getContent());
            //System.out.println("rerureuourouerueruou");
        } else if(msg.getType()==Msg.TYPE_SENT){
            viewHolder.leftLayout.setVisibility(View.GONE);
            viewHolder.rightlayout.setVisibility(View.VISIBLE);
            viewHolder.rightMsg.setText(msg.getContent());
        }
        return view;
    }
    class ViewHolder {
        LinearLayout leftLayout;
        LinearLayout rightlayout;
        TextView leftMag;
        TextView rightMsg;
    }
}

package com.example.cat.xiaoji;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cat on 16-3-23.
 */
public class mylistview extends Activity{
    private List<Fruit> fruitList = new ArrayList<Fruit>();
    private Fruit aa= new Fruit("apple", R.drawable.ic);

    @Override
    protected void onCreate(Bundle saveis){
        super.onCreate(saveis);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.mylistview);
        for(int i=0; i<20; i++)
            fruitList.add(aa);
        FruitAdapter adapte = new FruitAdapter(mylistview.this, R.layout.fruit_item, fruitList);
        ListView lv3 =(ListView)findViewById(R.id.lv1);
        lv3.setAdapter(adapte);
        lv3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit=fruitList.get(position);
                Toast.makeText(mylistview.this, fruit.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

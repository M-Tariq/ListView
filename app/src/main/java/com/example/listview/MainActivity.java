package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String items[]={"fruits", "vegs", "Drinks"};
        listView=findViewById(R.id.listview);
        ArrayAdapter<String> arrayAdapter=
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent i=new Intent(getApplicationContext(), DetailActivity.class);
                    i.putExtra("position", "fruits" );
                    startActivity(i);
                }
                else if(position==1){
                    Intent i=new Intent(getApplicationContext(), DetailActivity.class);
                    i.putExtra("position", "vegs" );
                    startActivity(i);
                }
                else{
                    Intent i=new Intent(getApplicationContext(), DetailActivity.class);
                    i.putExtra("position", "drinks" );
                    startActivity(i);

                }
            }
        });
    }
}

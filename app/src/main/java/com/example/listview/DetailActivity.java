package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    ImageView imageView1, imageView2, imageView3;
    TextView textView1, textView2, textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        //getActionBar().setTitle("Hello world App");
        //getSupportActionBar().setTitle("Hello world App");

        textView1=findViewById(R.id.tv1);
        textView2=findViewById(R.id.tv2);
        textView3=findViewById(R.id.tv3);

        imageView1=findViewById(R.id.img1);
        imageView2=findViewById(R.id.img2);
        imageView3=findViewById(R.id.img3);

        ArrayAdapter<String>  arrayAdapter;


        Intent i=getIntent();


        String pos=i.getStringExtra("position");
        Log.d("tag", "onCreate: "+pos);
        if(pos.compareTo("vegs")==0){

            setTitle("Vegetables List");
            textView1.setText("Carrot");
            textView2.setText("Lady finger");
            textView3.setText("Cocumber");

            imageView1.setImageResource(R.drawable.v1);
            imageView2.setImageResource(R.drawable.v2);
            imageView3.setImageResource(R.drawable.v3);
        }
        else if(pos.compareTo("fruits")==0){
            setTitle("Fruits List");
            textView1.setText("Banana");
            textView2.setText("Apple");
            textView3.setText("Guava");
            imageView1.setImageResource(R.drawable.f1);
            imageView2.setImageResource(R.drawable.f2);
            imageView3.setImageResource(R.drawable.f3);
        }
        else if(pos.compareTo("drinks")==0){
            setTitle("Dinks List");
            textView1.setText("Coca Col");
            textView2.setText("Pepsi");
            textView3.setText("Sprite");
            imageView1.setImageResource(R.drawable.d1);
            imageView2.setImageResource(R.drawable.d2);
            imageView3.setImageResource(R.drawable.d3);

        }
        //textView1.setText("Ok ");


    }
}

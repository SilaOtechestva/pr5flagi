package com.example.multy55kasatikova;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    String[] countries = { "Аргентина", "Бразилия", "Чили", "Колумбия"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main);

        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, countries);
        setListAdapter(mAdapter);

        AdapterView.OnItemClickListener ItemListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               switch (position)
               {
                   case 0:
                       Intent intent1 = new Intent(MainActivity.this, Argentina.class);
                       startActivity(intent1);
                       break;
                   case 1:
                       Intent intent2 = new Intent(MainActivity.this, Brazilia.class);
                       startActivity(intent2);
                       break;
                   case 2:
                       Intent intent3 = new Intent(MainActivity.this, Chili.class);
                       startActivity(intent3);
                       break;
               }
                Toast.makeText(getApplicationContext(), "Вы выбрали " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
        };

        getListView().setOnItemClickListener(ItemListener);
    }
}
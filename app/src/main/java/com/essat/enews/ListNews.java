package com.essat.enews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListNews extends AppCompatActivity {
ListView lstNews;
News[]liste=new News[]{"Bonjour","Hello","Marhaba"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_news);
        lstNews=findViewById(R.id.lst_news);
//charger la liste des news
        ArrayAdapter<String>adapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,liste);
        lstNews.setAdapter(adapter);
        lstNews.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
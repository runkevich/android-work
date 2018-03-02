package com.runkevich8.gmail.test.homework.hw6;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.runkevich8.gmail.test.R;

public class Homework6Activity extends AppCompatActivity{
    private Button buttonDownloadXml;
    private Button buttonDownloadJson;
    private RecyclerView recyclerViewBus;
    private RootAdapter rootAdapter;
    private Root root ;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw6);

        buttonDownloadXml = findViewById(R.id.hw_6_xml);
        buttonDownloadJson = findViewById(R.id.hw_6_json);



        View.OnClickListener hwXmlClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Manager.downloadUrl(1);
            }
        };

        buttonDownloadXml.setOnClickListener(hwXmlClick);


        View.OnClickListener hwJsonClick = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Manager.downloadUrl(2);

                rootAdapter = new RootAdapter();
                rootAdapter.setItems(root.getSchedule());

                recyclerViewBus = findViewById(R.id.hw6_rv);
                recyclerViewBus.setAdapter(rootAdapter);
                recyclerViewBus.setLayoutManager(new LinearLayoutManager(Homework6Activity.this));

                recyclerViewBus.setHasFixedSize(true);
            }
        };

        buttonDownloadJson.setOnClickListener(hwJsonClick);



    }
}

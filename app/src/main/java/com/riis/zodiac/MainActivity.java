package com.riis.zodiac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Feature 1 - Add a ListView
        ListView listView = (ListView) findViewById(R.id.list_of_signs);
    }
}

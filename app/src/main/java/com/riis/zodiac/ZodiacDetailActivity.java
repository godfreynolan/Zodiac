package com.riis.zodiac;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


public class ZodiacDetailActivity extends Activity {

    public static final String EXTRA_SIGN = "ZodiacSign";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zodiac_detail);
    }
}
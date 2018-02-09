package com.drwitteck.mydataapp;

import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.net.URI;
import java.util.Currency;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Cursor cr = getContentResolver().query(Uri.parse("content://edu.drwitteck.mydataapp.junkdataprovider")
        ,null, null, null, null);

        cr.moveToNext();

        Log.d("Name", cr.getString(0));
    }
}

package com.example.sunil.action;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Used one of them or both of them
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.secmenu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    /*Imprtant Note:
     Do change in Manifest file are as follow:-

      <activity android:name=".SecondActivity"  android:parentActivityName=".MainActivity">
        </activity>

        If you not did changes in Manifest file back button will not appear on 'activity_xml' */

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){

            case android.R.id.home:
                this.finish();          //It will finish activity through which it call and return back to Original Activity again i.e. here 'MainActivity.java'
                break;

            case R.id.home:             //In R.id.home 'home' is already
               onBackPressed();         //It will again call same activity through which 'SecondActivity' is called.
                break;

        }

        return super.onOptionsItemSelected(item);
    }

}

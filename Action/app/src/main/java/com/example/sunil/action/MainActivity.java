package com.example.sunil.action;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button go;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        go= (Button) findViewById(R.id.bt_go);

        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(i);
//                finish();    //Finish need to comment here else after click back button of Actionbar in SecondActivity app will close
            }
        });

        ActionBar ab=getSupportActionBar();
        ab.setLogo(R.drawable.dc_comics);
        ab.setDisplayUseLogoEnabled(true);     //This method will enable your logo
        ab.setDisplayShowHomeEnabled(true);    //This method will enable your home



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_activity,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){

            case R.id.add_id:
                Toast.makeText(this,"Item is selected",Toast.LENGTH_SHORT).show();
                break;

            case R.id.setting_id:
                Toast.makeText(this,"Setting  is selected",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

package com.example.simon.td_08_03_2017_simon_nicolas;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button GoPage2; // Mon bouton pour aller sur la page 2
    private final int RESULT_SELECTION = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GoPage2 = (Button)findViewById(R.id.GoPage2); // Relie bouton du java au xml

        GoPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToNextActivity();
            }
        });

    }

    public void goToNextActivity(){
        Intent intent=new Intent(MainActivity.this,Page2Java.class);
        startActivityForResult(intent, RESULT_SELECTION);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==RESULT_SELECTION)
        {
            if(null!=data)
            {
                String nom=data.getStringExtra("Nom");
                String MDP=data.getStringExtra("MDP");
                String Email=data.getStringExtra("Email");
                Toast.makeText(getApplicationContext(),nom, Toast.LENGTH_SHORT).show();
                Log.i("1" , nom);
                Toast.makeText(getApplicationContext(),MDP, Toast.LENGTH_SHORT).show();
                Log.i("1" , MDP);
                Toast.makeText(getApplicationContext(),Email, Toast.LENGTH_SHORT).show();
                Log.i("1" , Email);
            }
        }
    }


}

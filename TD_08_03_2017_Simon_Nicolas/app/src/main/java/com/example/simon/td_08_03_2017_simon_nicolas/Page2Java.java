package com.example.simon.td_08_03_2017_simon_nicolas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by simon on 08/03/2017.
 */

public class Page2Java extends AppCompatActivity {

    EditText Nom;
    EditText MDP;
    EditText Email;
    Button Valider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);

        Valider= (Button)findViewById(R.id.RetourPage1);
        Nom= (EditText)findViewById(R.id.Nom);
        MDP= (EditText)findViewById(R.id.MDP);
        Email= (EditText)findViewById(R.id.Email);

        Valider.setOnClickListener(new View.OnClickListener() { // gestion du click
            @Override
            public void onClick(View view) {
                EnvoiInfo(); // appel de la procedure d'envoi des données
            }
        });

    }

    public void EnvoiInfo(){

        // crée le intent
        Intent Donnee=new Intent();

        // mettre les messages dans le intent
        Donnee.putExtra("Nom",Nom.getText().toString());
        Donnee.putExtra("MDP",MDP.getText().toString());
        Donnee.putExtra("Email",Email.getText().toString());
        // Set les resultats pour le StartActivityForResult
        setResult(0,Donnee);
        // Finir cette activité
        finish();

    }
}

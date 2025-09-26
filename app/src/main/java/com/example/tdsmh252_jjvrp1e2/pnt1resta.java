package com.example.tdsmh252_jjvrp1e2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class pnt1resta extends AppCompatActivity {

    EditText cajanombre,txtnum1,txtnum2;
    Button btnp1resta,btnp1Inicio;
    TextView lblresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pnt1resta);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txtnum1 = findViewById(R.id.txtnum1) ;
        txtnum2 = findViewById(R.id.txtnum2) ;
        btnp1resta = findViewById(R.id.btnp1resta) ;
        lblresultado = findViewById(R.id.lblresultado);
        btnp1Inicio = findViewById(R.id.btnp1Inicio) ;
    }
    public void oneclickrestar (View v){
        int num1,num2 ;
        num1 = Integer.parseInt (txtnum1.getText().toString());
        num2 = Integer.parseInt (txtnum2.getText().toString());
        String cadena = "El resultado de la resta es: "+String.valueOf(num1-num2) ;
        lblresultado.setText(cadena);
    }
    public void oneclickInicio (View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
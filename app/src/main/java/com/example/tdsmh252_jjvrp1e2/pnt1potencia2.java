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

import java.math.BigInteger;

public class pnt1potencia2 extends AppCompatActivity {

    EditText txtnum1;
    Button btnp1potencia,btnp1Inicio;
    TextView lblresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pnt1potencia2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txtnum1 = findViewById(R.id.txtnum1) ;
        btnp1potencia = findViewById(R.id.btnp1potencia) ;
        lblresultado = findViewById(R.id.lblresultado);
        btnp1Inicio = findViewById(R.id.btnp1Inicio) ;
    }
    public void oneclickpotencia (View v) {
        String s1 = txtnum1.getText().toString().trim();
        if (s1.isEmpty()) {
            lblresultado.setText("Debes capturar un número");
            return;
        }
        try {
            BigInteger n1 = new BigInteger(s1);
            BigInteger res = n1.pow(2);
            lblresultado.setText("Al cuadrado: " + res.toString());
        } catch (NumberFormatException ex) {
            lblresultado.setText("Formato no válido");
        }
    }
    public void oneclickInicio (View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
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

public class pnt1potenciaN extends AppCompatActivity {

    EditText txtnum1,txtnum2;
    Button btnp1potenciaN,btnp1Inicio;
    TextView lblresultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pnt1potencia_n);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txtnum1 = findViewById(R.id.txtnum1) ;
        txtnum2 = findViewById(R.id.txtnum2) ;
        btnp1potenciaN = findViewById(R.id.btnp1potenciaN) ;
        btnp1Inicio = findViewById(R.id.btnp1Inicio) ;
        lblresultado = findViewById(R.id.lblresultado) ;
    }
    public void oneclickpotenciaN(View v) {
        String s1 = txtnum1.getText().toString().trim();
        String s2 = txtnum2.getText().toString().trim();
        if (s1.isEmpty() || s2.isEmpty()) {
            lblresultado.setText("Debes capturar base y exponente");
            return;
        }
        try {
            BigInteger base = new BigInteger(s1);
            int exp        = Integer.parseInt(s2);
            if (exp < 0) {
                lblresultado.setText("Exponente debe ser ≥ 0");
                return;
            }
            BigInteger res = base.pow(exp);
            lblresultado.setText("Potencia: " + res.toString());
        } catch (NumberFormatException ex) {
            lblresultado.setText("Formato no válido");
        }
    }
    public void oneclickInicio (View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
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

public class pnt1multiplicacion extends AppCompatActivity {
    EditText txtnum1,txtnum2;
    Button btnp1multi,btnp1Inicio;
    TextView lblresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pnt1multiplicacion);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txtnum1 = findViewById(R.id.txtnum1) ;
        txtnum2 = findViewById(R.id.txtnum2) ;
        btnp1multi = findViewById(R.id.btnp1multi) ;
        lblresultado = findViewById(R.id.lblresultado);
        btnp1Inicio = findViewById(R.id.btnp1Inicio) ;


    }
    public void oneclickmultiplicar (View v) {
        String s1 = txtnum1.getText().toString().trim();
        String s2 = txtnum2.getText().toString().trim();
        if (s1.isEmpty() || s2.isEmpty()) {
            lblresultado.setText("Debes capturar dos números");
            return;
        }
        try {
            BigInteger n1 = new BigInteger(s1);
            BigInteger n2 = new BigInteger(s2);
            BigInteger res = n1.multiply(n2);
            lblresultado.setText("Multiplicación: " + res.toString());
        } catch (NumberFormatException ex) {
            lblresultado.setText("Formato no válido");
        }
    }
    public void oneclickInicio (View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
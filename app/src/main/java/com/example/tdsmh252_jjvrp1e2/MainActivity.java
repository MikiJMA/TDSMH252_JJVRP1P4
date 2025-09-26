package com.example.tdsmh252_jjvrp1e2;

import android.content.Intent;
import java.math.BigDecimal;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.math.BigInteger;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText cajanombre,txtnum1,txtnum2;
    Button btnp1saluda,btnp1sumar,btnp1resta,btnp1divi, btnp1multi,btnp1potencia, btnp1potenciaN;
    TextView lblresultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        cajanombre = findViewById(R.id.txtnombre) ;
        btnp1saluda = findViewById(R.id.btnp1saluda) ;
        txtnum1 = findViewById(R.id.txtnum1) ;
        txtnum2 = findViewById(R.id.txtnum2) ;
        btnp1sumar = findViewById(R.id.btnp1sumar) ;
        btnp1resta = findViewById(R.id.btnp1resta) ;
        btnp1divi = findViewById(R.id.btnp1divi) ;
        btnp1multi = findViewById(R.id.btnp1multi) ;
        btnp1potencia = findViewById(R.id.btnp1potencia) ;
        btnp1potenciaN = findViewById(R.id.btnp1potenciaN) ;
        lblresultado = findViewById(R.id.lblresultado) ;


        btnp1saluda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "BIENVENIDO" + cajanombre.getText() , Toast.LENGTH_LONG).show();
            }
        });

    }
    public void oneclicksumar (View v){
        Intent intent = new Intent(this, pnt1suma.class);
        startActivity(intent);
    }


    public void oneclickrestar (View v){

        Intent intent = new Intent(this, pnt1resta.class);
        startActivity(intent);
    }
    public void oneclickdividir (View v){
        Intent intent = new Intent(this, pnt1divicion.class);
        startActivity(intent);

    }
    public void oneclickmultiplicar (View v) {
        Intent intent = new Intent(this, pnt1multiplicacion.class);
        startActivity(intent);
    }

    public void oneclickpotencia (View v) {
        Intent intent = new Intent(this, pnt1potencia2.class);
        startActivity(intent);
    }

    public void oneclickpotenciaN(View v) {
        Intent intent = new Intent(this, pnt1potenciaN.class);
        startActivity(intent);
    }


}
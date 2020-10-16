package com.example.loteriaexpres;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView sal1, sal2,sal3,sal4,sal5,result;
    EditText entra1,entra2,entra3,entra4,entra5;
    Random r;
    Conexiondedatos cn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sal1 = findViewById(R.id.salida1);
        sal2 = findViewById(R.id.salida2);
        sal3 = findViewById(R.id.salida3);
        sal4 = findViewById(R.id.salida4);
        sal5 = findViewById(R.id.salida5);
        result = findViewById(R.id.mensaje);
        entra1 = findViewById(R.id.entrada1);
        entra2 = findViewById(R.id.entrada2);
        entra3 = findViewById(R.id.enrtrada3);
        entra4 = findViewById(R.id.entrada4);
        entra5 = findViewById(R.id.entrada5);
        r = new Random();
        cn = new Conexiondedatos(this);



    }
    public  void generar(View b){
        Numerodeloto n = new Numerodeloto();
        n.setNum1(Integer.parseInt(entra1.getText().toString()));
        n.setNum2(Integer.parseInt(entra2.getText().toString()));
        n.setNum3(Integer.parseInt(entra3.getText().toString()));
        n.setNum4(Integer.parseInt(entra4.getText().toString()));
        n.setNum5(Integer.parseInt(entra5.getText().toString()));
        Toast.makeText(this,"campo ingresado",Toast.LENGTH_LONG).show();




        int random1, random2, random3, random4,random5;
        int n1,n2,n3,n4,n5;

        random1 = r.nextInt(30)+1;
        random2 = r.nextInt(30)+1;
        random3 = r.nextInt(30)+1;
        random4 = r.nextInt(30)+1;
        random5 = r.nextInt(30)+1;
        sal1.setText(random1+"");
        sal2.setText(random2+"");
        sal3.setText(random3+"");
        sal4.setText(random4+"");
        sal5.setText(random5+"");
        if (entra1.equals(sal1) && entra2.equals(sal2) && entra3.equals(sal3) && entra4.equals(sal4) && entra5.equals(sal5)){
            result.setText(" ganaste el pepe");

        }
        if (entra1.equals(sal1) && entra2.equals(sal2) && entra3.equals(sal3) && entra4.equals(sal4)){
            result.setText(" ganaste un setch");

        }
        if (entra1.equals(sal1) && entra2.equals(sal2) && entra3.equals(sal3)){
            result.setText(" ganaste un shockman");

        }else{
            result.setText("lamentablemente no ganaste nada");
        }


    }





    }




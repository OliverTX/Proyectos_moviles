package com.example.oliverrodriguez.a16calculadorabasica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtResul;
    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btnMas;
    Button btnMenos;
    Button btnEntre;
    Button btnPor;
    Button btnSign;
    Button btnPunt;
    Button btnIgu;
    boolean banderaOperador = true;
    boolean banderaPunto = true;
    int codOper;
    double num1;
    boolean banderaOperacion=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtResul = (TextView) findViewById(R.id.txt_Res);
        btn0 = (Button) findViewById(R.id.btn_0);
        btn1 = (Button) findViewById(R.id.btn_1);
        btn2 = (Button) findViewById(R.id.btn_2);
        btn3 = (Button) findViewById(R.id.btn_3);
        btn4 = (Button) findViewById(R.id.btn_4);
        btn5 = (Button) findViewById(R.id.btn_5);
        btn6 = (Button) findViewById(R.id.btn_6);
        btn7 = (Button) findViewById(R.id.btn_7);
        btn8 = (Button) findViewById(R.id.btn_8);
        btn9 = (Button) findViewById(R.id.btn_9);
        btnEntre = (Button) findViewById(R.id.btn_entre);
        btnIgu = (Button) findViewById(R.id.btn_igu);
        btnMas = (Button) findViewById(R.id.btn_mas);
        btnMenos = (Button) findViewById(R.id.btn_menos);
        btnPor = (Button) findViewById(R.id.btn_por);
        btnPunt = (Button) findViewById(R.id.btn_punt);
        btnSign = (Button) findViewById(R.id.btn_sig);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(banderaOperacion==true){
                    txtResul.setText("");
                    banderaOperacion=false;
                    banderaOperador=true;
                    banderaPunto=true;
                }
                txtResul.setText(txtResul.getText()+"0");

            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(banderaOperacion==true){
                    txtResul.setText("");
                    banderaOperacion=false;
                    banderaOperador=true;
                    banderaPunto=true;
                }
                txtResul.setText(txtResul.getText()+"1");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(banderaOperacion==true){
                    txtResul.setText("");
                    banderaOperacion=false;
                    banderaOperador=true;
                    banderaPunto=true;
                }
                txtResul.setText(txtResul.getText()+"2");

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(banderaOperacion==true){
                    txtResul.setText("");
                    banderaOperacion=false;
                    banderaOperador=true;
                    banderaPunto=true;
                }
                txtResul.setText(txtResul.getText()+"3");

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(banderaOperacion==true){
                    txtResul.setText("");
                    banderaOperacion=false;
                    banderaOperador=true;
                    banderaPunto=true;
                }
                txtResul.setText(txtResul.getText()+"4");

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(banderaOperacion==true){
                    txtResul.setText("");
                    banderaOperacion=false;
                    banderaOperador=true;
                    banderaPunto=true;
                }
                txtResul.setText(txtResul.getText()+"5");

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(banderaOperacion==true){
                    txtResul.setText("");
                    banderaOperacion=false;
                    banderaOperador=true;
                    banderaPunto=true;
                }
                txtResul.setText(txtResul.getText()+"6");

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(banderaOperacion==true){
                    txtResul.setText("");
                    banderaOperacion=false;
                    banderaOperador=true;
                    banderaPunto=true;
                }
                txtResul.setText(txtResul.getText()+"7");

            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(banderaOperacion==true){
                    txtResul.setText("");
                    banderaOperacion=false;
                    banderaOperador=true;
                    banderaPunto=true;
                }
                txtResul.setText(txtResul.getText()+"8");

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(banderaOperacion==true){
                    txtResul.setText("");
                    banderaOperacion=false;
                    banderaOperador=true;
                    banderaPunto=true;
                }
                txtResul.setText(txtResul.getText()+"9");

            }
        });
        btnSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtResul.setText(""+Double.parseDouble(txtResul.getText().toString())*-1);

            }
        });
        btnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(banderaOperador) {
                    num1 = Double.parseDouble(txtResul.getText().toString());
                    codOper = 1;
                    txtResul.setText("");
                }
                banderaOperador=false;
            }
        });
        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(banderaOperador) {
                    num1 = Double.parseDouble(txtResul.getText().toString());
                    codOper = 2;
                    txtResul.setText("");
                }
                banderaOperador=false;

            }
        });
        btnEntre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(banderaOperador) {
                    num1 = Double.parseDouble(txtResul.getText().toString());
                    codOper = 3;
                    txtResul.setText("");
                }
                banderaOperador=false;

            }
        });
        btnPor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(banderaOperador) {
                    num1 = Double.parseDouble(txtResul.getText().toString());
                    codOper = 4;
                    txtResul.setText("");
                }
                banderaOperador=false;

            }
        });
        btnPunt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(banderaOperacion==true){
                    txtResul.setText("");
                    banderaOperacion=false;
                    banderaOperador=true;
                    banderaPunto=true;
                }
                if(banderaPunto) {
                    txtResul.setText(txtResul.getText().toString()+".");
                }
                banderaPunto=false;

            }
        });

        btnIgu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (codOper){
                    case 1: txtResul.setText(""+(num1+Double.parseDouble(txtResul.getText().toString())));
                        banderaOperador=true;
                        break;
                    case 2:txtResul.setText(""+(num1-Double.parseDouble(txtResul.getText().toString())));
                        banderaOperador=true;
                        break;
                    case 3:txtResul.setText(""+(num1/Double.parseDouble(txtResul.getText().toString())));
                        banderaOperador=true;
                        break;
                    case 4:txtResul.setText(""+(num1*Double.parseDouble(txtResul.getText().toString())));
                        banderaOperador=true;
                        break;
                }
                banderaOperacion=true;

            }
        });
    }


}
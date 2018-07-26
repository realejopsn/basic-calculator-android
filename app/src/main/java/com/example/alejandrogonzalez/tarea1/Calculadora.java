package com.example.alejandrogonzalez.tarea1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {


    EditText etNum1, etNum2;
    TextView tvSalida;
    RadioButton rbsuma, rbresta, rbmultiplica, rbdivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        etNum1 = (EditText)findViewById(R.id.etNum1);
        etNum2 = (EditText)findViewById(R.id.etNum2);
        tvSalida = (TextView)findViewById(R.id.tvSalida);
        rbsuma = (RadioButton)findViewById(R.id.rbsuma);
        rbresta = (RadioButton)findViewById(R.id.rbresta);
        rbmultiplica = (RadioButton)findViewById(R.id.rbmultiplica);
        rbdivide = (RadioButton)findViewById(R.id.rbdivide);
    }

    public void operacion (View view) {

        if (rbsuma.isChecked() ) {
            suma(view);
        } else
        if (rbresta.isChecked()) {
            resta(view);
        }
        if (rbmultiplica.isChecked()) {
            multiplica(view);
        }
        if (rbdivide.isChecked()) {
            divide(view);
        }
    }

    public void suma (View view) {
        int num1 = Integer.parseInt(etNum1.getText().toString());
        int num2 = Integer.parseInt(etNum2.getText().toString());
        int suma = num1 + num2;
        String salida = String.format(getString(R.string.tvSalida).toString(), suma);
        tvSalida.setText(salida);
        tvSalida.setVisibility(view.getVisibility());
    }

    public void resta( View view) {
        int num1 = Integer.parseInt(etNum1.getText().toString());
        int num2 = Integer.parseInt(etNum2.getText().toString());
        int resta = num1 - num2;
        String salida = String.format(getString(R.string.tvSalida).toString(), resta);
        tvSalida.setText(salida);
        tvSalida.setVisibility(view.getVisibility());
    }

    public void multiplica( View view) {
        int num1 = Integer.parseInt(etNum1.getText().toString());
        int num2 = Integer.parseInt(etNum2.getText().toString());
        int multiplica = num1 * num2;
        String salida = String.format(getString(R.string.tvSalida).toString(), multiplica);
        tvSalida.setText(salida);
        tvSalida.setVisibility(view.getVisibility());

    }

    public void divide( View view) {
        int num1 = Integer.parseInt(etNum1.getText().toString());
        int num2 = Integer.parseInt(etNum2.getText().toString());

        if (num2 > 0){
            int divide = num1 / num2;
            String salida = String.format(getString(R.string.tvSalida).toString(), divide);
            tvSalida.setText(salida);
            tvSalida.setVisibility(view.getVisibility());
        } else {
            tvSalida.setText("No se puede dividir");
            tvSalida.setVisibility(view.getVisibility());
        }
    }
}

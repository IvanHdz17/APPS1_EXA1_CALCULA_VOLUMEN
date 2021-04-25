package com.example.exa1_calcula_volumen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtVw;
    EditText edtTxtnum;
    SeekBar seekBar;
    ImageView imgVw;
    Button btnCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgVw = findViewById(R.id.imgVw);
        imgVw.setImageResource(R.drawable.img4);
        edtTxtnum = findViewById(R.id.edtTxtnum);
        txtVw = findViewById(R.id.txtVw);
        seekBar = findViewById(R.id.seekBar);
        btnCalc = findViewById(R.id.btnCalc);

        btnCalc.setOnClickListener(this);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txtVw.setText("" + progress);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

    //Mostrar Resultado Boton
    @Override
    public void onClick(View v) {

        //Obtener Valor del Radio
        String txt = edtTxtnum.getText().toString();
        double radio = Double.parseDouble(txt);


        //Obtener Valor del Angulo
        String txt2 = txtVw.getText().toString();
        double Angulo = Double.parseDouble(txt2);

        //Calculo del Volumen
        double volumen;
        volumen = (0.6666666666666667*(radio*Angulo*3));

        Toast.makeText(this, "El resultado es: " + volumen, Toast.LENGTH_SHORT).show();
    }
}
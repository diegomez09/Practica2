package com.example.practica2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Toast.makeText(this, "Aprobado.", Toast.LENGTH_SHORT).show();
        et1 = (EditText)findViewById(R.id.txt);
        btn1 = (Button)findViewById(R.id.btn);
    }

    //Este metodo toma el string "Nombre"
    public void nombre(View view){
        String nombre = et1.getText().toString();
        Toast.makeText(this, "Tu nombre es: " + nombre, Toast.LENGTH_SHORT).show();
    }
}

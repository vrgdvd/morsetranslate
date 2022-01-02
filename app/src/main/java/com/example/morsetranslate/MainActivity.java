package com.example.morsetranslate;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        textView.setText(convert(editText.getText().toString()));
        button  = findViewById(R.id.button1);


        button.setOnClickListener(v -> textView.setText(convert(editText.getText().toString())));


    }
    public String convert(String text){
        String temp = text.toUpperCase(Locale.ROOT);

        temp = temp.replace("0",".--- ");
        temp = temp.replace("1","..--- ");
        temp = temp.replace("2","...-- ");
        temp = temp.replace("3","....- ");
        temp = temp.replace("4","..... ");
        temp = temp.replace("5","-.... ");
        temp = temp.replace("6","--... ");
        temp = temp.replace("7","---.. ");
        temp = temp.replace("8","---.. ");
        temp = temp.replace("9","----. ");
        temp = temp.replace("0","----- ");

        temp = temp.replace("A",".- ");
        temp = temp.replace("B","-... ");
        temp = temp.replace("C","-.-. ");
        temp = temp.replace("D","-.. ");
        temp = temp.replace("E",". ");
        temp = temp.replace("F","..-. ");
        temp = temp.replace("G","--. ");
        temp = temp.replace("H",".... ");
        temp = temp.replace("I",".. ");
        temp = temp.replace("J",".--- ");
        temp = temp.replace("K","-.- ");
        temp = temp.replace("L",".-.. ");
        temp = temp.replace("M","-- ");
        temp = temp.replace("N","-. ");
        temp = temp.replace("O","--- ");
        temp = temp.replace("P",".--. ");
        temp = temp.replace("Q","--.- ");
        temp = temp.replace("R",".-. ");
        temp = temp.replace("S","... ");
        temp = temp.replace("T","- ");
        temp = temp.replace("U","..- ");
        temp = temp.replace("V","...- ");
        temp = temp.replace("W",".-- ");
        temp = temp.replace("X","-..- ");
        temp = temp.replace("Y","-.-- ");
        temp = temp.replace("Z","--.. ");

        return temp;


    }

}
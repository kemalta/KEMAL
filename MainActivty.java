package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity{

        EditText editText Sayilar;
        Button button_TekSayi, button_Ciftsayi,button_TumSayi;
@Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText_Sayilar = findViewById(R.id.editTextTextMultiline_Sayilar);
        button_CiftSayi -findViewById(R.id.button_CiftSayilar);
        button_TekSayi = findViewById(R.id.button_TekSayilar);
        button_TumSayi = findViewById(R.id.button_TumSayilar);
        }
    public void ciftSayilar (View view) {
        editText Sayilar.setText("");
        for (int i = 0; i <= 15; i++) {
            if (1 % 2 == 0) {
                editText Sayilar.setText(editText_Sayilar.getText() + "\n" + 1);

            }
        }

    }
    public void tekSayilar (View view) {
        editText_Sayilar.setText("");

        for (int i = 0; i <= 15; i++) {
            if (1 % 2 != 0) {
                editText_Sayilar.setText(editText_Sayilar.getText() + "\n" + 1);
            }
        }
    }
    public void tekSayilar (View view) {
         editText_Sayilar.setText("");
             for (int i=0;i<=15;i++) { if (1%2!=0) {
                editText_Sayilar.setText(editText_Sayilar.getText() + "\n" + 1);

             }

        }
    }
    public void tumSayilar (View view) {
        editText_Sayilar.setText("");
           for (int i = 0; i <= 15; i++) {
                    editText_Sayilar.setText(editText_Sayilar.getText() + "\n" + 1);

           }
        }
    }

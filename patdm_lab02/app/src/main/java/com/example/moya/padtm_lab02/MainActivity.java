package com.example.moya.padtm_lab02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Lab2", "metoda onCreate");
        Toast.makeText(this, "Metoda onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected  void onResume(){
        super.onResume();

        Log.d("Lab2", "metoda onResume");
        //lub
        Toast.makeText(this, "Metoda onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart(){
        super.onStart();

        Log.d("Lab2", "metoda onStart");
        //lub
        Toast.makeText(this,"Metoda onStart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause(){
        super.onPause();

        Log.d("Lab2", "metoda onPause");
        //lub
        Toast.makeText(this,"Metoda onPause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop(){
        super.onStop();

        Log.d("Lab2", "metoda onStop");
        //lub
        Toast.makeText(this,"Metoda onStop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        Log.d("Lab2", "metoda onDestroy");
        //lub
        Toast.makeText(this,"Metoda onDestroy", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();

        Log.d("Lab2", "metoda onRestart");
        //lub
        Toast.makeText(this,"Metoda onRestart", Toast.LENGTH_LONG).show();
    }
}

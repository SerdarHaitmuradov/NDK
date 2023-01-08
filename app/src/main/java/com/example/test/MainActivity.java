package com.example.test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.test.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity
{



    // Used to load the 'test' library on application startup.
    static
    {
        System.loadLibrary("test");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        EditText first = findViewById(R.id.first);
        EditText second = findViewById(R.id.second);
        Button press = findViewById(R.id.press);
        TextView res=findViewById(R.id.res);

        // Example of a call to a native method

        press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f=Integer.parseInt(first.getText().toString());
                int s=Integer.parseInt(second.getText().toString());
                int total=calcFormCPP(f,s);
                res.setText(String.valueOf(total));
            }
        });

    }


    public native int calcFormCPP(int f,int s);


}
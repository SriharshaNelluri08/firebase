package com.example.register;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button blogin,bregister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blogin=findViewById(R.id.login);
        bregister=findViewById(R.id.register);
        blogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                blogin.setVisibility(v.GONE);
                bregister.setVisibility(v.GONE);
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainpage,new loginfragment()).commit();
            }
        });
        bregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blogin.setVisibility(v.GONE);
                bregister.setVisibility(v.GONE);
                FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.mainpage,new registerfragment()).commit();
            }
        });
    }
}
package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld,txtHiWorld;
    private boolean isHi=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtHelloWorld=findViewById(R.id.txtHelloWorld);
        txtHiWorld=findViewById(R.id.txtHiWorld);

        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // txtHelloWorld.animate().alpha(0.1f).setDuration(3000);
//                txtHelloWorld.animate().alpha(0).setDuration(3000);
//                txtHiWorld.animate().alpha(1).setDuration(3000);
                if(isHi==true){
                    txtHiWorld.animate().alpha(0).setDuration(3000);
                    txtHelloWorld.animate().alpha(1).setDuration(3000);
                    isHi=false;
                }
                else{
                    txtHelloWorld.animate().alpha(0).setDuration(3000);
                    txtHiWorld.animate().alpha(1).setDuration(3000);
                    isHi=true;
                }
            }
        });
    }
}

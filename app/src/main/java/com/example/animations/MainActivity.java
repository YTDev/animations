package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtHelloWorld,txtHiWorld;
    TextView txtAndroid;
    private Button btn;
    private boolean isHi=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtHelloWorld=findViewById(R.id.txtHelloWorld);
        txtHiWorld=findViewById(R.id.txtHiWorld);
        txtAndroid=findViewById(R.id.txtAndroid);
        btn=findViewById(R.id.btn);

        txtHelloWorld.setX(2000);


        txtAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                txtAndroid.animate().translationX(30).setDuration(3000);
//                txtAndroid.animate().translationY(-10).setDuration(3000);
//                txtAndroid.animate().rotation(180).setDuration(3000);
//                txtAndroid.animate().rotationBy(30).setDuration(3000);
//                txtAndroid.animate().rotationX(180).setDuration(3000);
//                txtAndroid.animate().rotationX(360).translationY(1000).setDuration(5000);
//                txtAndroid.animate().scaleX(0.3f).scaleY(0.3f).setDuration(3000);

            }
        });

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
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtHelloWorld.animate().translationXBy(-2000).setDuration(3000);
            }
        });
    }



}

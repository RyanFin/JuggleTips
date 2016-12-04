package me.ryanfinlayson.juggletips;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        Thread myThread = new Thread(){
            @Override
            public void run() {
                try{
                    //3000 milliseconds -> 3 seconds
                    sleep(3000);
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    //destroy
                    finish();

                } catch (InterruptedException e){
                    e.printStackTrace();

                }

            }
        };
        //call run() method
        myThread.start();
    }
}

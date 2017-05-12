package com.onedreamers.lovecalculator;
/**
 * Created by Aman gautam on 25-Dec-16.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splashScreen extends Activity {
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(splashScreen.this, MainActivity.class);

                startActivity(i);

                // close this activity
                finish();
                System.out.println("loading....");
            }
        }, SPLASH_TIME_OUT);
    }
}

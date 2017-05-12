package com.onedreamers.lovecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import static java.sql.Types.NULL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }
    public void onClick(View v)
    {
        EditText e1=(EditText)findViewById(R.id.name1);
        EditText e2=(EditText)findViewById(R.id.name2);
        TextView t=(TextView)findViewById(R.id.result);
        String p1 = e1.getText().toString();
        String p2 = e2.getText().toString();
        String p0=p1;
        p1 = p1.concat(p2);
        String cap=p1.toLowerCase();
        int num = 0;

            for (char c : cap.toCharArray()) {
                num += (int) c;
            }
        if(num==0)
            t.setText("NO names found!!!!\nplease enter any name.....\n\n");
        else {
            int p = num % 100;
            t.setText("The love between " + p0 + " and " + p2 + " is " + p + "%\n\n");
        }
    }
}

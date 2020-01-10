package com.example.andorid_study_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EventExampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_example);

        Button button = (Button)findViewById(R.id.button2);
        button.setOnClickListener(

                new Button.OnClickListener(){
                    public  void onClick(View v){
                        TextView myTextView = (TextView)findViewById(R.id.textView2);
                        myTextView.setText("Button clicked");
                    }
                }
        );

        button.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    public boolean onLongClick(View v) {
                        TextView myTextView = (TextView)findViewById(R.id.textView2);
                        myTextView.setText("Long button click");
                        return false; //if true, no touch text not change but if false, no touch text change
                    }
                }
        );
    }
}

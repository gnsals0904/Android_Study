package com.example.andorid_study_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

public class FragmentExampleActivity extends FragmentActivity implements ToolbarFragment.ToolBarListener{

    
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_fragment_example);
        }

        public void onButtonClick(int fontsize, String text){

        }
    }


}

package com.example.andorid_study_1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;

import androidx.fragment.app.Fragment;


public class ToolbarFragment extends Fragment implements SeekBar.OnSeekBarChangeListener {

    private static int seekvalue = 10;
    private static EditText edittext;

    @Override
    public View onCreateView(LayoutInflater inflater , ViewGroup container, Bundle savedInstanceState) {

        //이 프래그먼트의 레이아웃을 인플레이트한다
        View view = inflater.inflate(R.layout.toolbar_fragment, container, false);

        edittext = (EditText) view.findViewById(R.id.editText10);
        final SeekBar seekBar = (SeekBar) view.findViewById(R.id.seekBar1);

        seekBar.setOnSeekBarChangeListener(this);

        final Button button = (Button) view.findViewById(R.id.button10);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                buttonClicked(v);
            }
        });


        return view;
    }

    private void buttonClicked(View v) {
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        seekvalue = progress;
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}

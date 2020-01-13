package com.example.andorid_study_1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class TextFragment extends Fragment {

    private static TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.text_fragment,
                container, false);

        textView = (TextView) view.findViewById(R.id.textView10);

        return view;
    }

    public void changeTextProperties(int fontsize, String text){
        textView.setTextSize(fontsize);
        textView.setText(text);
    }
}

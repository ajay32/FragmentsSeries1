package com.hackingbuzz.fragments;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Avi Hacker on 8/18/2016.
 */
public class Fragment1 extends Fragment implements View.OnClickListener {

    Button b4;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag1,container,false);   // false because we already attaching xml by inflater..we dont need to attach it again by anyother way..
    }


    // on ActivtyCreated you can initilize your button or anything (methods) that are of Appcompact Acitivity...

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        b4 =(Button) getActivity().findViewById(R.id.button4);
        b4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getActivity(),MainActivity2Activity.class);
        startActivity(intent);
    }
}

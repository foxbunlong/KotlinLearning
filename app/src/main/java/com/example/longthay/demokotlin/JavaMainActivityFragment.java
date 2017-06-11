package com.example.longthay.demokotlin;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.longthay.demokotlin.interfaces.JavaListener;

/**
 * A placeholder fragment containing a simple view.
 */
public class JavaMainActivityFragment extends Fragment {

    private JavaListener javaListener;

    public JavaMainActivityFragment() {
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        javaListener = (JavaListener) activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_java_main, container, false);
    }
}

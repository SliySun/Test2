package com.example.sun.test;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements BlankFragment2.OnFragmentInteractionListener{

    private BlankFragment2 fragment;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView= (TextView) findViewById(R.id.textView_helloworld);
        addContentLayout();
    }

    private void addContentLayout() {
        FragmentManager manger=getFragmentManager();
        FragmentTransaction transaction=manger.beginTransaction();
        fragment=BlankFragment2.newInstance(null,null);
        transaction.add(R.id.fragment_content,fragment);
        transaction.commit();
    }

    @Override
    public void changeValue(String value) {
        textView.setText(value);
    }
}

package com.hackingbuzz.fragments;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

// always relplace parent of particular fragment
//Actually a big myth...we dont relace activity at all....as much as we just replace fragment if ( we say transaction.replace) or we just add a fragment to another fragment if(transaction.add ) we do
// and our main activity stays below always no replace ( as base for fragemnt)
// 2 things done on fragemnt 1.) repace or add a fragemnt onto another (stack form )...if you add then you can go back to 1 fragment below by popback stack..
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

  public void a(View view) {
      Fragment1 f1 = new Fragment1();
      FragmentManager manager = getFragmentManager();
      FragmentTransaction transaction = manager.beginTransaction();
      transaction.replace(R.id.base_layout,f1,"frag1");   // here 1st parameter tell thell base layout onto we gonna put on our fragments..
      transaction.commit();

  }

    public void b(View view) {
        Fragment2 f2 = new Fragment2();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.base_layout,f2,"frag2");
        transaction.commit();


    }

    public void c(View view) {
        Fragment3 f3 = new Fragment3();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.base_layout,f3,"frag3");
        transaction.commit();


    }
}

// here we just replacing fragments ... ...we make them white ..so ..you know if they are white color n they get add onto each other..it will clearly show
// if they have background color n they get add ..even then it will feel like they replaced..

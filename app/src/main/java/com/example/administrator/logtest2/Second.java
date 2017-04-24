package com.example.administrator.logtest2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Administrator on 2017/3/30.
 */

public class Second extends Activity{
    private static final String LIFT_TAG="First";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.v(Second.LIFT_TAG,"Second Activity---> OnCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);
    }
    @Override
    protected void onDestroy() {
        Log.v(Second.LIFT_TAG,"Second Activity---> OnDestroy");
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        Log.v(Second.LIFT_TAG,"Second Activity---> OnStop");
        super.onStop();
    }

    @Override
    protected void onPause() {
        Log.v(Second.LIFT_TAG,"Secondt Activity---> OnPause");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.v(Second.LIFT_TAG,"Second Activity---> OnResume");
        super.onResume();
    }

    @Override
    protected void onStart() {
        Log.v(Second.LIFT_TAG,"Second Activity---> OnStart");
        super.onStart();
    }
    protected  void onRestart(){
        Log.v(Second.LIFT_TAG,"Second Activity---> OnRestart");
        super.onStart();
    }
}

package com.example.administrator.logtest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Button;

public class First extends AppCompatActivity {
static final String LIFT_TAG="First";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        Log.v(First.LIFT_TAG,"First Activity---> OnCreate");
        Button go=(Button)findViewById(R.id.go);
        go.setOnClickListener(new ButtonOnClickListener());
    }
    class ButtonOnClickListener implements OnClickListener {
        @Override
        public void onClick(View v){
            Intent intent=new Intent();
            intent.setClass(First.this,Second.class);
            First.this.startActivity(intent);
        }
    }

    @Override
    protected void onDestroy() {
        Log.v(First.LIFT_TAG,"First Activity---> OnDestroy");
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        Log.v(First.LIFT_TAG,"First Activity---> OnStop");
        super.onStop();
    }

    @Override
    protected void onPause() {
        Log.v(First.LIFT_TAG,"First Activity---> OnPause");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.v(First.LIFT_TAG,"First Activity---> OnResume");
        super.onResume();
    }

    @Override
    protected void onStart() {
        Log.v(First.LIFT_TAG,"First Activity---> OnStart");
        super.onStart();
    }
    protected  void onRestart(){
        Log.v(First.LIFT_TAG,"First Activity---> OnRestart");
        super.onStart();
    }
}

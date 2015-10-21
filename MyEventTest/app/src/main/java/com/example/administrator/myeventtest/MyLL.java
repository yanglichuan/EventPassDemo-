package com.example.administrator.myeventtest;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class MyLL extends LinearLayout {
    public MyLL(Context context) {
        super(context);
    }

    public MyLL(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLL(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.i("ydh", "MyLL1111  ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.i("ydh", "MyLL1111  ACTION_MOVE");

                break;

            case MotionEvent.ACTION_UP:
                Log.i("ydh", "MyLL1111  ACTION_UP");
                break;
        }
        return true;
        /**
         * 如果事件分发返回true，
         * 表示改事件在本层不再进行分发且已经在事件分发自身中被消费了。
         * 至此，事件已经完结。如果你不想Activity中的任何控件具有任何的事件消费能力
         */
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.i("ydh", "MyLL22222  ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.i("ydh", "MyLL22222  ACTION_MOVE");

                break;

            case MotionEvent.ACTION_UP:
                Log.i("ydh", "MyLL22222  ACTION_UP");
                break;
        }
        return false;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.i("ydh", "MyLL333  ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.i("ydh", "MyLL333  ACTION_MOVE");
                break;

            case MotionEvent.ACTION_UP:
                Log.i("ydh", "MyLL333  ACTION_UP");
                break;
        }
        return true;
    }





}

package com.example.administrator.myeventtest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyTextV extends TextView {
    public MyTextV(Context context) {
        super(context);
    }

    public MyTextV(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextV(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.i("ydh", "MyTextV1111  ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.i("ydh", "MyTextV1111  ACTION_MOVE");

                break;

            case MotionEvent.ACTION_UP:
                Log.i("ydh", "MyTextV1111  ACTION_UP");
                break;
        }
        return super.dispatchTouchEvent(ev);
    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.i("ydh", "MyTextV333  ACTION_DOWN");
                break;

            case MotionEvent.ACTION_MOVE:
                Log.i("ydh", "MyTextV333  ACTION_MOVE");

                break;

            case MotionEvent.ACTION_UP:
                Log.i("ydh", " MyTextV333 ACTION_UP");
                break;
        }
        return false;
    }
}

//        后续的事件就不会传递过来了
//        10-21 10:28:23.352    9816-9816/com.example.administrator.myeventtest I/ydh﹕ MyLL333  ACTION_DOWN
//        10-21 10:28:26.632    9816-9816/com.example.administrator.myeventtest I/ydh﹕ MyLL1111  ACTION_DOWN
//        10-21 10:28:26.632    9816-9816/com.example.administrator.myeventtest I/ydh﹕ MyLL22222  ACTION_DOWN
//        10-21 10:28:26.632    9816-9816/com.example.administrator.myeventtest I/ydh﹕ MyTextV1111  ACTION_DOWN
//        10-21 10:28:26.632    9816-9816/com.example.administrator.myeventtest I/ydh﹕ MyTextV333  ACTION_DOWN
//        10-21 10:28:26.632    9816-9816/com.example.administrator.myeventtest I/ydh﹕ MyLL333  ACTION_DOW



//        后续的事件都会经过同样的路径过来
//        10-21 10:29:39.302  12692-12692/com.example.administrator.myeventtest I/ydh﹕ MyLL1111  ACTION_DOWN
//        10-21 10:29:39.302  12692-12692/com.example.administrator.myeventtest I/ydh﹕ MyLL22222  ACTION_DOWN
//        10-21 10:29:39.302  12692-12692/com.example.administrator.myeventtest I/ydh﹕ MyTextV1111  ACTION_DOWN
//        10-21 10:29:39.302  12692-12692/com.example.administrator.myeventtest I/ydh﹕ MyTextV333  ACTION_DOWN
//        10-21 10:29:39.372  12692-12692/com.example.administrator.myeventtest I/ydh﹕ MyLL1111  ACTION_MOVE
//        10-21 10:29:39.372  12692-12692/com.example.administrator.myeventtest I/ydh﹕ MyLL22222  ACTION_MOVE
//        10-21 10:29:39.372  12692-12692/com.example.administrator.myeventtest I/ydh﹕ MyTextV1111  ACTION_MOVE
//        10-21 10:29:39.372  12692-12692/com.example.administrator.myeventtest I/ydh﹕ MyTextV333  ACTION_MOVE
//        10-21 10:29:39.392  12692-12692/com.example.administrator.myeventtest I/ydh﹕ MyLL1111  ACTION_MOVE
//        10-21 10:29:39.392  12692-12692/com.example.administrator.myeventtest I/ydh﹕ MyLL22222  ACTION_MOVE
//        10-21 10:29:39.392  12692-12692/com.example.administrator.myeventtest I/ydh﹕ MyTextV1111  ACTION_MOVE
//        10-21 10:29:39.392  12692-12692/com.example.administrator.myeventtest I/ydh﹕ MyTextV333  ACTION_MOVE
//        10-21 10:29:39.542  12692-12692/com.example.administrator.myeventtest I/ydh﹕ MyLL1111  ACTION_MOVE
//        10-21 10:29:39.542  12692-12692/com.example.administrator.myeventtest I/ydh﹕ MyLL22222  ACTION_MOVE
//        10-21 10:29:39.542  12692-12692/com.example.administrator.myeventtest I/ydh﹕ MyTextV1111  ACTION_MOVE
//        10-21 10:29:39.542  12692-12692/com.example.administrator.myeventtest I/ydh﹕ MyTextV333  ACTION_MOVE
//        10-21 10:29:39.542  12692-12692/com.example.administrator.myeventtest I/ydh﹕ MyLL1111  ACTION_UP
//        10-21 10:29:39.542  12692-12692/com.example.administrator.myeventtest I/ydh﹕ MyLL22222  ACTION_UP
//        10-21 10:29:39.542  12692-12692/com.example.administrator.myeventtest I/ydh﹕ MyTextV1111  ACTION_UP
//        10-21 10:29:39.542  12692-12692/com.example.administrator.myeventtest I/ydh﹕ MyTextV333  ACTION_UP






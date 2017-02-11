package com.example.sun.test;

import android.util.Log;

/**
 * Created by sun on 2017/1/18.
 */

public class LogUtils {


    private static boolean enablelog=true;

    public static void v(String tag,String msg){
        if (enablelog)
        Log.v(tag,msg);
    }
    public static void d(String tag,String msg){
        if (enablelog)
        Log.d(tag,msg);
    }

    public static void i(String tag,String msg){
        if (enablelog)
        Log.i(tag,msg);
    }

    public static void w(String tag,String msg){
        if (enablelog)
        Log.w(tag,msg);
    }

    public static void e(String tag,String msg){
        if (enablelog)
        Log.e(tag,msg);
    }
}

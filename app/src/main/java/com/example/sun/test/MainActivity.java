package com.example.sun.test;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.Formatter;
import android.util.Log;
import android.widget.TextView;


/**
 * fragment onAttach() 测试及github更新版本测试
 */
public class MainActivity extends AppCompatActivity implements BlankFragment2.OnFragmentInteractionListener{

    private BlankFragment2 fragment;
    private TextView textView;

    private String tag="com.example.sun.test";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //tag：标签; msg ：信息
        LogUtils.v(tag,"我是v级别");
        LogUtils.d(tag,"我是d级别");
        LogUtils.i(tag,"我是i级别");
        LogUtils.w(tag,"我是w级别");
        LogUtils.e(tag,"我是e级别");

        //判断sdcard 状态是否正常
//        Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);

        //获取文件目录对象剩余空间
//        long usableSpace = Environment.getExternalStorageDirectory().getUsableSpace();
        //sdcard 总大小
//        Environment.getExternalStorageDirectory().getTotalSpace();
        //将一个long类型的文件大小格式化成用户可以看懂的M,G字符串
//        String str=Formatter.formatFileSize(this,usableSpace);

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

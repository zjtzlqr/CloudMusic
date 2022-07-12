package com.example.zhongke.cloudmusic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String value = "3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        Log.i("TAG", "bbb is sstart");
        String b = null;
        boolean bbb = value.equals(b);
        Log.i("TAG", "bbb is " +bbb);
    }

    private void init(){
        Log.i("zk2021", "20220708");
        Log.i("zk2021", "20220708zkzkzk");
        Log.i("zk2021", "wyl20220708xiugai");

        Log.i("zk2021", "zijixiugi");
    }
}

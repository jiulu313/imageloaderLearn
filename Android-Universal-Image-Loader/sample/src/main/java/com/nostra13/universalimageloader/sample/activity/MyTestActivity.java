package com.nostra13.universalimageloader.sample.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.sample.R;

/**
 * Created by zhanghongjun on 2017/11/14.
 */

public class MyTestActivity extends Activity{
    ImageView imageView;
    Button btnShow;


    String url = "http://img4.ph.126.net/KZ0FRGY2Xgy7Jbego4QZjg==/1308014216791553844.jpg";


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_my_test);
        initView();

        initEvent();

        initData();
    }

    void initView(){
        imageView = (ImageView) findViewById(R.id.image);
        btnShow = (Button) findViewById(R.id.btn_showimg);
    }

    void initEvent(){
        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageLoader.getInstance().displayImage(url,imageView);
            }
        });
    }

    private void initData() {

    }

}

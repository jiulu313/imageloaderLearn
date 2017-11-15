package com.nostra13.universalimageloader.sample.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.sample.R;

/**
 * Created by zhanghongjun on 2017/11/14.
 */

public class MyTestActivity extends Activity{
    ImageView imageView;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_my_test);
        imageView = (ImageView) findViewById(R.id.image);

        String url = "http://img4.ph.126.net/KZ0FRGY2Xgy7Jbego4QZjg==/1308014216791553844.jpg";

        ImageLoader.getInstance().displayImage(url,imageView);

    }
}

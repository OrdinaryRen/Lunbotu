package com.example.lunbotu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Banner banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //图片加载集合
        List<Integer> imageArray = new ArrayList<>();
        imageArray.add(R.mipmap.ls_banner_big);
        imageArray.add(R.mipmap.ls_banner_big);
        imageArray.add(R.mipmap.ls_banner_big);
        //绑定
        banner = (Banner)findViewById(R.id.bn_tu);
        //设置Banner样式
        banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR);  //圆形
        //设置图片加载器
        banner.setImageLoader(new Glideimage());
        //设置图片集合
        banner.setImages(imageArray);
        //设置Banner动画效果
        banner.setBannerAnimation(Transformer.Accordion);
        //设置时间
        banner.setDelayTime(3000);
        //设置圆点指示器位置
        banner.setIndicatorGravity(BannerConfig.CENTER);
        banner.start();
    }
}

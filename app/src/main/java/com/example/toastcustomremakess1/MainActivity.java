package com.example.toastcustomremakess1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.toastcustomremakess1.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends baseACT<ActivityMainBinding> {


    @Override
    protected void initViews() {
        binding.icFace1.setOnClickListener(this);
        binding.icFace2.setOnClickListener(this);
        binding.icFace3.setOnClickListener(this);
        binding.icFace4.setOnClickListener(this);
        binding.icFace5.setOnClickListener(this);
        binding.icFace6.setOnClickListener(this);
        binding.icFace7.setOnClickListener(this);
        binding.icFace8.setOnClickListener(this);
        binding.icFace9.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);

        String text = v.getContentDescription().toString() ;
        Drawable drawable = ((ImageView)v).getDrawable() ;
            showToast(text,drawable);


    }

    private void showToast(String text, Drawable drawable) {
        Toast toast = new Toast(this);

        View v = LayoutInflater.from(this).inflate(R.layout.item_toast,null);
        ImageView iv_face = v.findViewById(R.id.iv_face);
        TextView tv_face =v.findViewById(R.id.tv_face) ;


        iv_face.setImageDrawable(drawable);
        tv_face.setText(text);
        toast.setView(v);

        int wScreen =getResources().getDisplayMetrics().widthPixels ;
        int hScreen =getResources().getDisplayMetrics().heightPixels ;
        Random rd = new Random() ;
        int x = rd.nextInt(wScreen);
        int y = rd.nextInt(hScreen);

        toast.setGravity(Gravity.TOP|Gravity.START,x,y);

        toast.show();

    }

    @Override
    protected ActivityMainBinding InitViewBinding() {
        return ActivityMainBinding.inflate(getLayoutInflater());
    }
}
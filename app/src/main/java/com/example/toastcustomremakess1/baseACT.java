package com.example.toastcustomremakess1;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewbinding.ViewBinding;

public abstract class baseACT <T extends ViewBinding> extends AppCompatActivity implements View.OnClickListener  {
    protected T binding ;
    @Override
    public void onClick(View v) {
        v.startAnimation(AnimationUtils.loadAnimation(this, androidx.appcompat.R.anim.abc_fade_in));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = InitViewBinding(); 
        setContentView(binding.getRoot());
        initViews();
    }

    protected abstract void initViews();

    protected abstract T InitViewBinding();

}

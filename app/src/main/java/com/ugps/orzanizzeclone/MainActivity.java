package com.ugps.orzanizzeclone;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.ugps.orzanizzeclone.activity.CadastroActivity;
import com.ugps.orzanizzeclone.activity.LoginActivity;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setButtonBackVisible(false);
        setButtonNextVisible(false);

        addSlide( new FragmentSlide.Builder()
                    .background(android.R.color.white)
                    .fragment(R.layout.intro_1)
                    .build()
        );

        addSlide( new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_2)
                .build()
        );

        addSlide( new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_3)
                .build()
        );

        addSlide( new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_4)
                .build()
        );

        addSlide( new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_cadastro)
                .canGoBackward(false)
                .canGoForward(false)
                .build()
        );
    }

    public void buttonEntrar(View view){
        startActivity(new Intent(this, LoginActivity.class));
    }

    public void buttonCadastrar(View view){
        startActivity(new Intent(this, CadastroActivity.class));
    }




}
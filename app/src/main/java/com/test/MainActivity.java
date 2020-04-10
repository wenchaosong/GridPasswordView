package com.test;

import android.app.Activity;
import android.os.Bundle;

import com.ms.gridpasswordview.GridPasswordView;

public class MainActivity extends Activity {

    private GridPasswordView mGridPasswordView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGridPasswordView = findViewById(R.id.pswView);

        mGridPasswordView.setOnPasswordChangedListener(new GridPasswordView.OnPasswordChangedListener() {
            @Override
            public void onTextChanged(String psw) {

            }

            @Override
            public void onInputFinish(String psw) {

            }
        });
    }

}

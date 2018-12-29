package com.thekey.tinkerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnLoad;
    private Button btnKill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLoad = findViewById(R.id.btn_load);
        btnKill = findViewById(R.id.btn_kill);

        btnLoad.setOnClickListener(this);
        btnKill.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_load:
                loadPatch();
                break;
            case R.id.btn_kill:
                killApp();
                break;
            default:
                break;
        }
    }

    /**
     * 加载热补丁插件
     */
    private void loadPatch(){

    }

    /**
     * 杀死应用加载补丁
     */
    private void killApp(){
        android.os.Process.killProcess(android.os.Process.myPid());
    }


}

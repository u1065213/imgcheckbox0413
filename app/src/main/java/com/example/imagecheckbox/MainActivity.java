package com.example.imagecheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOK(View view) {
        CheckBox chk;

        ImageView imageView5,imageView6,imageView7,imageView8;

        imageView5 =findViewById(R.id.imageView5);
        imageView6 =findViewById(R.id.imageView6);
        imageView7 =findViewById(R.id.imageView7);
        imageView8 =findViewById(R.id.imageView8);
        

        int[] id = {R.id.checkBox,R.id.checkBox2,R.id.checkBox3,R.id.checkBox4};

        findViewById(R.id.imageView5).setVisibility(View.GONE);
        findViewById(R.id.imageView6).setVisibility(View.GONE);
        findViewById(R.id.imageView7).setVisibility(View.GONE);
        findViewById(R.id.imageView8).setVisibility(View.GONE);

        for(int i:id){
            chk =(CheckBox)findViewById(i);

            if(chk.isChecked()){
                if(chk.getId()==R.id.checkBox)
                    findViewById(R.id.imageView5).setVisibility(View.VISIBLE);
                if(chk.getId()==R.id.checkBox2)
                    findViewById(R.id.imageView6).setVisibility(View.VISIBLE);
                if(chk.getId()==R.id.checkBox3)
                    findViewById(R.id.imageView7).setVisibility(View.VISIBLE);
                if(chk.getId()==R.id.checkBox4)
                    findViewById(R.id.imageView8).setVisibility(View.VISIBLE);
            }
        }
    }
}

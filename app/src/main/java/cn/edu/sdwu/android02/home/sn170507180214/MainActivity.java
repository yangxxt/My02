package cn.edu.sdwu.android02.home.sn170507180214;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_homework);
    }
    public  void startMain01(View view){
        Intent intent=new Intent(this,homework01.class);
        startActivity(intent);
    }
    public  void startMain02(View view){
        Intent intent=new Intent(this,homework02.class);
        startActivity(intent);
    }
    public  void startMain03(View view){
        Intent intent=new Intent(this,homework03.class);
        startActivity(intent);
    }

}

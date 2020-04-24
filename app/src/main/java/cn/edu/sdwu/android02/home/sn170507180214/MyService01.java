package cn.edu.sdwu.android02.home.sn170507180214;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

import java.util.Random;

public class MyService01 extends Service {
    private Random random;
    private MyBinder myBinder;
    @Override
    public void onCreate() {
        super.onCreate();
        random=new Random();
        myBinder=new MyBinder();
    }
    public MyService01() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        //返回值，会返回给调用者以后调用者与服务进行交互，都使用此返回值
        // TODO: Return the communication channel to the service.
        Log.i(MyService01.class.toString(),"onBind");
        return myBinder;

    }

    @Override
    public boolean onUnbind(Intent intent) {
        Log.i(MyService01.class.toString(),"onUnbind");
        return super.onUnbind(intent);
    }

    @Override
    public void onDestroy() {
        Log.i(MyService01.class.toString(),"onDestroy");
        super.onDestroy();
    }

    public class MyBinder extends Binder {
        public  MyService01 getRandomService(){
            return  MyService01.this;
        }
    }
    //实际与调用者进行交互的方法
    public int genRandom(){
        return random.nextInt();
    }
}

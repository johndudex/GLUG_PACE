package glugpace.org.glug_pace;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;


public class SplashScreen extends Activity {
    private boolean BackBtnPressed;
    private static final int SplashDuration=3000;
    private Handler MyHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_ACTION_BAR);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.splashscreen);
        MyHandler =new Handler();
        MyHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();

                if(!BackBtnPressed)
                {
                    Intent intent=new Intent(SplashScreen.this,MainActivity.class);
                    SplashScreen.this.startActivity(intent);


                }
            }
        },SplashDuration);

    }

    @Override
    public void onBackPressed() {
        BackBtnPressed=true;
        super.onBackPressed();
    }
}

package ndkold.study.com.ndkolddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Java2CJNI java2CJNI = new Java2CJNI();
        String s = java2CJNI.java2C();

        Log.e("ccc",s);
    }
}

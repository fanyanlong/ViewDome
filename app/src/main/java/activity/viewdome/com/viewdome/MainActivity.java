package activity.viewdome.com.viewdome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mViewbu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewbu= (Button) findViewById(R.id.view_bu);
        mViewbu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent   mIntent=new Intent();
                mIntent.setClass(MainActivity.this,MotionEventActivity.class);
                startActivity(mIntent);

            }
        });



    }
}

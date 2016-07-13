package testsdcard.com.maiyu.menutest;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by maiyu on 2016/7/12.
 */
public class FirstActivity extends Activity {
    private Button button1 , button2 , button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        findView();
        setListener();
    }

    private void setListener() {
        button1.setOnClickListener(mylistener);
        button2.setOnClickListener(mylistener);
        button3.setOnClickListener(mylistener);
    };
        View.OnClickListener mylistener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.button1:
                        Intent intent = new Intent (FirstActivity.this , MainActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.button2:
                        Intent intent2 = new Intent (FirstActivity.this , SecondActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.button3:
                        Intent intent3 = new Intent (FirstActivity.this , ThirdActivity.class);
                        startActivity(intent3);
                        break;
                }

            }
        };


    private void findView() {
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
    }
}

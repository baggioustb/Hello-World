package com.yangjun.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HelloWorldActivity extends Activity {
    /** Called when the activity is first created. */
	Button btn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				
			}
		});
    }
}
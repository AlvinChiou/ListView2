package com.org.ListView;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MyActivity extends Activity {
    private ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}

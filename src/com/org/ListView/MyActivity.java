package com.org.ListView;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class MyActivity extends Activity {
    private ListView listView;
//    private class ImageTextAdapter extends BaseAdapter{
//        private LayoutInflater layoutInflater;
//    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}

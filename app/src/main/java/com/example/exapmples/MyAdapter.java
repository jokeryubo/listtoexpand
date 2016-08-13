package com.example.exapmples;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.List;

/**
 * Created by yubo on 2016/8/12.
 */
public class MyAdapter extends BaseAdapter {
    private Context context;
    private List<String> list;

    public MyAdapter(Context context , List<String> list){
        this.context=context;
        this.list=list;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.listitem ,null);
            RadioButton rb=(RadioButton) convertView.findViewById(R.id.rd);
            TextView item_name=(TextView) convertView.findViewById(R.id.item_name);
            item_name.setText(list.get(position));
        }
        return convertView;
    }
}

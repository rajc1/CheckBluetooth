package com.example.chetanrajjain.checkbluetooth;

import android.app.ListFragment;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyarrayAdapter extends ArrayAdapter{
    Context context;
    TextView textView;
    TextView textView1;
    ArrayList<Devices> arrayList;
    public MyarrayAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Devices> objects) {
        super(context, resource, objects);
        this.context = context;
        this.arrayList = objects;

    }

    public View getView(int position, View view, ViewGroup parent){
        View v = LayoutInflater.from(context).inflate(R.layout.each_device_name,parent,false);

        textView = (TextView)v.findViewById(R.id.each_device_name);
        textView1 = (TextView)v.findViewById(R.id.Device_Address);
        textView.setText(arrayList.get(position).getDeviceName());
        textView1.setText(arrayList.get(position).getHardwareAddress());

        return v;
    }
}

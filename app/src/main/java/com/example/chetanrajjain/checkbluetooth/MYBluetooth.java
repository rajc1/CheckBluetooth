package com.example.chetanrajjain.checkbluetooth;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Set;

public class MYBluetooth  {
    Set<BluetoothDevice> deviceSet;
    BluetoothAdapter bluetoothAdapter;
    ArrayList<Devices> devicesList = new ArrayList<>();
    TextView textView;
    ListView listView;
    Activity activity;
    ArrayAdapter adapter;

    public MYBluetooth(TextView textView,Activity activity){
        this.textView = textView;
        this.activity = activity;
                getBluetoothinfo();
    }

    public void getBluetoothinfo(){

       bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
       if(bluetoothAdapter == null){

           textView.setText("Bluetooth not found");
        }
        if(!bluetoothAdapter.isEnabled()){

           Intent intent = new Intent(bluetoothAdapter.ACTION_REQUEST_ENABLE);
           activity.startActivityForResult(intent,1);
       }

           deviceSet = bluetoothAdapter.getBondedDevices();

           for (BluetoothDevice eachdevice : deviceSet){

               devicesList.add(new Devices(eachdevice.getName(),eachdevice.getAddress()));

             }
            adapter = new MyarrayAdapter(activity,R.layout.each_device_name,devicesList);
            listView = (ListView)activity.findViewById(R.id.list_item);
            listView.setAdapter(adapter);



    }

}

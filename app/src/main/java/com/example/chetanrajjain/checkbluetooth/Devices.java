package com.example.chetanrajjain.checkbluetooth;

class Devices {

    public String getDeviceName() {
        return DeviceName;
    }

    public void setDeviceName(String deviceName) {
        DeviceName = deviceName;
    }

    public String getHardwareAddress() {
        return HardwareAddress;
    }

    public void setHardwareAddress(String hardwareAddress) {
        HardwareAddress = hardwareAddress;
    }

    private String DeviceName;
    private String HardwareAddress;

    public Devices(String DeviceName,String HardwareAddress){

        this.DeviceName = DeviceName;
        this.HardwareAddress=HardwareAddress;

    }
}

package org.example.e167;


public class E167MultipleInterface {

    public static void main(String[] args){
SmartDevice sd=new SmartDevice();
sd.basicFunctionality();
sd.advancedFunctionality();

    }
}

interface BaseDeviceInterface{
    void basicFunctionality();
}

interface AdvancedDeviceInterface extends BaseDeviceInterface{
    void advancedFunctionality();
}

class SmartDevice implements AdvancedDeviceInterface{
    public void basicFunctionality(){
        System.out.println("Basic Functionality: Device is turning on");
    }
    public void advancedFunctionality(){
        System.out.println("Advanced Functionality: Device is adjusting settings");
    }
}


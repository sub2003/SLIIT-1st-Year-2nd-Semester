package Q04;

public class DeviceInventorySystem {
    static void main(String[] args) {

        Device device1=new Device("IH2939J","Samsung Galaxy S24 FE mobile phone");
        Device device2=new Device("JH2939K","Samsung Galaxy 26 Ultra mobile phone");
        Device device3=new Device("DK1837","Samsung Galaxy Z fold7 mobile phone");


        device1.deviceInfo();
        device2.deviceInfo();
        device3.deviceInfo();


        Device.displayDeviceCount();
    }
}

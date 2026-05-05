package Q04;

public class Device {
    private String deviceID;
    private String deviceType;

    private static int deviceCount;

    static{
        deviceCount=100;
    }

    public Device(String deviceID, String deviceType) {
        this.deviceID = deviceID;
        this.deviceType = deviceType;

        deviceCount++;
    }

    public static void displayDeviceCount(){
        System.out.println("Device Count : "+deviceCount);
    }

    public void deviceInfo(){
        System.out.println("Device Type : "+deviceType);
        System.out.println("Device ID : "+deviceID);
        System.out.println();
    }




}

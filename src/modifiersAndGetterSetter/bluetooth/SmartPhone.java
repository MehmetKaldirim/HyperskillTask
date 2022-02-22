package modifiersAndGetterSetter.bluetooth;

/*The SmartPhone class can access the receiveInfo method of the Laptop class
and the printNotification method of the MobileGadget class.*/
public class SmartPhone extends MobileGadget {

    private Laptop connectedLaptop; // new variable from Laptop

    public SmartPhone() {
        this.connectedLaptop = new Laptop(); // Why a.q. creat object named connectedLaptop
    }

    private void sendInfoToLaptop(String data) {
        printNotification("Sending data to laptop : "  + data);
        connectedLaptop.receiveInfo(data); // using here object of Laptop with method of Laptop
    }
}
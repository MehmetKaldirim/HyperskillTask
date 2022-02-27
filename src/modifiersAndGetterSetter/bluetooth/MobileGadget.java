package modifiersAndGetterSetter.bluetooth;

public class MobileGadget {

    /*The printNotification method is accessible for all subclasses of this class
    as well as for all classes in the same package (including the Laptop class).Because
    it is protected*/
    protected void printNotification(String data) {
        System.out.println(data);
    }
}
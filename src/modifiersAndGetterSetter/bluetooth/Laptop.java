package modifiersAndGetterSetter.bluetooth;

public class Laptop {
    /*info which is not directly accessible since it is declared as private.
     But all classes from the same package can access it invoking the receiveInfo
      method which is declared as package-private (no modifier).*/
    private String info;

    //receiveInfo(), responsible for getting any information from connected gadgets.
    void receiveInfo(String info) {
        this.info = info;
    }

}

package objects;

class Lamp {
    String typeOfLamp;
    String ownerOfLamp;
    // stores the value for light
    // true if light is on
    // false if light is off
    boolean isOn;
     Lamp(String type, String owner, boolean isOn){
      this.typeOfLamp = type;
      this.ownerOfLamp = owner;
      this.isOn = isOn;
    }
    // method to turn on the light
    void turnOn() {
        isOn = true;


    }

    // method to turnoff the light
    void turnOff() {
        isOn = false;
    }

    void printLamp () {
        System.out.println( "Type : " + this.typeOfLamp + " Owner :" + this.ownerOfLamp + " Light on? " + this.isOn  );

    }
}

class maim {
    public static void main(String[] args) {

        // create objects led and halogen
        Lamp led = new Lamp("Led1", "Jack",false );
        Lamp halogen = new Lamp("halogen1", "Rolf", true);

        // turn on the light by
        // calling method turnOn()
        led.turnOn();

        // turn off the light by
        // calling method turnOff()
        halogen.turnOff();

        led.printLamp();
        halogen.printLamp();
    }
}


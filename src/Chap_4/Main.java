package Chap_4;

public class Main {
    public static void main(String[] args) {
        Boat myBout = new Boat("Steamed Engine", 6, "Coal", "Double rudder");

        FighterJet F16 = new FighterJet("Jet Engine", 2, "Jet Fuel", 4, "HEI");
//      F16.landing();
//      System.out.println(F16.getFuelType());
//


// A class can only inherit from and only one parent.

//* Vehicle
//           -Plane
//                   -FighterJet


        myBout.drive();
        F16.drive();









    }
}



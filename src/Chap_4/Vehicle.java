package Chap_4;

public class Vehicle {
    private String engine;
    private int seats;
    private String fuelType;

   public Vehicle(String engine, int seats, String fuelType){
      this.engine=engine;
      this.seats=seats;
      this.fuelType=fuelType;

   }
   public String getEngine(){return engine;}
    public void setEngine(String engine){this.engine=engine;}

    public int getSeats(){return seats;}
    public void setSeats(int seats){this.seats=seats;}

    public String getFuelType(){return fuelType;}
    public void setFuelType(String fuelType){this.fuelType=fuelType;}

    public void drive () {
       System.out.println("Driving");
    }

    public void acceleration (){
       System.out.println("Acceleration");
    }

    public void deceleration(){
        System.out.println("deceleration");

    }



}

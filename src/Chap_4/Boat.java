package Chap_4;

public class Boat extends Vehicle{
    private String rudder;

    public Boat(String in_engine, int in_seats,String in_fuelType, String in_rudder){
        super(in_engine, in_seats, in_fuelType);
        this.rudder=in_rudder;
    }

    public String getRudder(){
        return rudder;
    }
    public void setRudder(String in_rudder){
        this.rudder = in_rudder;
    }
    public void duck(){
        System.out.println("Ducking");
    }
    @Override
    public void drive(){
        System.out.println("Sailing");
    }


}

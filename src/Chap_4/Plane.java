package Chap_4;

public class Plane extends Vehicle{
    private int wingspan;

    public Plane(String engine, int seats, String fuelType,int wingspan){
        super(engine, seats, fuelType);
        this.wingspan = wingspan;

    }
    public int getWingspan(){
        return wingspan;
    }
    public void setWingspan(int wingspan){
        this.wingspan= wingspan;
    }
    public void landing (){
        System.out.println("Landing");
    }
    @Override
    public void drive(){
        System.out.println("Flying");
    }


}



package Chap_4;

public class FighterJet extends Plane{
    private String ammoType;

    public FighterJet(String engine, int seats, String fuelType,int wingspan,String ammoType){
        super(engine, seats, fuelType, wingspan);
        this.ammoType=ammoType;
    }
    public String getAmmoType(){
        return ammoType;
    }
    public void setAmmoType(String ammoType){
        this.ammoType=ammoType;
    }
}

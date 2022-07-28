package Chap_2;

public class Player {
  private String name;
   private int age;
   private String gender;


    public Player(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Player( int inputAge, String inputName, String inputGender){
            this.age = inputAge;
            this.name = inputName;
            this.gender=inputGender;

    }
    //we make method called roll
    public int roll() {
        //we need the method to randomly pick a number from 1 to 6
        return ((int) (Math.random()*(6-1))) +1;
    }



}

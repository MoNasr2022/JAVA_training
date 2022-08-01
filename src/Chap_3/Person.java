package Chap_3;

public class Person {
   private String name;
    private String gender;
    private int age;
    private String[] children;



    public Person(String name, String gender , int age , String[] children){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public String talk(){
        return " Hello";

    }

    public String getGender(){
        return this.gender;
    }

    public void  setGender(String new_gender){


        if (new_gender.equals("male") || new_gender.equals("female")) {
            this.gender = new_gender;
        }

        else {
            this.gender = "unspecified";
        }


    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int new_age){

        if ( new_age >= 18 && new_age < 100 ){
            this.age = new_age;
        }


    }

    public String[] getChildren(){
        return children;
    }

    public void setChildren(String[] children){
        this.children = children;

    }



}

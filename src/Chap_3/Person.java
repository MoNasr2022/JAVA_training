package Chap_3;

public class Person {
   private String name;
    private String gender;
    private int age;
    private String[] children;



    public Person(String name, String gender , int age , String[] children){
        this.name = name;
        setAge(age);
        setGender(gender);
        setChildren(children);
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
        String[] copy = new String[this.children.length];
        System.arraycopy(this.children, 0, copy,0 ,this.children.length);
        return copy;
    }

    public void setChildren(String[] inputChildren){
        this.children = new String[inputChildren.length];
        System.arraycopy(inputChildren, 0,this.children, 0,inputChildren.length );

    }



}

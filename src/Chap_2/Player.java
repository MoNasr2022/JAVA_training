package Chap_2;

public class Player {

    private String name;
    private int age;


    public Player(int age, String name) {
        setName(name);
        setAge(age);


    }

    public Player(String name, int age) {
        setName(name);
        setAge(age);


    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public int rule() {

        return ((int) (Math.random() * (6 - 1))) + 1;
    }


}


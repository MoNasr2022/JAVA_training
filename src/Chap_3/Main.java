package Chap_3;
/*

public class Main {
    public static void main(String[] args) {

        mathUtility Nasr = new mathUtility();


        System.out.println(Nasr.add(10, 7));
        System.out.println(Nasr.subtraction(10, 7));
        System.out.println(Nasr.multiply(10, 7));
        System.out.println(Nasr.divide(10, 5));
        System.out.println(Nasr.factorial(6));


    }
}

 */

//=======================================================================




public class Main {
    public static void main(String[] args) {
        String[] children = new String[]{"Mary", "David", "Eric"};

        Person p1 = new Person("john", "male", 20, children );
        System.out.println(p1.getGender());
        p1.setAge(17);
        System.out.println(p1.getAge());



    }
}
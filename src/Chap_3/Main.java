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

        String[] new_array = new String[]{"David", "Mary","Grinch"};

        p1.setChildren(new_array);


        new_array[1]= "Nasr";
        System.out.println(new_array[0] +"," + new_array[1] +"," + new_array[2] );




    }
}
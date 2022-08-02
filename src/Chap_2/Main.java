package Chap_2;/*
// package Prac;/*public class Prac.Main {
    public static void main(String[] args) {
        byte mybyte = 12;
        short myshort = 3277;
        int myint = 100024332;
        long mylong = 1000000000;
        double mydouble = 3.23835902;
        float myflout = 1.5123145f;
        char mychar='(';
        boolean myboolean= true;

        String mystring= "java is my string";
        System.out.println(mystring);

    }

}

    */

//============================================================================================

/*
public class Prac.Main {
        public static void main(String[] args)
            {
            int a = 20, b = 10;

            //various conditional operators15

            System.out.println("a == b : " + (a == b));
            System.out.println("a < b : " + (a < b));
            System.out.println("a <= b : " + (a <= b));
            System.out.println("a > b : " + (a > b));
            System.out.println("a >= b : " + (a >= b));
            System.out.println("a != b : " + (a != b));
        }
    }

 */


//===========================================================================================================

/*
public class Prac.Main {
    public static void main(String[] args) {
        boolean x = true;   //dogs are awesome
        boolean y = false;  //Spiders are cute
        boolean z = true;   //Coding is easy
        boolean a = false;

        System.out.println("x and y: " + (x && y));
        System.out.println("x and z: " + (x && z));
        System.out.println("y and z: " + (y && z));


        System.out.println("x or y: " + (x || y));
        System.out.println("x or z: " + (x || z));
        System.out.println("y or z: " + (y || z));
        System.out.println("y or a: " + (y || a));

    }
}

 */
//===================================================================
/* public class Prac.Main {

    public static void main(String[] args) {

        int A = 39, B = 18;

        if (A == B) {
            System.out.println("A is equal to B");
        }
        else if (A > B) {
            System.out.println("A is greater than B");
        }
        else {
            System.out.println("A is less than B");
        }
    }

 */


//===============================================================================

  /*
   import java.util.Scanner;

   public class Prac.Main {

    public static void main(String[] args) {

       String weekday;
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter a Number Between 1 and 7: ");
        String userInput =in.nextLine();
        int day = Integer.valueOf(userInput);


       //switch statement with int data types
       switch (day) {
           case 1:
               weekday = "Saturday";
               break;
           case 2:
               weekday = "Sunday";
               break;
           case 3:
               weekday = "Monday";
               break;
           case 4:
               weekday = "Tuesday";
               break;
           case 5:
               weekday = "Wednesday";
               break;
           case 6:
               weekday = "Thursday";
               break;
           case 7:
               weekday = "Friday";
               break;
           default:
               weekday = "Error 404";
               break;
       }
       System.out.println(weekday);

       }




    }

   */


//========================================================================================================


/*import java.util.Scanner;

public class Prac.Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the number you want : ");
        int y = in.nextInt();


        for (int x = 5; x <= 100;  x = x+5) {
            System.out.println("the total is : " + (y+x));
        }


    }
}


 */

//============================================================================


   /*public class Prac.Main {

       public static void main(String[] args) {


           for (int x = 0; x <= 10; x++) {
               System.out.println(x);
           }


       }
   }

    */

//=====================================================================================================


/*import java.util.Scanner;

public class Prac.Main {

       public static void main(String[] args) {
           Scanner in = new Scanner(System.in);

           System.out.println("Please enter the number you want : ");
           int y = in.nextInt();

           int x = 5;

           while (x <= 100) {
               System.out.println(x+y);
               x = x+5;
           }


       }   }

 */



//=======================================================

//import java.util.Scanner;

/*public class Prac.Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pleas enter the value of a: ");
        String userInput = sc.nextLine();
        float a = Integer.valueOf(userInput);
        Scanner in = new Scanner(System.in);
        System.out.println("Pleas enter the value of b: ");

        float b = in.nextInt();


        System.out.println("This is the value of a + b = " + (a + b));
        System.out.println("This is the value of a - b = " + (a - b));
        System.out.println("This is the value of a * b = " + (a * b));
        System.out.println("This is the value of a / b = " + (a / b));

    }
}


 */

//================================================================
/*
public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[]{1, 2, 3, 5, 7, 9, 19, 22, 4};

        System.out.println(myArray[6]);

        System.out.println(myArray.length);

        for (int i = 0; i < 9; i++) {
            System.out.println(myArray[i]);
            System.out.println((myArray[0] + myArray[8]));


        }
    }



 */



//==========================================================================================

/*
import java.util.Scanner;

public class Prac.Main {
    public static void main(String[] args) {
// write your code here
        Scanner sc = new Scanner(System.in);// we need 3 Variable 
        System.out.print("Enter the number you want a factorial of: ");
        int i,fact=1;
        int number= sc.nextInt();//It is the number to calculate factorial
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact); 
    }
}


 */
//==========================================================================================

   /*
import Chap_2.Player;

public class main {
    public static void main(String[] args) {
       

        System.out.println(calculateCircleArea(5));

    }

           static double calculateCircleArea(int radius){

            double area = java.lang.Math.PI * radius*radius;
            return area;
        }
        
    }

    */




//====================================================================
   /*
class Main {
    public static void main(String[] args) {

        int[] myArray = new int[]{7, 5, 5, 89, 12, 45, 7, 0};
        System.out.println(calculatSumofArray(myArray));


    }
    // input is array
    //output is int

    static double calculateCircleArea(int radius) {
        double area = java.lang.Math.PI * radius * radius;
        return area;
    }

    static int calculatSumofArray(int[] myArray) {
        int sum = 0;

        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];

        }
        return sum; 
    }
}

    */


 //===========================================================

/*


public class Main {
    public static void main(String[] args) {

        Point ourFirstPoint = new Point(3.0, 4);
        Point ourSecondPont = new Point(7, 10);

        Line ourLine = new Line(ourFirstPoint,ourSecondPont);
        System.out.println("Gradient: " + ourLine.gradient());
        System.out.println("Length: " + ourLine.lineLength());
         
    }
}

 */





//============================================

 /*
import Chap_2.Dog;

public class Prac.Main {
    public static void main(String[] args) {
        Dog Alex = new Dog("Alex", 6, "red", "german")          ;
        Dog Jon = new Dog(8,"black","jon","wild");
        
          Alex.eat("dry food");
          Jon.bark();
    }



}

  */
//============================================================================
        /*

import Chap_2.Player;

public class main {
    public static void main(String[] args) {
        Player Alex = new Player("Alex", 12, "male");
        Player Jon  = new Player(8,"Jon","male");

        int Alex_total=0;     int Jon_total=0;
        int Alex_current_roll=0;  int Jon_current_roll =0;


        while (Alex_total <20  && Jon_total < 20) {
            Alex_current_roll = Alex.roll();
            Jon_current_roll = Jon.roll();


            System.out.println("Alex_current_roll is " + Alex_current_roll + " and " + " Jon_current_roll is " + Jon_current_roll);


            Alex_total = Alex_total + Alex_current_roll;
            Jon_total = Jon_total + Jon_current_roll;



        }



        if(Alex_total >= 20 ) {
            System.out.println("Alex wins");
        }
        
        else {
            System.out.println("Jon wins");
        }


    }}


         */

//==================================================

/*

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Mohamed", 27);
        Player p2 = new Player(28,"Ahmed");

        int Mohamed_total = 0;   int Ahmed_total = 0;
        int Mohamed_current_rule = 0;   int Ahmed_current_rule = 0;

        while (Mohamed_total < 20 && Ahmed_total < 20){


            System.out.println("Mohamed current rule: " + p1.rule() +" || " + "Ahmed_current_rule: " + p2.rule());

            Mohamed_total = Mohamed_total + p1.rule();
            Ahmed_total = Ahmed_total + p2.rule();




        }

        if (Mohamed_total >= 20){
            System.out.println("Mohamed wins");
        }
        else {
            System.out.println("Ahmed wins");
        }

    }
}

 */









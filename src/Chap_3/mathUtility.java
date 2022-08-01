package Chap_3;

public class mathUtility {
    public  void  anyVariable(){

    }
    public int add(int x, int y){
        return x + y;
    }
    public int subtraction(int x, int y){
        return x - y;
    }
    public int multiply(int x, int y){
        return x * y;
    }
    public int divide(int x, int y){
        return x/y;
    }

    public int factorial(int x){
        int i = 1;
        int fact = 1;

        for (i = 1; i <= x; i++){
            fact = fact*i;
        }

        return fact;
    }


















}

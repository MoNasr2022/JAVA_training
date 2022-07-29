package HW;

     public class Animal {
        private String name;
        private int numberOfLegs;
        private String animalSound;
        private String animalFood;


        public Animal(String theName,int NofLegs,String Sound,String Food){
            this.name = theName;
            this.numberOfLegs = NofLegs;
            this.animalSound = Sound;
            this.animalFood = Food;
        }

         public Animal(int NofLegs,String theName,String Sound,String Food){
             this.name = theName;
             this.numberOfLegs = NofLegs;
             this.animalSound = Sound;
             this.animalFood = Food;

         }
         public void makeSound(int x ){
             System.out.println(this.name + " makes sound " + x + " times");


         }


         public void eat(String Y) {
             System.out.println( "after " + "he" + " has eaten " + Y);

         }
     }









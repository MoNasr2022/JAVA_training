package HW;

public class HW2_2 {
              public static void main(String[] args) {
                  Animal Lion = new Animal("semba", 4, "rour", "meat");
                  Animal Dear = new Animal("cheta", 4, "maaa", "Grass");
                  Animal Falcon = new Animal(2, "Ahly", "Karawan", "meat");

                  Lion.makeSound(4);
                  Lion.eat("meat");


                  Dear.makeSound(3);
                  Dear.eat("grass");


                  Falcon.makeSound(2);
                  Falcon.eat("meat");


              }
          }
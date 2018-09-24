package car;

/*
 *
 * @author  RichardJussaume
 */
 public class Car {

   int maxSpeed = 100;
   int minSpeed = 0;
   double weight = 4079;
   boolean isOn = false;
   char condition = 'A';

   public void printVariables() {
     System.out.println(maxSpeed);
     System.out.println(minSpeed);
     System.out.println(weight);
     System.out.println(isOn);
     System.out.println(condition);
   }

    public static void main(String[] args) {
        //TODO code application logic here
        Car carry = new Car();
        carry.printVariables();
    }
 }

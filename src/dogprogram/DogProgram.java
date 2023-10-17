// Project: Dog Program
// Author: Referdinand G Balanquit Jr
// Version: 1
// Date: 26/09/2023
package dogprogram;

public class DogProgram {

    public static void main(String[] args) {
       
        Dog firstDog = new Dog(); //Declaring a new dog
        Dog secondDog = new Dog(); // Using instance variables
        Dog thirdDog = new Dog("White", "Retriever", "Large", 'M', 4, 14.2, 3.5);   // Demonstrating constuctors
        
        // Start of firstDog
        firstDog.name = "Ruben";
        firstDog.gender = 'M';
        firstDog.age = 22;
        firstDog.colourOfCoat = "Neon Green";
        firstDog.breed = "Poodle";
        firstDog.size = "Large";
        firstDog.ownerName = "Avis";
        firstDog.foodType = "Chicken";
        firstDog.noOfLegs = 4;
        firstDog.weight = 80;
        firstDog.height = 160;
        firstDog.distanceWalked = 9000 ;
        firstDog.trained = true;
        firstDog.isHungry = true;
        firstDog.teethDirty = true;
        firstDog.isHappy = true;
        
        firstDog.bark();
        firstDog.displayDetails();
        System.out.println("======================================");
        
        firstDog.walkTheDog( 500);
        System.out.println("======================================");
        firstDog.patTheDog();
        System.out.println("======================================");
        firstDog.cleanTeeth();
        System.out.println("======================================");
        firstDog.feedTheDog();
        System.out.println("======================================");
        // End of firstDog
        
        // Start of secondDog
        secondDog.name = "Daniel";
        secondDog.gender = 'M';
        secondDog.age = 900;
        secondDog.colourOfCoat = "Salmon Pink";
        secondDog.breed = "Great Dane";
        secondDog.size = "X Large";
        secondDog.ownerName = "Daniel Sr.";
        secondDog.foodType = "All-Meat";
        secondDog.noOfLegs = 6;
        secondDog.weight = 190;
        secondDog.height = 200;
        secondDog.distanceWalked = 2344.12 ;
        secondDog.trained = true;
        secondDog.isHungry = true;
        secondDog.teethDirty = true;
        secondDog.isHappy = true;
        
        
        secondDog.displayDetails();
        secondDog.bark();
        System.out.println("======================================");
        // End of secondDog
     
        thirdDog.displayDetails();
        System.out.println("======================================");
        // End of thirdDog
    }
    
}

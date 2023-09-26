// Project: Dog Program
// Author: Referdinand G Balanquit Jr
// Version: 1
// Date: 26/09/2023
package dogprogram;

public class DogProgram {

    public static void main(String[] args) {
       
        Dog firstDog = new Dog(); //Declaring a new dog
        Dog secondDog = new Dog(); // Using instance variables
        
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
       
        // Start of firstDog
        System.out.println("Details for "+firstDog.name);
        System.out.println("======================================");
        System.out.println("Gender: "+firstDog.gender);
        System.out.println("Age: "+firstDog.age);
        System.out.println("Colour: "+firstDog.colourOfCoat);
        System.out.println("Breed: "+firstDog.breed);
        System.out.println("Size: "+firstDog.size);
        System.out.println("Owner: "+firstDog.ownerName);
        System.out.println("Food: "+firstDog.foodType);
        System.out.println("Number of Legs: "+firstDog.noOfLegs);
        System.out.println("Weight: "+firstDog.weight);
        System.out.println("Height: "+firstDog.height);
        System.out.println("Distance Walked: "+firstDog.distanceWalked);
        System.out.println("Trained: "+firstDog.trained);
        System.out.println("Hungry: "+firstDog.isHungry);
        System.out.println("Dirty teeth: "+firstDog.teethDirty);
        System.out.println("Happy: "+firstDog.isHappy);
        System.out.println("======================================");
        
        
        // Start of secondDog
        System.out.println("Details for "+secondDog.name);
        System.out.println("======================================");
        System.out.println("Gender: "+secondDog.gender);
        System.out.println("Age: "+secondDog.age);
        System.out.println("Colour: "+secondDog.colourOfCoat);
        System.out.println("Breed: "+secondDog.breed);
        System.out.println("Size: "+secondDog.size);
        System.out.println("Owner: "+secondDog.ownerName);
        System.out.println("Food: "+secondDog.foodType);
        System.out.println("Number of Legs: "+secondDog.noOfLegs);
        System.out.println("Weight: "+secondDog.weight);
        System.out.println("Height: "+secondDog.height);
        System.out.println("Distance Walked: "+secondDog.distanceWalked);
        System.out.println("Trained: "+secondDog.trained);
        System.out.println("Hungry: "+secondDog.isHungry);
        System.out.println("Dirty teeth: "+secondDog.teethDirty);
        System.out.println("Happy: "+secondDog.isHappy);
        System.out.println("======================================");
        
    }
    
}

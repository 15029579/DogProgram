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
        firstDog.breed = "";
        firstDog.
        
        secondDog.name = "Daniel";
        secondDog.gender = 'M';
        secondDog.age = 2089;
       
        System.out.println("Details for "+firstDog.name);
        System.out.println("======================================");
        System.out.println("Gender: "+firstDog.gender);
        System.out.println("Age: "+firstDog.age);
        System.out.println("======================================");
        
        System.out.println("Details for "+secondDog.name);
        System.out.println("======================================");
        System.out.println("Gender: "+secondDog.gender);
        System.out.println("Age: "+secondDog.age);
        System.out.println("======================================");
        
        
    }
    
}

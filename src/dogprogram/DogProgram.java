package dogprogram;

public class DogProgram {

    public static void main(String[] args) {
       
        Dog firstDog = new Dog(); //Declaring a new dog
        Dog secondDog = new Dog(); // Using instance variables
        
        firstDog.name = "Ruben";
        firstDog.gender = 'M';
        firstDog.age = 22;
        
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

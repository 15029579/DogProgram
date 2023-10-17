package dogprogram;

public class Dog {
    // Declaring Instance variables
//    String name;
//    char gender;
//    int age;
//    String colourOfCoat;
//    String breed;
//    String size;
//    String ownerName;
//    String foodType;
//    int noOfLegs;
//    double weight;
//    double height;
//    double distanceWalked;
//    Boolean trained;
//    Boolean isHungry;
//    Boolean teethDirty;
//    Boolean isHappy;
    
    // Instance Variables
    private String name, colourOfCoat, breed, size, ownerName, foodType;
    private char gender;
    private int age, noOfLegs;
    private double weight, height, distanceWalked;
    private Boolean trained, isHungry, teethDirty, isHappy;
    
    // Constructors to create default values for unknown data
    Dog(){
        ownerName = "";
        foodType = "";
        gender = ' ';
        age = 0;
        noOfLegs = 4;
        weight = 0;
        height = 0;
        distanceWalked = 0;
        trained = false;
        isHungry = true;
        teethDirty = false;
        isHappy = false;   
    }
    
    // Overloaded constructors if value is known
    Dog(String colourOfCoat, String breed, String size, char gender, int noOfLegs, double weight, double height){
        this.colourOfCoat = colourOfCoat;
        this.breed = breed;
        this.size = size;
        this.gender = gender;
        this.noOfLegs = noOfLegs;
        this.weight = weight;
        this.height = height;
        ownerName = "Unknown";
        foodType = "Unknown";
        age = 0;
        distanceWalked = 0;
        trained = false;
        isHungry = true;
        teethDirty = false;
        isHappy = false; 
        name = "Unknown";
    }
    
    //Getters and Setters
    
    public void setName(String name){
        this.name = name;
    }
    
    
    public String getName(){
        return name;
    }
    
    public String getColourOfCoat() {
        return colourOfCoat;
    }

    public void setColourOfCoat(String colourOfCoat) {
        this.colourOfCoat = colourOfCoat;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

            
    //Methods
    public void bark(){ //method header
        System.out.println("BARK! BARK!");
    }
        
    public void displayDetails(){
        System.out.println("Details for "+name);
        System.out.println("======================================");
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Colour: "+colourOfCoat);
        System.out.println("Breed: "+breed);
        System.out.println("Size: "+size);
        System.out.println("Owner: "+ownerName);
        System.out.println("Food: "+foodType);
        System.out.println("Number of Legs: "+noOfLegs);
        System.out.println("Weight: "+weight);
        System.out.println("Height: "+height);
        System.out.println("Distance Walked: "+distanceWalked);
        System.out.println("Trained: "+trained);
        System.out.println("Hungry: "+isHungry);
        System.out.println("Dirty teeth: "+teethDirty);
        System.out.println("Happy: "+isHappy);
    }
    
    public void walkTheDog(double distance){
        distanceWalked += distance;     //adds the parameter 'distance' to distanceWalked
        isHappy = true;     
        isHungry = true;
        System.out.println("You walked "+name+" today for "+distance+".");
        System.out.println("The total of distance walked is now "+distanceWalked+".");
        System.out.println(name+" is now happy and hungry.");
    }
    
    public void patTheDog(){
        isHappy = true;
        System.out.println("You patted "+name+". Dog is happy: "+isHappy);
    }
    
    public void cleanTeeth(){
        teethDirty = true;
        isHappy = false;
        System.out.println("You brushed "+name+"'s teeth.");
        System.out.println("Teeth clean: "+teethDirty);
        System.out.println("Happy: "+isHappy);
    }
    
    public void feedTheDog(){
        teethDirty = true;
        isHungry = false;
        System.out.println("You fed "+name+".");
        System.out.println("Teeth clean: "+teethDirty);
        System.out.println("Hungry: "+isHungry);
    }
    
    
}

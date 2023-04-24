//2 quiz of MT is here
enum AnimalType {
    MAMMAL,
    BIRD,
    REPTILE,
    AMPHIBIAN,
    FISH
}

//  abstract class Animal
abstract class Animal {
    private String name;
    private int age;
    private AnimalType type;
    private String habitat;

    // Constructor
    public Animal(String name, int age, AnimalType type, String habitat) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.habitat = habitat;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AnimalType getType() {
        return type;
    }

    public void setType(AnimalType type) {
        this.type = type;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    // Abstract method
    public abstract void makeSound();
}

// subclass Dog
class Dog extends Animal {
    private String breed;

    // Constructor
    public Dog(String name, int age, AnimalType type, String habitat, String breed) {
        super(name, age, type, habitat);
        this.breed = breed;
    }

    // Getter and Setter
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Method to make sound
    @Override
    public void makeSound() {
        System.out.println("Woof wuf!");
    }

    // Method specific to Dog class
    public void fetch() {
        System.out.println(getName() + " is fetching the ball!");
    }
}

//  subclass Parrot
class Parrot extends Animal implements Pet, Bird {
    private String color;

    // Constructor
    public Parrot(String name, int age, AnimalType type, String habitat, String color) {
        super(name, age, type, habitat);
        this.color = color;
    }

    // Getter and Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method to make sound
    @Override
    public void makeSound() {
        System.out.println("Ricky wants to say hello world!");
    }

    // Method specific to Parrot class
    public void mimic() {
        System.out.println(getName() + " is mimicking human speech!");
    }

    // Implementing the abstract method of the Pet interface
    @Override
    public void playWith() {
        System.out.println(getName() + " is playing with its owner Mary!");
    }

    // Implementing the abstract method of the Bird interface
    @Override
    public void fly() {
        System.out.println(getName() + " is flying in circles, woah!");
    }
}

//  interface Pet
interface Pet {
    public abstract void playWith();
}

// an interface Bird
interface Bird {
    public abstract void fly();
}

// Main method to test the classes and interfaces
public class Main {
    public static void main(String[] args) {
        // Creating a Dog instance
        Dog myDog = new Dog("Coco", 8, AnimalType.MAMMAL, "House", "Labrador");
        System.out.println("Name: " + myDog.getName());
        System.out.println("Age: " + myDog.getAge());
        System.out.println("Type: " + myDog.getType());
        System.out.println("Habitat: " + myDog.getHabitat());
        System.out.println("Breed: " + myDog.getBreed());
        myDog.makeSound();
        myDog.fetch();

        // Creating a Parrot for example
        Parrot myParrot = new Parrot("Ricky", 1, AnimalType.BIRD, "Cage", "Green/blue");
        System.out.println("Name: " + myParrot.getName());
        System.out.println("Age: " + myParrot.getAge());
        System.out.println("Type: " + myParrot.getType());
        System.out.println("Habitat: " + myParrot.getHabitat());
        System.out.println("Color: " + myParrot.getColor());
        myParrot.makeSound();
        myParrot.mimic();
        myParrot.playWith();
        myParrot.fly();
    }
}//end
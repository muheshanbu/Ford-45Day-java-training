abstract class Animal {

// Attributes: name, age
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    void makeSound(){
        System.out.println("Sound drop in 3..2..1");
    }

}

class Lion extends Animal {
Lion(String name,int age){
    super(name, age);
}

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("The sound " + this.getName() + "makes is : roar");
    }
// Implement constructor and override makeSound() method using super keyword

}

class Elephant extends Animal {
Elephant(String name,int age){
    super(name, age);
}

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("The sound " + this.getName() + "makes is : blegh");
    }
// Implement constructor and override makeSound() method using super keyword

}

public class AnimalHeirarchy {

    public static void main(String[] args) {

// Instantiate Lion and Elephant objects, display attributes and the sound they make
        Elephant ele = new Elephant("jumbo",11);
        ele.makeSound();
        Lion lion = new Lion("mr singam",49);
        lion.makeSound();

    }

}
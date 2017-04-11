package chapter7;

/**
 * Created by Administrator on 2017/4/10.
 */
public class Animal {
    String picture;
    String food = "meat";

    void makeNoise(){
        System.out.println("Animal is making noise...");
    }

    void eat(){
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal{

    String food = "dog food";
    void eat(){
        super.eat();
        System.out.println("Dog is eating...");
    }
}

class AnimalTestDrive{
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.eat();
        dog.makeNoise();
        Animal dog2 = new Dog();
        dog2.eat();
        System.out.println(dog.food);
    }
}

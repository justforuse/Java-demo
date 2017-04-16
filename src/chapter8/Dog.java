package chapter8;

/**
 * Created by Administrator on 2017/4/15.
 */
public class Dog {
	void bark(){
		System.out.println("dog is barking");
	}
}

class DogTestDrive{
	public static void main(String[] args){
		Object dog = new Dog();
		// chapter8.Dog
		System.out.println(dog.getClass());
	}
}

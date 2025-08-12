package day10_ProgrammingElements;
class Animal{
	String name;
	int age;
	
	public Animal(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void makeSound() {
		System.out.println("Animal makes a Sound");
	}
}
class Dog extends Animal{

	public Dog(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void makeSound() {
		System.out.println(name+"makes sound"+"woof woof!");
	}
}
class Cat extends Animal{
	
	public Cat(String name, int age) {
		super(name,age);
	}
	
	@Override
	public void makeSound() {
		System.out.println(name+"makes sound"+"meow meow!");
	}
}

class Bird extends Animal{
	
	public Bird(String name,int age) {
		super(name,age);
	}
	
	@Override
	public void makeSound() {
		System.out.println(name+"makes sound"+"Tweet Tweet!");
	}
}
public class AnimalInheritance {

	public static void main(String[] args) {
		
		Dog dog=new Dog("Tommy",5);
		Cat cat=new Cat("Kitty",4);
		Bird bird=new Bird("Mithoo",8);
		
		System.out.println(dog.name);
		System.out.println(dog.age);
		dog.makeSound();
		
		System.out.println("-------------------");
		
		System.out.println(cat.name);
		System.out.println(cat.age);
		cat.makeSound();
		
		System.out.println("-------------------");
		
		System.out.println(bird.name);
		System.out.println(bird.age);
		bird.makeSound();
	}

}

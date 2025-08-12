package day10_ProgrammingElements;

class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow Meow!");
    }
}

class Bird extends Animal {
    Bird(String name, int age) {
        super(name, age);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Tweet Tweet!");
    }
}

public class AnimalInheritance{
    public static void main(String[] args) {
        Animal dog = new Dog("Tommy", 5);
        Animal cat = new Cat("Kitty", 3);
        Animal bird = new Bird("Tweety", 2);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}

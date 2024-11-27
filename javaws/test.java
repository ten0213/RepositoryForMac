class Animal {
    public void makeSound() {
        System.out.println("Animal is making a sound.");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Cat is making a sound.");
    }
}



public class Test {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.makeSound();
    }
}



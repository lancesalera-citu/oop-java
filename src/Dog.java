

public class Dog extends Animal {
    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void fetch() {
        System.out.println("Fetching!");
    }
}

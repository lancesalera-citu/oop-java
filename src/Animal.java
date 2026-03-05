

public abstract class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    // Setters
    public void setAge(int age) {
        if(age < 0) return; // Age cannot be negative
        this.age = age;
    }

    public abstract void makeSound();

    public void land() {
            System.out.println("Animal landing...");
    }
}

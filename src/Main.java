public class Main {
    public static void main(String[] args) throws Exception {
        AnimalShelter shelter = new AnimalShelter();
        shelter.add(new Dog("Buddy", 3, "Male"));
        shelter.add(new Cat("Mittens", 2, "Female"));
        shelter.remove("Mittens");
        shelter.add(new Dog("Whiskers", 1, "Female"));
        shelter.remove("Buddy");
        shelter.remove("Mittens");
        shelter.remove("Whiskers");
        shelter.add(new Cat("Shadow", 4, "Male"));
        shelter.add(new Dog("Mikey", 5, "Male"));
        shelter.add(new Dog("Blackie", 5, "Male"));
        shelter.add(new Dog("Whitey", 5, "Male"));
        shelter.add(new Dog("Brownie", 5, "Male"));
        shelter.add(new Dog("Gudin", 5, "Male"));
        shelter.remove("Shadow");
        shelter.add(new Dog("Gudin", 5, "Male"));
        shelter.display();
    }
}

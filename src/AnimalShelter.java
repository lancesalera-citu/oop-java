public class AnimalShelter implements Shelter {
    private static final int INITIAL_CAPACITY = 5;
    private Animal[] animals;
    private int size;

    public AnimalShelter() {
        this.animals = new Animal[INITIAL_CAPACITY];
        this.size = 0;
    }

    @Override
    public void add(Animal animal) {
       if(size == INITIAL_CAPACITY) return;
       this.animals[size++] = animal;
    }

    @Override
    public boolean remove(String name) {
        for(int i=0; i<size; i++) {
            if(animals[i].getName().equalsIgnoreCase(name)) {
                for(int j=i; j<size-1; j++) {
                    animals[j] = animals[j+1];
                }
                animals[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Animal get(int pos) {
        if(pos < 1 || pos > size) {
            System.out.println("Invalid position.");
            return null;
        }
        return animals[pos - 1];
    }

    @Override
    public void display() {
        if(size == 0) {
            System.out.println("No animals in the shelter.");
            return;
        }

        System.out.println("Animals in the shelter:");
        for(int i = 0; i < size; i++) {
            Animal animal = animals[i];
            System.out.println((i + 1) + ". " + animal.getName() + " (" + animal.getAge() + " years, " + animal.getGender() + ")");
        }
    }
}

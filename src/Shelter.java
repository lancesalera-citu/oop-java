public interface Shelter {
    void add(Animal animal);
    boolean remove(String name);
    Animal get(int pos);
    void display();
}

package zoo;

public class Mammal extends Animal {
    public Mammal() { super(); }
    public Mammal(String name, int age, double weight) {
        super(name, age, weight);
    }
    public Mammal(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Mammal is eating.");
    }

    @Override
    public void getVoice() {
        System.out.println("Mammal makes a sound.");
    }
}

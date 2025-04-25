package zoo;

public class Dog extends Mammal {
    private String breed;

    public Dog() { super(); }
    public Dog(String name, int age, double weight, String breed) {
        super(name, age, weight);
        this.breed = breed;
    }
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    @Override
    public void eat() {
        System.out.println("Dog eats bones.");
    }

    @Override
    public void getVoice() {
        System.out.println("Dog barks.");
    }

    public void fetch() {
        System.out.println("Dog fetches a stick.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }
}

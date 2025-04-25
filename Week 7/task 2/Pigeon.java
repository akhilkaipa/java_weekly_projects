package zoo;

public class Pigeon extends Bird {
    private String species;

    public Pigeon() {}
    public Pigeon(String name, int age, double weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }
    public Pigeon(String name, String species) {
        super(name, "gray");
        this.species = species;
    }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }

    @Override
    public void eat() {
        System.out.println("Pigeon eats grains.");
    }

    @Override
    public void getVoice() {
        System.out.println("Pigeon coos.");
    }

    public void flyInCircles() {
        System.out.println("Pigeon flies in circles.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Species: " + species;
    }
}

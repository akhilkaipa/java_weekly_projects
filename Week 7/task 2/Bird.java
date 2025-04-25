package zoo;

public class Bird extends Animal {
    private String featherColor;

    public Bird() {}
    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }
    public Bird(String name, String featherColor) {
        super(name);
        this.featherColor = featherColor;
    }

    public String getFeatherColor() { return featherColor; }
    public void setFeatherColor(String featherColor) { this.featherColor = featherColor; }

    @Override
    public void eat() {
        System.out.println("Bird pecks seeds.");
    }

    @Override
    public void getVoice() {
        System.out.println("Bird chirps.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Feather Color: " + featherColor;
    }
}

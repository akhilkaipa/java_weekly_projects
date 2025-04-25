package zoo;

public class Fish extends Animal {
    private String scaleColor;

    public Fish() {}
    public Fish(String name, int age, double weight, String scaleColor) {
        super(name, age, weight);
        this.scaleColor = scaleColor;
    }
    public Fish(String name, String scaleColor) {
        super(name);
        this.scaleColor = scaleColor;
    }

    public String getScaleColor() { return scaleColor; }
    public void setScaleColor(String scaleColor) { this.scaleColor = scaleColor; }

    @Override
    public void eat() {
        System.out.println("Fish eats algae.");
    }

    @Override
    public void getVoice() {
        System.out.println("Fish makes no sound.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Scale Color: " + scaleColor;
    }
}

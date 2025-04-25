public class Blowfish package zoo;

public class Blowfish extends Fish {
    private boolean isInflated;

    public Blowfish() {}
    public Blowfish(String name, int age, double weight, String scaleColor, boolean isInflated) {
        super(name, age, weight, scaleColor);
        this.isInflated = isInflated;
    }
    public Blowfish(String name, boolean isInflated) {
        super(name, "silver");
        this.isInflated = isInflated;
    }

    public boolean isInflated() { return isInflated; }
    public void setInflated(boolean inflated) { isInflated = inflated; }

    @Override
    public void eat() {
        System.out.println("Blowfish eats small crustaceans.");
    }

    @Override
    public void getVoice() {
        System.out.println("Blowfish remains silent.");
    }

    public void inflate() {
        isInflated = true;
        System.out.println("Blowfish inflates!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Is Inflated: " + isInflated;
    }
}
{
}

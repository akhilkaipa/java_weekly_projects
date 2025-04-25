package zoo;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Dog("Rex", 4, 25.5, "Labrador");
        animals[1] = new Pigeon("Sky", 2, 1.2, "white", "Rock Pigeon");
        animals[2] = new Blowfish("Puffy", 1, 0.8, "blue", false);

        for (Animal a : animals) {
            System.out.println(a.toString());
            a.eat();
            a.getVoice();

            if (a instanceof Dog) ((Dog) a).fetch();
            if (a instanceof Pigeon) ((Pigeon) a).flyInCircles();
            if (a instanceof Blowfish) ((Blowfish) a).inflate();

            System.out.println("-----");
        }
    }
}

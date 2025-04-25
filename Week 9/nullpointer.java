public class Main {


    static class ExceptionGenerator {
        public void generateNullPointer() {
            String str = null;

            System.out.println(str.length());
        }
    }

    public static void main(String[] args) {
        ExceptionGenerator eg = new ExceptionGenerator();

        try {
            eg.generateNullPointer();
        } catch (NullPointerException e) {
            System.out.println("Oops! Something went wrong: A null value was accessed.");
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}

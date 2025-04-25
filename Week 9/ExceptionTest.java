import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;


class MyException1 extends Exception {
    private static final Logger logger = Logger.getLogger("LoggingException");

    public MyException1() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}


class MyException2 extends Exception {
    private static final Logger logger = Logger.getLogger("LoggingException");

    public MyException2() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

// Main class
public class ExceptionTest {

    static void methodOne() throws MyException1, MyException2 {
        throw new MyException1();
    }


    static void methodTwo() throws MyException1, MyException2 {
        throw new MyException2();
    }

    public static void main(String[] args) {

        try {
            methodOne();
        } catch (Exception e) {
            System.out.println("Caught exception from methodOne: " + e);
        }


        try {
            methodTwo();
        } catch (Exception e) {
            System.out.println("Caught exception from methodTwo: " + e);
        }
    }
}

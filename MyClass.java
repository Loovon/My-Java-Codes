import java.util.logging.Logger;

public class MyClass
{
    private static final Logger LOGGER = Logger.getLogger(MyClass.class.getName());

    public static void main(String[] args) {
        LOGGER.info("This is an informational message.");
    }
}

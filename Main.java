import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class Main {

    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        Double num1 = Input.getDouble();
        char operation = Input.getOperation();
        Double num2 = Input.getDouble();
        Double result = Operation.calc(num1,num2,operation);
        System.out.println("Результат операции: "+result);
        LOGGER.log(Level.INFO, "sdf");
    }
}


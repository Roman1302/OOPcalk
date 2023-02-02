import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Scanner;

public class Input {

    static Scanner scanner = new Scanner(System.in);
    public static double getDouble(){
        System.out.println("Введите рациональное число (разделитель запятая):");
        double num;
        if(scanner.hasNextDouble()){
            num = scanner.nextDouble();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            
            scanner.next();//рекурсия
            num = getDouble();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }
    
}

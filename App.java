import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        float Numero1 = 0;
        float Numero2 = 0;
        int ope = 0;

        System.out.println("Digite el primer numero");
        Numero1 = sc.nextFloat();
        System.out.println("Digite el segundo numero");
        Numero2 = sc.nextFloat();
        System.out.println(
                "Digite el numero de la operacion a realizar: 1: suma, 2: resta, 3: multipliacion, 4: division ");
        ope = sc.nextInt();

        operaciones oper = new operaciones();
        float resul = 0;

        switch (ope) {
            case 1:
                resul = oper.suma();
                break;
            case 2:
                resul = oper.resta();
                break;
            case 3:
                resul = oper.multiplicacion();
                break;
            case 4:
                if (Numero2 != 0) {
                    resul = oper.division();
                } else {
                    System.out.println("Cannot divide by zero. Please try again.");
                    break;
                }
            default:
                break;
        }
        System.out.println("El resultado de la operacion es: " + resul);
    }
}

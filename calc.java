import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
//        calc cal = new calc();
        double x1;
        do{
            Scanner sc = new  Scanner(System.in);
            System.out.println("Будь-ласка введіть x1: ");
            try {

                x1 = sc.nextDouble();

                if (x1 <= 3.28 || x1 >= 114.428){
                    System.out.printf("y1 = %.3f %n",calc.one(x1));
                    System.out.printf("y2 = %.3f %n", calc.two(x1));
                    System.out.printf("y3 = %.3f %n" , calc.tree(x1));
                    System.out.printf("y4 = %.3f %n" , calc.four(x1));

                }

                else {
                    System.out.println("Неправильний діапазон. Введіть значення в діапазоні x1 <= 3.28 || x1 >= 114.428");
                }


            }catch (InputMismatchException e) {
                System.out.println("Неправильний тип даних.");
            }
        }while (true);
    }

    public static Double one(double x1) {

        double y = x1* 7.012;
        return y;

    }
    public static Double four(double x1) {

        double y = (2.226 * (Math.pow(x1, 4)) + (2.196 * Math.pow(x1, 3))) -  (7.083 * Math.pow(x1, 2)) + x1*3.724;
        return y;

    }
    public static Double tree(double x1) {

        double y = (4.729 * Math.pow(x1, 3)) -  (2.429 * Math.pow(x1, 2)) + x1*2.987;
        return y;

    }
    public static Double two(double x1) {

        double y = (2.022 * Math.pow(x1, 2)) + x1*4.567;
        return y;

    }

}

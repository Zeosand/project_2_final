import java.util.Scanner;
public class LinearEquationLogic {
    private Scanner scan;
    private LinearEquation linearEquation;
    public LinearEquationLogic() {
        scan = new Scanner(System.in);
    }


    public void start() {
            getCoordinates();
    }


    private void getCoordinates() { //helper
        String restart = "y";
        System.out.println("Welcome to the linear equation calculator!");
        while (restart.equals("y")) {
        System.out.print("Enter coordinate 1: ");
        String cord1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String cord2 = scan.nextLine();
        int x1 = Integer.parseInt(cord1.substring(1, cord1.indexOf(",")));
        int y1 = Integer.parseInt(cord1.substring(cord1.indexOf(",") + 2, cord1.indexOf(")")));
        int x2 = Integer.parseInt(cord2.substring(1, cord2.indexOf(",")));
        int y2 = Integer.parseInt(cord2.substring(cord2.indexOf(",") + 2, cord2.indexOf(")")));
        linearEquation = new LinearEquation(x1, y1, x2, y2);
        if (x1 == x2) {
            System.out.println();
            System.out.println("These points are on a vertical line: x = " + x1);
            System.out.println();
        } else {
            System.out.println();
            System.out.println(linearEquation.lineInfo());
            System.out.println();
            System.out.print("Enter a value for x: ");
            double x = scan.nextDouble();
            scan.nextLine();
            System.out.println("The point on the line is " + linearEquation.coordinateForX(x));
        }
        System.out.println();
        System.out.print("Would you like you enter another pair of coordinates? y/n: ");
        restart = scan.nextLine().toLowerCase();
        }
        System.out.println("Thank you for using the slope calculator, goodbye!");
    }
}

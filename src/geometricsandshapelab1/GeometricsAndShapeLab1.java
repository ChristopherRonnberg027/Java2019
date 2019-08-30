package geometricsandshapelab1;

import java.util.Scanner;

public class GeometricsAndShapeLab1 {

    static Scanner keyboard = new Scanner(System.in);
    static double base;
    static double height;
    static boolean loop;
    static boolean invalidInput;

    public static void main(String[] args) {

        System.out.println("Welcome!");
        menu();
    }

    static int menu() {

        int choice;
        loop = true;

        do {
            System.out.println("***********************************");
            System.out.println("Choose your geometric shape (1-4)");
            System.out.println("          1. Circle");
            System.out.println("          2. Rectangle");
            System.out.println("          3. Triangle");
            System.out.println("          4. Exit");
            System.out.println("***********************************");
            choice = keyboard.nextInt();
            keyboard.nextLine();

            switch (choice) {
                case 1:
                    circleManagement();
                    break;

                case 2:
                    rectangleManagement();
                    break;
                case 3:
                    triangleManagement();
                    break;
                default:
                    System.out.println("Ending program");
                    loop = false;
                    break;
            }
        } while (loop);
        return choice;
    }

    private static void triangleManagement() {
        System.out.println("______________________________");
        System.out.println("Triangle");
        System.out.println("We will only calculate the triangle's area");
        System.out.println("Input the triangle's base: ");
        base = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("Input the triangle's height: ");
        height = keyboard.nextDouble();
        Triangle t = new Triangle(base, height);
        System.out.println("The triangle's area is: " + t.area());
        contunieCalculate();
    }

    private static void rectangleManagement() {
        System.out.println("______________________________");
        System.out.println("Rectangle");
        System.out.println("What do you want to calculate?");
        System.out.println("1. Area");
        System.out.println("2. Circumference");
        System.out.println("3. Area and Circumference");
        int rectangleChoice = keyboard.nextInt();
        keyboard.nextLine();

        switch (rectangleChoice) {

            case 1:
                System.out.println("1. Area");
                System.out.println("Input the rectangle's base: ");
                base = keyboard.nextDouble();
                keyboard.nextLine();
                System.out.println("Input the rectangle's height: ");
                height = keyboard.nextDouble();
                Rectangle r1 = new Rectangle(base, height);
                System.out.println("The rectangle's area is: " + r1.area());
                contunieCalculate();
                break;
            case 2:
                System.out.println("1. Circumference");
                System.out.println("Input the rectangle's base: ");
                base = keyboard.nextDouble();
                keyboard.nextLine();
                System.out.println("Input the rectangle's height: ");
                height = keyboard.nextDouble();
                Rectangle r2 = new Rectangle(base, height);
                System.out.println("The rectangle's circumference is: " + r2.circumference());
                contunieCalculate();
                break;
            case 3:
                System.out.println("1. Area and Circumference");
                System.out.println("Input the rectangle's base: ");
                base = keyboard.nextDouble();
                keyboard.nextLine();
                System.out.println("Input the rectangle's height: ");
                height = keyboard.nextDouble();
                Rectangle r3 = new Rectangle(base, height);
                System.out.println(r3);
                contunieCalculate();
                break;

            default:
                System.out.println("Invalid input!");
                break;
        }
    }

    private static void circleManagement() {
        System.out.println("______________________________");
        System.out.println("Circle");
        System.out.println("What do you want to calculate?");
        System.out.println("1. Area");
        System.out.println("2. Circumference");
        System.out.println("3. Area and Circumference");
        int circleChoice = keyboard.nextInt();
        keyboard.nextLine();
        double radius;

        switch (circleChoice) {

            case 1:
                System.out.println("1. Area");
                System.out.println("Input the circle's radius: ");
                radius = keyboard.nextDouble();
                keyboard.nextLine();
                Circle c1 = new Circle(radius);
                System.out.println("The circle's area is: " + c1.area());
                contunieCalculate();
                break;
            case 2:
                System.out.println("2. Circumference");
                System.out.println("Input the circle's radius: ");
                radius = keyboard.nextDouble();
                keyboard.nextLine();
                Circle c2 = new Circle(radius);
                System.out.println("The circle's circumference is: " + c2.circumference());
                contunieCalculate();
                break;
            case 3:
                System.out.println("3. Area and Circumference");
                System.out.println("Input the circle's radius: ");
                radius = keyboard.nextDouble();
                keyboard.nextLine();
                Circle c3 = new Circle(radius);
                System.out.println(c3);
                contunieCalculate();
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    }

    private static void contunieCalculate() {
        invalidInput = true;
        System.out.println("Do you want to calculate an other shape? yes/no?");
        keyboard.nextLine();
        String answer = keyboard.nextLine();
        do {
            if (answer.equals("yes")) {
                loop = true;
                invalidInput = false;
            } else if (answer.equals("no")) {
                System.out.println("Program ending");
                loop = false;
                invalidInput = false;
            } else {
                System.out.println("Wrong input, try again");
                System.out.println("yes/no?");
                answer = keyboard.nextLine();
            }
        } while (invalidInput);
    }

}

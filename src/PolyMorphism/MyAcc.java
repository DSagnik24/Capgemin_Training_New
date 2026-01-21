package PolyMorphism;

import java.util.Scanner;

public class MyAcc {
    public static void main(String[] args) {

        AreaCalculator ac = new AreaCalculator();
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");
            System.out.print("Enter value: ");

            int a = in.nextInt();

            switch (a) {
                case 1:
                    System.out.print("Provide side: ");
                    double n = in.nextDouble();
                    System.out.println(ac.calcuArea(n));
                    break;

                case 2:
                    System.out.print("Provide sideA: ");
                    double o = in.nextDouble();
                    System.out.print("Provide sideB: ");
                    double m = in.nextDouble();
                    System.out.println(ac.calcuArea(o, m));
                    break;

                case 3:
                    System.out.print("Provide radius: ");
                    double r = in.nextDouble();
                    System.out.println(ac.calcuArea(r));
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    in.close();
                    return;   // clean exit

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}

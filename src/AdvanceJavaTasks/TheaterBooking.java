package AdvanceJavaTasks;

import java.util.Scanner;

public class TheaterBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = 5;
        int cols = 5;
        char[][] seats = new char[rows][cols];

        // Initialize seats
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = 'O';
            }
        }

        while (true) {
            // Display seating arrangement
            System.out.println("\nCurrent Seating Arrangement:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(seats[i][j] + " ");
                }
                System.out.println();
            }

            System.out.print("\nEnter row number (-1 to exit): ");
            int r = sc.nextInt();

            if (r == -1) {
                System.out.println("Booking process ended.");
                break;
            }

            System.out.print("Enter column number: ");
            int c = sc.nextInt();

            if (r >= 0 && r < rows && c >= 0 && c < cols) {
                if (seats[r][c] == 'O') {
                    seats[r][c] = 'X';
                    System.out.println("Seat booked successfully!");
                } else {
                    System.out.println("Seat already reserved.");
                }
            } else {
                System.out.println("Invalid seat selection.");
            }
        }

        sc.close();
    }
}

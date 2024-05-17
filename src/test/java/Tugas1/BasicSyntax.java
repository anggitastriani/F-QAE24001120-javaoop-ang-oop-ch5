package Tugas1;

import java.util.Scanner;

public class BasicSyntax {
    public void challenge(){
        int first5hours = 1;
        double charge = 0.5;
        int flat = 15;

        Scanner input = new Scanner(System.in);
        System.out.print("Parking duration: ");
        int result = input.nextInt();

        int after5hours = result - 5;
        int days = result / 24;
        int after24hours = result - (days * 24);

        if(result <= 5){
            System.out.println("Parking fee: $" + first5hours);
        } else if (result > 5 && result < 24){
            System.out.println("Parking fee: $" + (first5hours + (after5hours * charge)));
        } else if (result == 24) {
            System.out.println("Parking fee: $" + (flat));
        } else if (result % 24 == 0) {
            System.out.println("Parking fee: $" + (flat * days));
        } else if (result > 24 && result % 24 != 0) {
            System.out.println("Parking fee: $" + ((flat * days) + (after24hours * charge)));
        }
    }
}

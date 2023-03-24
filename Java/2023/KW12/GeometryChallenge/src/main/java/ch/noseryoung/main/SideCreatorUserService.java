package ch.noseryoung.main;

import java.util.Scanner;

public class SideCreatorUserService implements ShapeSideCreator {
    private double roundToHalf(double d) {
        return Math.round(d * 2) / 2.0;
    }

    @Override
    public double createSide() {
        Scanner scan = new Scanner(System.in);


        System.out.println("**********************************");
        System.out.println("Geben Sie eine Seitenlänge ein: ");
        double side = roundToHalf(scan.nextDouble());
        System.out.println("**********************************");

        return side;
    }
}



import java.util.Scanner;

public class The_Babe {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        Stat BabeRuth = new Stat();

        System.out.println("Enter the player's name: ");
        String name = input.nextLine();

        System.out.println("Enter the number of hits: ");
        double hit = input.nextDouble();
        BabeRuth.setHits(hit);

        System.out.println("Enter the number of at bats: ");
        double ab = input.nextDouble();
        BabeRuth.setAB(ab);

        System.out.println("Enter the number of doubles: ");
        double d = input.nextDouble();
        BabeRuth.setDbl(d);

        System.out.println("Enter the number of triples: ");
        double t = input.nextDouble();
        BabeRuth.setTriple(t);

        System.out.println("Enter the number of home runs: ");
        double hr = input.nextDouble();
        BabeRuth.setHR(hr);

        System.out.println("Enter the number of runs scored: ");
        double r = input.nextDouble();
        BabeRuth.setR(r);

        System.out.println("Enter the number of times hit by a pitch: ");
        double hbp = input.nextDouble();
        BabeRuth.setHBP(hbp);

        System.out.println("Enter the number of walks: ");
        double bb = input.nextDouble();
        BabeRuth.setBB(bb);

        System.out.printf("%n%s%s%n%s%n%s%.3f%n%s%.3f%n%s%.3f%n%s%.3f%n%s%.3f%n",
                "Player name: ", name,
                "----Batting stats----",
                "Batting Average: ", BabeRuth.BA(),
                "On Base Percentage: ", BabeRuth.OBP(),
                "Slug Percentage: ", BabeRuth.SLG(),
                "On-Base Plus Slugging: ", BabeRuth.OPS(),
                "Total Bases: ", BabeRuth.TB());
        

	}

}

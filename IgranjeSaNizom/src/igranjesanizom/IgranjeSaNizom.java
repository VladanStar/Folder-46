package igranjesanizom;

import java.util.Arrays;
import java.util.Scanner;

public class IgranjeSaNizom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite broj clanova niza: ");
        int n = input.nextInt();
        int[] niz = new int[n];
        ucitajNiz(niz);
        System.out.println("Zbir niza je: " + zbirNiza(niz));
        System.out.println("Srednja vrednost: " + zbirNiza(niz) / (double) niz.length);
        System.out.println("Minimum niza je: " + min(niz));
        System.out.println("Maksimum niza je: " + max(niz));
        sortiraj(niz);
        System.out.println("Štampam sortiran niz! ");
        stampajNiz(niz);
        System.out.println("Štampam niz pomoću for-each petlje! ");
        stampajNizForEach(niz);
        System.out.println("Koristim Arrays klasu da niz prikažem kao String!");
        System.out.println(Arrays.toString(niz));
        System.out.println("********************************************");
        System.out.println("Radimo sa nizom objekata (String)!!! ");
        System.out.print("Koliko niz ima članova ? ");
        n = input.nextInt();
        String[] imena = new String[n];
        ucitajNiz(imena);
        Arrays.sort(imena);
        System.out.println("PROVERA!!! " + Arrays.binarySearch(imena, "Ana"));
        stampajNiz(imena);
    }

    private static void ucitajNiz(int a[]) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = input.nextInt();
        }
    }

    private static int zbirNiza(int a[]) {
        int zbir = 0;
        for (int i = 0; i < a.length; i++) {
            zbir += a[i];
        }
        return zbir;
    }

    private static int min(int a[]) {
        int m = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < m) {
                m = a[i];
            }
        }
        return m;
    }

    private static int max(int a[]) {
        int m = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > m) {
                m = a[i];
            }
        }
        return m;
    }

    private static int sortiraj(int a[]) {
        int m = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > m) {
                m = a[i];
            }
        }
        return m;
    }

    private static void stampajNiz(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print("a [" + i + "] = " + a[i] + " ");
        }
        System.out.println(" ");
    }

    private static void stampajNizForEach(int a[]) {
        for (int pom : a) {
            System.out.println(pom + " ");

        }
        System.out.println(" ");
    }

    private static void ucitajNiz(String[] imena) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < imena.length; i++) {
            System.out.print("ime[" + i + "] = ");
            imena[i] = input.next();
        }
    }

    private static void stampajNiz(String[] imena) {
        for (int i = 0; i < imena.length; i++) {
            System.out.print("ime [" + i + "] = " + imena[i] + " ");
        }
        System.out.println(" ");
    }
    

}

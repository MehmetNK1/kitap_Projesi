package Ucus_Proje;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double mesafeB = 0.10 * 500;
        double mesafeC = 0.10 * 700;
        double mesafeD = 0.10 * 900;



        System.out.println();
        System.out.print("isminizi giriniz ..: ");
        String isim = scan.next();
        System.out.print("yasinizi giriniz ..: ");
        int yas = scan.nextInt();
        System.out.print("hangi sehre gidilecek..B - C - D :");
        String mesafe = scan.next().toUpperCase();
        System.out.print("tek yon icin 1'e , \ncift yon icin 2' ye bas :");
        int yon = scan.nextInt();

        if (yas < 12) {
            if (mesafe.equals("B")) {
                if (yon == 1) {
                    System.out.println("bilet fiyati : " + mesafeB * 0.5 + "$");
                } else if (yon == 2) {
                    System.out.println("bilet fiyati : " + (mesafeB * 0.5 * 0.8) * 2 + "$");
                } else
                    System.out.println("hatali giris yaotin..");

            } else if (mesafe.equals("C")) {
                if (yon == 1) {
                    System.out.println("bilet fiyati : " + mesafeC * 0.5 + "$");
                } else if (yon == 2) {
                    System.out.println("bilet fiyati : " + (mesafeC * 0.5 * 0.8) * 2 + "$");
                } else
                    System.out.println("hatali giris yaotin..");

            } else if (mesafe.equals("D")) {
                if (yon == 1) {
                    System.out.println("bilet fiyati : " + mesafeD * 0.5 + "$");
                } else if (yon == 2) {
                    System.out.println("bilet fiyati : " + (mesafeD * 0.5 * 0.8) * 2 + "$");
                } else
                    System.out.println("hatali giris yaotin..");
            }
        } else if (12 <= yas && yas < 24) {
            if (mesafe.equals("B")) {
                if (yon == 1) {
                    System.out.println("bilet fiyati : " + mesafeB * 0.9 + "$");
                } else if (yon == 2) {
                    System.out.println("bilet fiyati : " + (mesafeB * 0.9 * 0.8) * 2 + "$");
                } else
                    System.out.println("hatali giris yaotin..");

            } else if (mesafe.equals("C")) {
                if (yon == 1) {
                    System.out.println("bilet fiyati : " + mesafeC * 0.9 + "$");
                } else if (yon == 2) {
                    System.out.println("bilet fiyati : " + (mesafeC * 0.9 * 0.8) * 2 + "$");
                } else
                    System.out.println("hatali giris yaotin..");

            } else if (mesafe.equals("D")) {
                if (yon == 1) {
                    System.out.println("bilet fiyati : " + mesafeD * 0.9 + "$");
                } else if (yon == 2) {
                    System.out.println("bilet fiyati : " + (mesafeD * 0.9 * 0.8) * 2 + "$");
                } else
                    System.out.println("hatali giris yaotin..");
            }
        } else if (65 < yas) {
            if (mesafe.equals("B")) {
                if (yon == 1) {
                    System.out.println("bilet fiyati : " + mesafeB * 0.7 + "$");
                } else if (yon == 2) {


                    System.out.println("bilet fiyati : " + (mesafeB * 0.7 * 0.8) * 2 + "$");
                } else
                    System.out.println("hatali giris yaotin..");

            } else if (mesafe.equals("C")) {
                if (yon == 1) {
                    System.out.println("bilet fiyati : " + mesafeC * 0.7 + "$");
                } else if (yon == 2) {
                    System.out.println("bilet fiyati : " + (mesafeC * 0.7 * 0.8) * 2 + "$");
                } else
                    System.out.println("hatali giris yaotin..");

            } else if (mesafe.equals("D")) {
                if (yon == 1) {
                    System.out.println("bilet fiyati : " + mesafeD * 0.7 + "$");
                } else if (yon == 2) {
                    System.out.println("bilet fiyati : " + (mesafeD * 0.7 * 0.8) * 2 + "$");
                } else
                    System.out.println("hatali giris yaotin..");
            }
        }
    }
}

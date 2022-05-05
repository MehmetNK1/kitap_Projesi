package Kahve_Makinesi4;

import java.util.Scanner;

public class Kahve_Mak {

    public static void main(String[] args) {

        menu ();
       // turkkahvesi ();
       // filtrekahve ();
       // espreso ();
       // cikis ();

    }

    public static void menu() {
        System.out.println("Hosgeldiniz.."+
                "\nHangi kahveyi icmek istersiniz.. ?"+
                "\n1. Turk Kahvesi"+
                "\n2. Filre Kahve"+
                "\n3. Espresso"+
                "\n4. Cikis");
        System.out.print("Lutfen bir tercih yapiniz..");

        Scanner scan = new Scanner(System.in);
        int tercih = scan.nextInt();
        switch(tercih) {
            case 1:
                turkkahvesi();

                break;
            case 2:
                filtrekahve();

                break;
            case 3:
                espreso();

                break;
            case 4:
                cikis();
                break;
            default:
                System.out.println("Hatali islem lutfen tercih yapiniz.. ");


        }

    }

    private static void turkkahvesi() {
        System.out.print("Turk Kahvesini sectiniz.");
        System.out.println("Kahveniz nasil olsun ?"+
                "\n1. Sade"+
                "\n2. Az sekerli"+
                "\n3. Orta");
        Scanner scan = new Scanner(System.in);
        int turk = scan.nextInt();
        switch(turk){
            case 1: {
                System.out.print("Sade kahveniz hazirlaniyor." +
                        "\nMenu icin 1 " +
                        "\nCikis icin 2 ye basiniz..");
                int secim = scan.nextInt();
                if (secim == 1) {
                    menu();
                } else if (secim == 2) {
                    //scan.nextLine();//
                    cikis();
                } else {
                    System.out.println("Hatali secim yaptiniz.");
                }
                break;
            }
            case 2: {
                System.out.print("Az sekerli kahveniz hazirlaniyor." +
                        "\nMenu icin 1 " +
                        "\nCikis icin 2 ye basiniz..");
                int secim1 = scan.nextInt();
                if (secim1 == 1) {
                    menu();
                } else if (secim1 == 2) {
                    cikis();
                } else {
                    System.out.println("Hatali secim yaptiniz.");
                }
                break;
            }
            case 3: {
                System.out.print("Orta kahveniz hazirlaniyor." +
                        "\nMenu icin 1 " +
                        "\nCikis icin 2 ye basiniz..");
                int secim2 = scan.nextInt();
                if (secim2 == 1) {
                    menu();
                } else if (secim2 == 2) {
                    cikis();
                } else {
                    System.out.println("Hatali secim yaptiniz.");
                }
                break;
            }
        }
    }

    private static void filtrekahve() {
    }

    private static void espreso() {
    }

    private static void cikis() {
        System.out.println("Gule gule..");
    }

}

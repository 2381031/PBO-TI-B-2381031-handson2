package Latihan;

import java.util.Scanner;

public class Soal3 {
    /**
    *Buatlah sebuah program kalkulator sederhan dengan operator (=, -, x, /, %)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka1 : ");
        double angka1 = input.nextDouble();

        System.out.println("Masukkan angka2 : ");
        double angka2 = input.nextDouble();

        System.out.println("1.tambah");
        System.out.println("2.kurang");
        System.out.println("3.kali");
        System.out.println("4.bagi");
        System.out.println("5.modulus");

        System.out.println("Pilihlah angka operasi");
        int jumlah = input.nextInt();
        switch (jumlah) {
            case 1:
                System.out.println("Hasilnya : " + (angka1 + angka2));
                break;
            case 2:
                System.out.println("Hasilnya : " + (angka1 - angka2));
                break;
            case 3:
                System.out.println("Hasilnya : " + (angka1 * angka2));
                break;
            case 4:
                System.out.println("Hasilnya : " + (angka1 / angka2));
                break;
            case 5:
                System.out.println("Hasilnya : " + (angka1 % angka2));
                break;
            default:
                System.out.println("Angka tidak tersedia");
                break;
        }
    }

}

package Latihan;

import java.util.Scanner;

public class Soal2 {
    /**
     * Buatlah sebuah program yang mencari nilai maksimum dari 3 bilangan
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Masukkan bilangan Pertama: ");
        int pertama = input.nextInt();

        System.out.println("Masukkan bilangan Kedua: ");
        int kedua = input.nextInt();

        System.out.println("Masukkan bilangan ketiga");
        int ketiga = input.nextInt();

        if(pertama >= kedua && pertama >= ketiga ){
            System.out.println("Angka terbesar adalah: "+pertama);
        } else if (kedua > ketiga) {
            System.out.println("Angka terbesar adalah: " + kedua);
        }else if (ketiga > kedua) {
            System.out.println("Angka terbesar adalah: " + ketiga);
        }else {
            System.out.println("Angka tersebut sama");
        }
        if (pertama <= kedua && pertama <= ketiga) {
            System.out.println("Angka terkecil adalah: " + pertama);
        } else if (kedua <= ketiga) {
            System.out.println("Angka terkecil adalah: " + kedua);
        } else {
            System.out.println("Angka terkecil adalah: " + ketiga);
        }
    }
}

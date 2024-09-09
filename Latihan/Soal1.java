package Latihan;

import java.util.Scanner;

public class Soal1 {
    /**
     * Buatlah sebuah program yang mencari nilai maksimum dari 2 bilangan
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Masukkan bilangan Pertama: ");
                int pertama = input.nextInt();

        System.out.println("Masukkan bilangan Kedua: ");
                int kedua = input.nextInt();

                if(pertama > kedua){
                    System.out.println("Angka terbesar adalah: "+pertama);
                } else if (kedua > pertama) {
                    System.out.println("Angka terbesar adalah: "+kedua);
                }else {
                    System.out.println("Angka tersebut sama");
                }
    }
}

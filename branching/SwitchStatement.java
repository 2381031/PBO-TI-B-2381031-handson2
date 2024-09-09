package branching;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nomor hari (1-7) : ");
        int nomorHari = input.nextInt();

        String namaHari = "";

        switch (nomorHari) {
            case 1:
                namaHari = "Minggu";
                System.out.println("Hari yang anda pilih adalah hari: " + namaHari);
                break;
            case 2:
                namaHari = "Senin";
                System.out.println("Hari yang anda pilih adalah hari: " + namaHari);
                break;
            case 3:
                namaHari = "Selasa";
                System.out.println("Hari yang anda pilih adalah hari: " + namaHari);
                break;
            case 4:
                namaHari = "Rabu";
                System.out.println("Hari yang anda pilih adalah hari: " + namaHari);
                break;
            case 5:
                namaHari = "Kamis";
                System.out.println("Hari yang anda pilih adalah hari: " + namaHari);
                break;
            case 6:
                namaHari = "Jumat";
                System.out.println("Hari yang anda pilih adalah hari: " + namaHari);
                break;
            case 7:
                namaHari = "Sabtu";
                System.out.println("Hari yang anda pilih adalah hari: " + namaHari);
                break;
            default:
                System.out.println("Masukkan nomor hari diantara 1 - 7");
                System.exit(0);
        }
    }
}
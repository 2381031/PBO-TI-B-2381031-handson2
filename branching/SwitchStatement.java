package branching;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nomor hari (1-7) : ";
        int nomorHari = input.nextInt();

        String namaHari = "";

        if(nomorHari == 1) {
            namaHari = "Minggu";
        } else if (nomorHari == 2) {
            namaHari = "Senin";
        } else if (nomorHari == 3) {
            namaHari = "Selasa";
        }else if (nomorHari == 4) {
            namaHari = "Rabu";
    } else if else if (nomorHari == 5) {
            namaHari = "Kamis";
        }else if (nomorHari == 6) {
            namaHari = "Jumat";
        }else if (nomorHari == 7) {
            namaHari = "Sabtu";
        }
        System.out.println("hari + Nama hari");
    }

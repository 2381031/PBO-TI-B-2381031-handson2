package ternaryoperator;

public class ternaryoperator {
    public static void main(String[] args) {
        int nilai = 75;
        String gradeNilaiPBO = "A";
        String hasil = gradeNilaiPBO.equals("A") ? "Lulus" : "Tidak Lulus";

        String outputHasil = "Hasil Ujian : ";
        System.out.println(outputHasil.concat(hasil));

        System.out.println("1" + 1);
    }
}

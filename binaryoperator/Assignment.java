package binaryoperator;

public class Assignment {
    public static void main(String[] args) {
        int angka = 10;
        String nama = "Andre Lumbantoruan";

        int x = 5;
        x += 3;
        System.out.println("Nilai x setelah +=3 adalah" +x);

        int y = 5;
        y -= 3;
        System.out.println("Nilai x setelah -=3 adalah" +y);

        int z = 5;
        z *= 3;
        System.out.println("Nilai x setelah *=3 adalah" +z);

        int a = 20;
        a /= 4;
        System.out.println("Nilai x setelah /=3 adalah" +a);

        int b = 20;
        b %= 20;
        System.out.println("Nilai x setelah %=3 adalah" +b);

        int b = 20;
        b %=3;

    }
}

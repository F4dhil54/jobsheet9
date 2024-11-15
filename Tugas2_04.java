import java.util.Scanner;

public class Tugas2_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlahPesanan = input.nextInt();
        input.nextLine();

        String[] namaPesanan = new String[jumlahPesanan];
        double[] hargaPesanan = new double[jumlahPesanan];

        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.print("Masukkan nama pesanan " + (i + 1) + "      : ");
            namaPesanan[i] = input.nextLine();
            System.out.print("Masukkan harga untuk " + namaPesanan[i] + ": ");
            hargaPesanan[i] = input.nextDouble();
            input.nextLine();
        }
        double totalBiaya = 0;
        for (int i = 0; i < jumlahPesanan; i++) {
            totalBiaya += hargaPesanan[i];
        }
        System.out.println("\nDaftar Pesanan:");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.println("- " + namaPesanan[i] + ": Rp " + hargaPesanan[i]);
        }
        System.out.println();
        System.out.println("Total Biaya: Rp " + totalBiaya);
        input.close();
    }
}
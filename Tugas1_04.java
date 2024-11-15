import java.util.Scanner;

public class Tugas1_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahSiswa = 0;
        System.out.print("Masukkan jumlah siswa : ");
        jumlahSiswa = input.nextInt();
        int[] nilaiMahasiswa = new int[jumlahSiswa];
        double total = 0, rataNilai;
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilaiMahasiswa[i] = input.nextInt();
        }
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            total += nilaiMahasiswa[i];
        }
        int nilaiTertinggi = nilaiMahasiswa[0], nilaiTerendah = nilaiMahasiswa[0];
        for (int i = 1; i < nilaiMahasiswa.length; i++) {
            if (nilaiMahasiswa[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMahasiswa[i];
            }
        }
        rataNilai = total / nilaiMahasiswa.length;
        System.out.println();
        System.out.println("Rata-Rata nilai Mahasiswa : " + rataNilai);
        System.out.println("Nilai Tertinggi Mahasiswa : " + nilaiTertinggi);
        System.out.println("Nilai Terendah Mahasiswa : " + nilaiTerendah);
        System.out.println();

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.println("Nilau mahasiswa ke-" + i + " : " + nilaiMahasiswa[i]);
        }
        input.close();
    }
}

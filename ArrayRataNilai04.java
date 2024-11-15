import java.util.Scanner;

public class ArrayRataNilai04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahSiswa = 0;
        System.out.print("Masukkan jumlah siswa : ");
        jumlahSiswa = input.nextInt();

        int[] nilaiMahasiswa = new int[jumlahSiswa];
        double total = 0, rataNilai, totalLulus = 0, totalTidakLulus = 0;
        int siswaLulus = 0, siswaTidakLulus = 0;

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMahasiswa[i] = input.nextInt();
        }

        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            total += nilaiMahasiswa[i];
            if (nilaiMahasiswa[i] > 70) {
                totalLulus += nilaiMahasiswa[i];
                siswaLulus++;
            } else {
                totalTidakLulus += nilaiMahasiswa[i];
                siswaTidakLulus++;
            }
        }
        rataNilai = total / jumlahSiswa;
        System.out.println("Rata-Rata nilai Mahasiswa : " + rataNilai);
        System.out.println("Mahasiswa dengan nilai lebih dari 70 sebanyak: " + siswaLulus);

        if (siswaLulus > 0) {
            double rataLulus = totalLulus / siswaLulus;
            System.out.println("Rata-Rata nilai Mahasiswa yang Lulus: " + rataLulus);
        } else {
            System.out.println("Tidak ada mahasiswa yang lulus.");
        }

        if (siswaTidakLulus > 0) {
            double rataTidakLulus = totalTidakLulus / siswaTidakLulus;
            System.out.println("Rata-Rata nilai Mahasiswa yang Tidak Lulus: " + rataTidakLulus);
        } else {
            System.out.println("Semua mahasiswa lulus.");
        }

        input.close();
    }
}

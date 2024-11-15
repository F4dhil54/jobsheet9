import java.util.Scanner;

public class SearchNilai04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahSiswa = 0;
        System.out.print("Masukkan jumah siswa : ");
        jumlahSiswa = input.nextInt();

        int[] arrayNilai = new int[jumlahSiswa];
        for (int i = 0; i < arrayNilai.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + i + " : ");
            arrayNilai[i] = input.nextInt();
        }
        int key, hasil = 0;
        System.out.print("Berapa nilai yang dicari : ");
        key = input.nextInt();
        for (int i = 0; i < arrayNilai.length; i++) {
            if (key == arrayNilai[i]) {
                hasil = i;
                break;
            } else {
                hasil = arrayNilai.length + 1;
            }
        }
        System.out.println();
        if (hasil == arrayNilai.length + 1) {
            System.out.println("Key " + key + " Tidak ditemukan");

        } else {
            System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
        }
        System.out.println();
    }
}

// System.out.println();
// System.out.println("Nilai " + key + " ketemu di indeks ke-" + hasil);
// System.out.println();
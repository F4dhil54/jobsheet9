import java.util.Scanner;

public class Tugas3_04 {
    public static void main(String[] args) {
        String[] menu = { "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino",
                "Chocolate Ice" };

        Scanner input = new Scanner(System.in);
        System.out.println(" ==== Daftar menu di kedai Marties ====");

        for (int i = 0; i < menu.length; i++) {
            System.out.println("- " + menu[i]);
        }
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananDicari = input.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(makananDicari)) {
                ditemukan = true;
                break;
            }
        }
        System.out.println("Menu \"" + makananDicari + "\" " + (ditemukan ? "tersedia di menu" : " Tidak tersedia di menu "));
        input.close();
    }
}

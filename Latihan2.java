import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean Jalan = true;
        String iniTeks = "";

        while (Jalan) {
            System.out.println("===Text Analyzer=== ");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");
            System.out.println("Pilih Operasi: ");
            int pilih = scanner.nextInt();
            scanner.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan teks:");
                    iniTeks = scanner.nextLine();
                    System.out.println("Masuk katanya");
                    break;
                case 2:
                    System.out.println("Jumlah karakter: " + iniTeks.length());
                    break;
                case 3:
                    String[] kata = iniTeks.split(" ");
                    System.out.println("Jumlah kata: " + kata.length);
                    break;
                case 4:
                    System.out.println("Masukkan kata yang dicari:");
                    String cari = scanner.nextLine();
                    if (iniTeks.contains(cari)) {
                        System.out.println("Kata ditemukan dalam teks");
                    } else {
                        System.out.println("Kata tidak ditemukan dalam teks");
                    }
                    break;
                case 5:
                    System.out.println("Keluar dari program");
                    System.exit(0);
                default:
                    System.out.println("Salah memasukan pilihan");
            }

        }
    }
}
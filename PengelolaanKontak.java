import java.util.ArrayList;
import java.util.Scanner;

class Kontak {
    String nama;
    String nomorTelepon;

    public Kontak(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", Nomor Telepon: " + nomorTelepon;
    }
}

public class PengelolaanKontak {
    private static ArrayList<Kontak> daftarKontak = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Aplikasi Pengelolaan Kontak ===");
            System.out.println("1. Tambah Kontak");
            System.out.println("2. Hapus Kontak");
            System.out.println("3. Tampilkan Kontak");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan (1/2/3/4): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    tambahKontak(scanner);
                    break;
                case 2:
                    hapusKontak(scanner);
                    break;
                case 3:
                    tampilkanKontak();
                    break;
                case 4:
                    System.out.println("Keluar dari aplikasi. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (pilihan != 4);

        scanner.close();
    }

    private static void tambahKontak(Scanner scanner) {
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan nomor telepon: ");
        String nomorTelepon = scanner.nextLine();
        daftarKontak.add(new Kontak(nama, nomorTelepon));
        System.out.println("Kontak '" + nama + "' berhasil ditambahkan!");
    }

    private static void hapusKontak(Scanner scanner) {
        tampilkanKontak();
        System.out.print("Masukkan nomor kontak yang ingin dihapus: ");
        int nomorKontak = scanner.nextInt();

        if (nomorKontak > 0 && nomorKontak <= daftarKontak.size()) {
            Kontak kontakDihapus = daftarKontak.remove(nomorKontak - 1);
            System.out.println("Kontak '" + kontakDihapus.nama + "' berhasil dihapus!");
        } else {
            System.out.println("Nomor kontak tidak valid.");
        }
    }

    private static void tampilkanKontak() {
        if (daftarKontak.isEmpty()) {
            System.out.println("Daftar kontak kosong.");
        } else {
            System.out.println("\nDaftar Kontak:");
            for (int i = 0; i < daftarKontak.size(); i++) {
                System.out.println((i + 1) + ". " + daftarKontak.get(i));
            }
        }
    }
}

import java.util.Random;
import java.util.Scanner;

public class TebakAngka {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int angkaRahasia = random.nextInt(100) + 1; // Angka rahasia antara 1 dan 100
        int tebakan = 0;
        int jumlahTebakan = 0;

        System.out.println("=== Selamat datang di permainan Tebak Angka! ===");
        System.out.println("Saya sudah memilih angka antara 1 dan 100.");
        
        while (tebakan != angkaRahasia) {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = scanner.nextInt();
            jumlahTebakan++;

            if (tebakan < angkaRahasia) {
                System.out.println("Tebakan Anda terlalu rendah. Coba lagi!");
            } else if (tebakan > angkaRahasia) {
                System.out.println("Tebakan Anda terlalu tinggi. Coba lagi!");
            } else {
                System.out.println("Selamat! Anda telah menebak angka yang benar: " + angkaRahasia);
                System.out.println("Jumlah tebakan: " + jumlahTebakan);
            }
        }

        scanner.close();
    }
}

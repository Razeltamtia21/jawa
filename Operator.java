import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Operator Sederhana ===");
        System.out.println("Pilih Operasi:");
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Kali");
        System.out.println("4. Bagi");

        System.out.print("Masukkan pilihan (1/2/3/4): ");
        int pilihan = scanner.nextInt();

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        switch (pilihan) {
            case 1:
                System.out.println("Hasil: " + angka1 + " + " + angka2 + " = " + (angka1 + angka2));
                break;
            case 2:
                System.out.println("Hasil: " + angka1 + " - " + angka2 + " = " + (angka1 - angka2));
                break;
            case 3:
                System.out.println("Hasil: " + angka1 + " * " + angka2 + " = " + (angka1 * angka2));
                break;
            case 4:
                if (angka2 != 0) {
                    System.out.println("Hasil: " + angka1 + " / " + angka2 + " = " + (angka1 / angka2));
                } else {
                    System.out.println("Tidak bisa membagi dengan nol");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }

        scanner.close();
    }
}

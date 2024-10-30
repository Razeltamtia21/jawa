import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Aplikasi Konversi Suhu ===");
        System.out.println("Pilih jenis konversi:");
        System.out.println("1. Celcius ke Fahrenheit");
        System.out.println("2. Celcius ke Kelvin");
        System.out.println("3. Fahrenheit ke Celcius");
        System.out.println("4. Kelvin ke Celcius");
        
        System.out.print("Masukkan pilihan (1/2/3/4): ");
        int pilihan = scanner.nextInt();
        
        double suhuAwal, suhuAkhir;
        
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan suhu dalam Celcius: ");
                suhuAwal = scanner.nextDouble();
                suhuAkhir = (suhuAwal * 9 / 5) + 32;
                System.out.printf("Suhu %.2f Celcius sama dengan %.2f Fahrenheit\n", suhuAwal, suhuAkhir);
                break;
            case 2:
                System.out.print("Masukkan suhu dalam Celcius: ");
                suhuAwal = scanner.nextDouble();
                suhuAkhir = suhuAwal + 273.15;
                System.out.printf("Suhu %.2f Celcius sama dengan %.2f Kelvin\n", suhuAwal, suhuAkhir);
                break;
            case 3:
                System.out.print("Masukkan suhu dalam Fahrenheit: ");
                suhuAwal = scanner.nextDouble();
                suhuAkhir = (suhuAwal - 32) * 5 / 9;
                System.out.printf("Suhu %.2f Fahrenheit sama dengan %.2f Celcius\n", suhuAwal, suhuAkhir);
                break;
            case 4:
                System.out.print("Masukkan suhu dalam Kelvin: ");
                suhuAwal = scanner.nextDouble();
                suhuAkhir = suhuAwal - 273.15;
                System.out.printf("Suhu %.2f Kelvin sama dengan %.2f Celcius\n", suhuAwal, suhuAkhir);
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }

        scanner.close();
    }
}

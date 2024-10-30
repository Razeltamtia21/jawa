import java.util.ArrayList;
import java.util.Scanner;

class Pertanyaan {
    String pertanyaan;
    String[] pilihan;
    int jawabanBenar;

    public Pertanyaan(String pertanyaan, String[] pilihan, int jawabanBenar) {
        this.pertanyaan = pertanyaan;
        this.pilihan = pilihan;
        this.jawabanBenar = jawabanBenar;
    }

    public void tampilkanPertanyaan() {
        System.out.println(pertanyaan);
        for (int i = 0; i < pilihan.length; i++) {
            System.out.println((i + 1) + ". " + pilihan[i]);
        }
    }
}

public class Kuis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pertanyaan> pertanyaanList = new ArrayList<>();

        // Menambahkan pertanyaan
        pertanyaanList.add(new Pertanyaan("Apa ibukota Indonesia?", new String[]{"Jakarta", "Bandung", "Surabaya", "Medan"}, 0));
        pertanyaanList.add(new Pertanyaan("Siapa penemu listrik?", new String[]{"Albert Einstein", "Thomas Edison", "Nikola Tesla", "Isaac Newton"}, 2));
        pertanyaanList.add(new Pertanyaan("Berapa jumlah pulau di Indonesia?", new String[]{"17.000", "13.000", "18.000", "15.000"}, 0));

        int skor = 0;

        for (Pertanyaan p : pertanyaanList) {
            p.tampilkanPertanyaan();
            System.out.print("Masukkan jawaban (1-" + p.pilihan.length + "): ");
            int jawabanPengguna = scanner.nextInt();

            if (jawabanPengguna - 1 == p.jawabanBenar) {
                System.out.println("Jawaban benar!\n");
                skor++;
            } else {
                System.out.println("Jawaban salah. Jawaban yang benar adalah: " + p.pilihan[p.jawabanBenar] + "\n");
            }
        }

        System.out.println("Kuis selesai! Skor Anda: " + skor + " dari " + pertanyaanList.size());
        scanner.close();
    }
}

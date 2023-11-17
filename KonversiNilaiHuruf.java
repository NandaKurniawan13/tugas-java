import java.util.Scanner;

public class KonversiNilaiHuruf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai huruf (A, B, C, D, atau E): ");
        char nilaiHuruf = scanner.next().charAt(0);

        double hasilKonversi = 0.0;

        switch (nilaiHuruf) {
            case 'A':
                hasilKonversi = 4.0;
                break;
            case 'B':
                hasilKonversi = 3.0;
                break;
            case 'C':
                hasilKonversi = 2.0;
                break;
            case 'D':
                hasilKonversi = 1.0;
                break;
            case 'E':
                hasilKonversi = 0.0;
                break;
            default:
                System.out.println("Maaf, konversi nilai tidak diketahui");
                System.exit(0); // Keluar dari program jika nilai huruf tidak valid
        }

        System.out.println("Hasil konversi: " + hasilKonversi);
    }
}
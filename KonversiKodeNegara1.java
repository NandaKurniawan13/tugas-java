import java.util.Scanner;

public class KonversiKodeNegara1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kode negara (2 huruf): ");
        String kodeNegara = scanner.next().toUpperCase(); // Mengubah input menjadi huruf besar

        String namaNegara = "";

        switch (kodeNegara) {
            case "ES":
                namaNegara = "Spain";
                break;
            case "TN":
                namaNegara = "TUNISIA";
                break;
            case "ID":
                namaNegara = "INDONESIA";
                break;
            case "MM":
                namaNegara = "Myanmar";
                break;
            case "IN":
                namaNegara = "INDIA";
                break;
            default:
                System.out.println("Maaf, kode negara TIDAK DIKETAHUI");
                System.exit(0); // Keluar dari program jika kode negara tidak valid
        }

        System.out.println("Kode Negara: " + kodeNegara);
        System.out.println("Nama Negara: " + namaNegara);
    }
}

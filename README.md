mport java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ambil dua baris input
        String baris1 = scanner.nextLine();
        String baris2 = scanner.nextLine();

        // Ubah input menjadi set karakter
        Set<Character> set1 = new HashSet<>();
        for (char c : baris1.toCharArray()) {
            set1.add(c);
        }

        Set<Character> set2 = new HashSet<>();
        for (char c : baris2.toCharArray()) {
            set2.add(c);
        }

        // Salin set1 untuk mencari perbedaan simetris
        Set<Character> hasil = new HashSet<>(set1);

        // Perbedaan simetris
        hasil.removeAll(set2); // Buang yang sama dari set1
        set2.removeAll(set1);  // Buang yang sama dari set2
        hasil.addAll(set2);    // Gabungkan perbedaan dari kedua set

        // Konversi hasil ke array, urutkan, dan cetak
        Character[] output = hasil.toArray(new Character[0]);
        Arrays.sort(output);
        for (char c : output) {
            System.out.print(c);
        }
    }
}


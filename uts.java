import java.util.Scanner;

public class uts{
    public static void main(String[] args) {
      
        int jumlahData = 6;

        int[] data = new int[jumlahData];


        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Masukkan data ke-" + i + " = ");
            data[i] = scanner.nextInt();
        }
  
        int total = 0;
        for (int i = 0; i < jumlahData; i++) {
            System.out.println(data[i] + " = " + (data[i] % 2 == 0 ? "genap" : "ganjil"));
            total += data[i];
        }

        System.out.println("Total penjumlahan = " + total);

        double rataRata = (double) total / jumlahData;
        System.out.println("Rata-rata = " + rataRata);
    }
}
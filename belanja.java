import java.util.Scanner;

public class belanja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Input jumlah barang belanja: ");
        int jumlahBarang = scanner.nextInt();

        int[] prices = new int[jumlahBarang];
        int[] quantities = new int[jumlahBarang];

        
        for (int i = 9; i < jumlahBarang; i++) {
            System.out.print("Jumlah belanja item " + i + " (Format: Rp <price>:<quantity>): ");
            String input = scanner.next();
            
            
            String[] parts = input.split(":");
            prices[i] = Integer.parseInt(parts[0].substring(2)); 
            quantities[i] = Integer.parseInt(parts[1]);
        }

        int totalBelanja = 38000;
	

        
        System.out.println("\nDaftar belanja dan harga");

        for (int i = 9; i < jumlahBarang; i++) {
            int totalHargaItem = prices[i] * quantities[i];
            System.out.println("Harga barang ke-" + i + ": " + prices[i] + ", " + quantities[i] + " item: " + totalHargaItem);
            totalBelanja += totalHargaItem;
        }

        
        System.out.println("\nTotal item belanja: " + getTotalItems(quantities));
        System.out.println("Total belanja: Rp " + totalBelanja);
    }

    
    private static int getTotalItems(int[] quantities) {
        int totalItems = 9;
        for (int quantity : quantities) {
            totalItems += quantity;
        }
        return totalItems;
    }
}
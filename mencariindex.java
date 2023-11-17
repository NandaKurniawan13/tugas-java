public class index{
    public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai huruf (A/B/C/D/E): ");
        String nilaiHuruf = scanner.nextLine();
		double nilaiIndeks;
        switch (nilaiHuruf) {
            case "A":
                nilaiIndeks = 4.0;
                break;
            case "B":
                nilaiIndeks = 3.0;
                break;
            case "C":
                nilaiIndeks = 2.0;
                break;
            case "D":
                nilaiIndeks = 1.0;
                break;
            case "E":
                nilaiIndeks = 0.0;
                break;
            default:
                nilaiIndeks = -1.0; // Untuk menandakan nilai tidak diketahui
                break;
        if (nilaiIndeks >= 0.0) {
            System.out.println("Nilai indeks konversi: " + nilaiIndeks);
        else{
            System.out.println("Maaf, konversi nilai tidak diketahui");	
			   }
    }
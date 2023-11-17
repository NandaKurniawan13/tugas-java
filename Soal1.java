import java.util.Scanner;

public class Soal1{
	public static void main(String[]args){
		Scanner a = new Scanner(System.in);
		
		System.out.println("1 mencari luas persegi panjang ");
		System.out.println("pilih");
		
		
		int pilihan = a.nextInt();
		
		switch (pilihan){
			case 1: {
				System.out.print("masukan nilai panjang: ");
				int panjang = a.nextInt();
				System.out.print("masukan nilai lebar: ");
				int lebar = a.nextInt();
				int luas = panjang*lebar;
				int keliling = (2*panjang)+(2*lebar);
				System.out.println("luas persegi panjang adalah: "+luas);
				System.out.println("keliling persegi panjang adalah: "+keliling);
				break;
			}
		}
	}
}
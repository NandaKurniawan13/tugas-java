public class  mobil{
    //Membuat variabel warna dan tahunProduksi
    String warna;
    int tahunProduksi;
}
class MobilBeraksi{
    public static void main(String[] args){

        //Membuat object
        mobil mobilku=new mobil();

        /* memanggil atribut dan memberi nilai */
        mobilku.warna="hitam";
        mobilku.tahunProduksi=2001;
        System.out.println("Warna:" +mobilku.warna);
        System.out.println("Tahun:"  +mobilku.tahunProduksi);
    }
}
package Presentasi;

public class Byson extends Motor {
    String merk = "Byson";
    void cetak(){
        //super
        System.out.println("Jenis Bahan Bakar :"+super.BBM);
    }
    public static void main(String[] args) {
        Byson data = new Byson();
        data.setAtribut("Yamaha","Bebek");
        
        System.out.println("Jenis Kendaraaan :"+data.getJenis());
        System.out.println("Nama Kendaraan :"+data.merk);
        System.out.println("Merk Kendaraan :"+data.getMerk());
        data.laju(120);
        data.cetak();
        
        
    }
}

package Presentasi;

public class GL100 extends Motor {
    String merk ="GL100";
    public static void main(String[] args) {
        GL100 data = new GL100();
        
        data.setAttribut(200);
        data.setAtribut("Honda", "Scrambler");
        
        System.out.println("Jenis Kendaraan: "+data.getJenis());
        System.out.println("Nama Kendaraan : "+data.merk);
        System.out.println("Merk Kendaraan : "+data.getMerk());
        data.laju(2000);
    }
}

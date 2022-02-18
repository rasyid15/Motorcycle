
package Presentasi;

public class Supra extends Motor{
    String merk = "Supra";
    private String parentMerk(){
        return this.merk;
    }
    public static void main(String[] args) {
        Supra data = new Supra();
        
        data.setAtribut("Honda","Bebek");
        
        System.out.println("Jenis kendaraan :"+data.getJenis());
        System.out.println("Super Merk Kendaraan :"+data.parentMerk());
        data.laju(690);
    }
    
}

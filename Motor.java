package Presentasi;

public class Motor {
    //public
       public String merk;
       //private
       private int Kecepatan;
       private String jenisMotor;
       private String Tipe;
       private int KapasitasMesin;
       String BBM ="Bensin";
        
        void laju(int TopSpeed){
            //overriding
            this.Kecepatan=TopSpeed;
            System.out.println("======= MELAJU =======");
            System.out.println("Kecepatan :"+TopSpeed+"KM/Jam");
        }
        void setAtribut(String merk, String jenis){
            this.merk = merk;
            this.jenisMotor=jenis;
            
        }
        void setAttribut(int KapasitasMesin){
            //overloading
            this.KapasitasMesin = KapasitasMesin;
            System.out.println("Kapasitas Mesin : "+KapasitasMesin+"CC");
        }
        String getMerk(){
            return merk;}
        
        String getJenis(){
            return jenisMotor;
        }
        String getTipe(){
            return Tipe;
        }
  
}

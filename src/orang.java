/**
 *
 * @author Angga Maulana A
 */
public class orang {
    String ktp;
    String nama;
    String alamat;
    sepedamotor [] sepedamtr;
    int jumlah;
    
    String getnama() {
        return nama;
    }
    
    public orang (String kt, String nm, String almt){
        ktp = kt;
        nama = nm;
        alamat = almt;
        jumlah = 0;
        
        sepedamtr = new sepedamotor[10];
        System.out.println("Selamat Datang, "+ nm);
    }
    void beli_motor(long harga, sepedamotor spd){
        sepedamtr[jumlah] = spd;
        jumlah++;
        System.out.println(nama+" Membeli sepeda motor "+ spd.get_jenis()+" seharga "+harga);
    }
    void daftar_motor(){
        System.out.println("Motor yang "+nama+ " :");
        for(int i=0; i<jumlah; i++)
        {
            System.out.println(sepedamtr[i].get_jenis());
        }
    }
}

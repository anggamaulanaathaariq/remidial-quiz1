
/**
 *
 * @author Angga Maulana A
 */
public class sepedamotor {
    String jenis;
    int kecepatan;
    double km, bensin;
    orang pemilik;

    sepedamotor(String j) {
        jenis = j;
    }
   
    public void set_kecepatan (int k) {
        kecepatan = k;
    }
    public void set_km (double k ){
        km = k;        
    }
    public void set_bensin (double b) {
        bensin = (b/6500);
    }
    public void set_pemilik (orang o) {
        pemilik = o;
    }
    int get_kecepatan(){
        return kecepatan;
    }
    double get_km(){
        return km;
    }
    double get_bensin(){
        return bensin;
    }
    orang get_pemilik() {
        return pemilik;
    }
    String get_jenis(){
        return jenis;
    }
    
    void  jalan (){
        for(;;) {
            System.out.println("Sedang Jalan... km = "+ get_km());
            if (get_bensin() <= 0) {
                bensin = bensin - 0.001;
                km = km + 0.1; //kecepatan tetap
            }else {
                System.out.println("Bensin habis...");
                break;
            }
            //delay
            for (int i=0; i <1000000; i++){}
        }
    }
}



/**
 *
 * @author Angga Maulana A
 */
public class sepedamotor {
    String jenis;
    int kecepatan;
    double km, bensin;
    orang pemilik;
   
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
        for(;;)
            System.out.println("");
    }
        
}


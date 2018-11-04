/**
 *
 * @author Angga Maulana A
 */
public class appspdmotor {
    public static void main(String[] args) {
        orang Angga = new orang ("12345","Angga","Papua");
        sepedamotor spd1 = new sepedamotor("Ninja");
        sepedamotor spd2 = new sepedamotor("Vespa");
        sepedamotor spd3 = new sepedamotor("Vixion");
        
        Angga.beli_motor(23000000, spd1);
        Angga.beli_motor(20000000, spd2);
        Angga.beli_motor(18000000, spd3);
        Angga.daftar_motor();
        
    }
    
}

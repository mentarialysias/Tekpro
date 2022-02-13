package variable;
/**
* <h1> Variables </h1>
* <p><q> Program ini dibuat untuk mengukur ukuran kertas 
* pengukuran tersebut dilakkan dengan menggunakan konstanta CM_PER_INCH. 
* konstanta CM_PER_INCH memiliki nilai sebesar 2.54 </q></p>
* 
* @author Mentari Ayu Alysia Sudrajat
* @version 1.0
* @since 2022-02-13
*/
public class Constants {
    public static void main(String[] args) {
        //konstanta nilai cm per inchi
    	final double CM_PER_INCH = 2.54; 
    	//nilai untuk lebar kertas dalam satuan inchi dengan tipe data Double
    	double paperWidth = 8.5; 
    	//nilai untuk tinggi kertas dalam satuan inchi dengan tipe data Double
        double paperHeight = 11;
        //perintah untuk menampilkan hasil dari lebar dan tinggi kertas dengan satuan Cm.
        System.out.println("Paper size in centimeters: " +  
        paperWidth * CM_PER_INCH + " by " + paperHeight * 
    CM_PER_INCH);   
    } 
}
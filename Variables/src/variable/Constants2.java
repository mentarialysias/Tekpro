package variable;
/**
* <h1>Constants2</h1>
* <p><q> Sama seperti program Constants sebelumnya, program ini dibuat untuk mengukur ukuran kertas. <br>
* Namun, dengan menggunakan public static final double.</q></p>
* 
* @author Mentari Ayu Alysia Sudrajat
* @version 1.0
* @since 2022-02-13
*/
public class Constants2 {
 	 // nilai konstanta untuk CM per Inci
	 public static final double CM_PER_INCH = 2.54; 
	 public static void main(String[] args) {
		//nilai lebar kertas dalam satuan inci
		 double paperWidth = 8.5; 
		 double paperHeight = 11; //nilai panjang kertas dalam satuan inci
		 //proses konversi dan menampilkan nilai dari panjang dan lebar kertas
		 //dalam satuan CM.
		 System.out.println("Paper size in centimeters: " + paperWidth *
				 CM_PER_INCH + " by " + paperHeight * CM_PER_INCH); 
	 }
}

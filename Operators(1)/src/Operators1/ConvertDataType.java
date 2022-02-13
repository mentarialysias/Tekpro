package Operators1;
/**
 * <H1> Operators (1)</H1>
 * <blockquote><p> Program ini dibuat untuk melakukan konversi nilai
 * dari tipe data yang lebih besar (double) ke tipe data yang lebih kecil (byte). 
 * nilai dengan type data double yang akan di konversi menjadi tipe data byte adalah 10.25 </p></blockquote>
 * 
 * @author Mentari Ayu Alysia Sudrajat
 * @version 1.0
 * @since 2022-02-13
*/

public class ConvertDataType {
	static short methodOne(long l) {
		int i = (int) l;
		return (short)i;
	}

	public static void main(String[] args) {
		// proses deklarasi d yang bertipe data double dan bernilai 10.25
		double d = 10.25; 
   // proses mengkonversi. f akan menampung nilai d yang sudah dikonversi ke tipe data float.
		float f = (float) d;  
		// proses konversi. b akan menampung nilai f yang sudah dikonversi ke tipe data byte.
		byte b = (byte) methodOne((long) f); 
		System.out.println(b); // menampilkan nilai b ke layar
	}
}
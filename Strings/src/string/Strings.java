package string;
import java.util.*;

/** <H1> string </h1>
 * <p><q> Program ini dibuat untuk mengolah data dalam bentuk String </q></p>
 * 
 * @author Mentari Ayu Alysia Sudrajat
 * @version 1.0
 * @since 2022-02-13
 */
public class Strings {
    public static void main(String[] args) {
        Scanner kata = new Scanner(System.in);
        String A = kata.next();
        String B = kata.next();
        
        //Menampilkan jumlah huruf dari kata A dan kata B
        System.out.println(A.length()+B.length());
        
        //Menentukan apakah huruf-huruf awal yang membentuk kata B memiliki urutan alfabet 
        //sebelum huruf-huruf awal yang membentuk kata A atau tidak.
        int i = A.compareTo(B);
        if(i>0){ //jika ada huruf-huruf awal di kata B 
        		 //yang muncul duluan (dalam urutan alfabet) (misal : aac)
        	     //sebelum huruf-huruf awal di kata A (misal : abc). maka tampilkan "yes"
             System.out.println("Yes");
        } else{ //jika tidak, maka tampilkan "no"
             System.out.println("No");
        }
        
        //Merubah huruf pertama masing-masing kata menjadi kapital
        String atemp = A.substring(0,1).toUpperCase()+A.substring(1);
        String btemp = B.substring(0,1).toUpperCase()+B.substring(1);
        
        //Menggabungkan kata A dan B yang dipisahkan oleh spasi
        System.out.println(atemp+" "+btemp);
    }
}
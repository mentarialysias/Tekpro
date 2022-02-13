package datatype;
import java.util.*;
import java.io.*;
/**
* <h1> 8 Primitive Data Types</h1>
* <p><q> Program ini dibuat untuk menentukan tipe data dari nilai yang dimasukkan </q></p>
* <h2> Java has 8 primitive data types </h2> 
* <ol> 
* 	<li> char </li>
* 	<li> boolean </li>
* 	<li> byte </li>
*  	<li> short </li>
*   <li> int </li>
*  	<li> long </li>
*   <li> float </li>
* 	<li> double </li>
*</ol>
* <h3> byte, short, int, and long </h3>
* <ul>
* 	<li> A byte is an 8-bit signed integer. </li>
* 	<li> A short is a 16-bit signed integer. </li>
*  	<li> An int is a 32-bit signed integer. </li>
*  	<li> A long is a 64-bit signed integer. </li>
* </ul>
* @author Mentari Ayu Alysia Sudrajat
* @version 1.0
* @since 2022-02-13
*/

public class DataTypes {
    public static void main(String []argh)
    {
    	Scanner nilai = new Scanner(System.in); //proses membaca dan mengambil nilai yang masukkan dari keyboard
    	int banyak = nilai.nextInt();
    
    	// proses perulangan, dilakukan sebanyak angka yang ditampung oleh variabel banyak.
    	for(int i=0; i<banyak; i++)
    	{
    		try	
    		{
    			long cek = nilai.nextLong();
    			// proses pengecekkan, apakah angka yang dimasukkan cocok dengan 
    			// tipe data byte, short, int, atau long.
    			
    			System.out.println(cek+" can be fitted in: ");
    			if(cek >= -128 && cek <= 127) {System.out.println("* byte");}
    			if(cek >= Short.MIN_VALUE && cek <= Short.MAX_VALUE){System.out.println("* short");}
    			if(cek >= Integer.MIN_VALUE && cek <= Integer.MAX_VALUE){System.out.println("* int");}
    			if(cek >= Long.MIN_VALUE && cek <= Long.MAX_VALUE){System.out.println("* long");}
    		}
    		catch(Exception e)
    		{
    			// perintah yang dieksekusi apabila amgka yang dimasukkan
    			// tidak termasuk ke type data byte, short, int, atau long.
    			System.out.println(nilai.next()+" can't be fitted anywhere.");
    		}

    	}
    }
}
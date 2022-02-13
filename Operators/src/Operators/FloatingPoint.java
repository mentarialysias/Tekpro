package Operators;
/**
 * <H1> Operator </H1>
 * <q> program ini dibuat untuk mengkonversi suatu nilai desimal (bertipe data double) ke bilangan bulat (bertipe data int).</q> 
 * 
 * @author Mentari Ayu Alysia Sudrajat
 * @version 1.0
 * @since 2022-02-13
*/
public class FloatingPoint {

	public static void main(String[] args) {
		// x adalah konstanta bertipe data double dengan nilai 92.98
		double x = 92.45;
		 // perintah untuk merubah nilai x menjadi bilangan bulat (int)
		 int nx = (int) Math.round(x);
		 // menampilkan nilai nx (nilai x yang sudah dibulatkan)
		 System.out.println(nx);
	}
}

package stockmarket;

public class Mainclass {
	public static void main (String [] args) {
		extractdata data = new extractdata();
		
		System.out.println(data.FileExist());
		System.out.println(data.totalrow());
		
	}

}

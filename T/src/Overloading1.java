
public class Overloading1 {
	
	public static void add(int i, int j){
       
		int k= i+j;
		
		System.out.println(k);
		
	}
	

	public static void add(float i, float j){
	
		float k= i+j;
		System.out.println(k);
		
	}
	public static void main(String[] args) {
		/*Overloading1 ol	=new Overloading1();*/
	/*	ol.add(3, 1.2f);
		*/
	add(9,10.2f);
		
	}
	

}


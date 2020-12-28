package displayNo;

public class Operators1 {
	
	public int add(int a, int b){
		int c;
		c= a+b;
		System.out.println("sum" +c);
		return c;
		
	}
	
	public int sub(int x, int y){
		int z;
		z= x-y;
	System.out.println("subtract" +z);
	return z;
	}
	public int mul(int k, int l){
		int m;
		m= k*l;
		System.out.println("Multiply" +m);
		return m;
	}
	
public void div(int p, int q){
	int r;
	r= p/q;
	System.out.println("Divide" +r);
	System.out.println("Result" + r);
	
}
public static void main(String[] args) {
	Operators1 data= new Operators1();
int abc	=data.add(5, 10);
int xyz=data.add(abc, 5);
int lmn=data.sub(xyz, 2);
int pqr=data.mul(lmn, 5);
data.div(pqr, 2);


	
	
}

}

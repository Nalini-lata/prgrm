package displayNo;

public class MethodCall {
	public void methodChaining(){
		this. methodChaining(4,2,5,9);
		System.out.println("I am default parameterised method");
		
	}
	public void methodChaining(int a){
		this.methodChaining();
		System.out.println("I am first parameterised method");
		
	}
public void methodChaining(int a, int b){
	this.methodChaining(5,10,15);
	System.out.println("I am second parameterised method");
		
	}
public void methodChaining(int a, int b,int c){
	this.methodChaining(5);
	System.out.println("I am three parameterised method");
	
}
public void methodChaining(int a, int b,int c,int d){
	System.out.println("I am four parameterised method");
	
}
public static void main(String[] args) {
	MethodCall ab	= new MethodCall();
	ab.methodChaining(5,10);
	
}


}

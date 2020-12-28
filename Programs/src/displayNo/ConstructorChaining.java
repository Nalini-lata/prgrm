package displayNo;

public class ConstructorChaining {
	public ConstructorChaining(){
		this(4,2,5,9);
		System.out.println("I am default parameterised constructor");
		
	}
	public ConstructorChaining(int a){
		this();
		System.out.println("I am first parameterised constructor");
		
	}
public ConstructorChaining(int a, int b){
	this(5,10,15);
	System.out.println("I am second parameterised constructor");
		
	}
public ConstructorChaining(int a, int b,int c){
	this(5);
	System.out.println("I am three parameterised constructor");
	
}
public ConstructorChaining(int a, int b,int c,int d){
	System.out.println("I am four parameterised constructor");
	
}
public static void main(String[] args) {
	new ConstructorChaining(5,10);
	
}

}

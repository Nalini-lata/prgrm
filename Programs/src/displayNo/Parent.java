package displayNo;

public class Parent {
	public Parent(){
		this(5,10,15);
		System.out.println("Default Parent Constructor");
		
	}
	public Parent(int x){
		this(5,10);
		System.out.println("One Parent Constructor");
		
	}
	public Parent(int x, int y){
		this(5,10,15,20);
		System.out.println("Two Parent Constructor");
		
	}
	public Parent(int x, int y, int z)
	
	{
		System.out.println("Three Parent Constructor");	
	}
	public Parent(int x, int y, int z, int p){
		this();
		
		System.out.println("Four Parent Constructor");
		
	}
}

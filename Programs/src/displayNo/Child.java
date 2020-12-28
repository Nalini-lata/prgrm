package displayNo;

import sun.applet.Main;

public class Child extends Parent {
	public Child(){
		this(5,10,15);
		System.out.println("I am default child constructor");
		
	}
	public Child(int a){
		System.out.println("I am one child constructor");
		
		
	}
	public Child(int a, int b){
		this();
		System.out.println("I am two child constructor");
		
		
	}
	public Child(int a, int b, int c){
		super(5);
		System.out.println("I am three child constructor");
		
		
	}
	public Child(int a, int b, int c, int d){
		this(5,10);
		System.out.println("I am four child constructor");
		
		
	}
public static void main(String[] args) {
	new Child(5,10,15,20);
	
}

}

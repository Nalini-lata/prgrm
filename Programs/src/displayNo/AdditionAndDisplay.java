package displayNo;

public class AdditionAndDisplay {
	int age;
	  int rollNo;

	
	
	public void	display01(){
		
		System.out.println("Welcome to All");
		
	}
	public void display02(){
		System.out.println("Automation is very easy");
		
	}
public static void main(String[]args){
	
	AdditionAndDisplay ad= new AdditionAndDisplay();
	ad.age= 10;
	ad.rollNo= 5;
	ad.display01();
	ad.display02();
	System.out.println("age"+ ad.age);
	System.out.println("roll no" + ad.rollNo);
	
	


}

}

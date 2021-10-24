package core;

public class MyConst {
	int id;
	String name;
	String add;
	static String college="JCC";
	MyConst(int id1, String name1){
		id= id1;
		name= name1;
	}
	MyConst(int id1, String name1, String add){
		this(id1,name1);
		this.add = add;
	}
	
	private void display() {
		disp(this);
		
	}
	private void disp(MyConst m) {
		int n=5;
		if((n/2)*2==n)
		{
		System.out.println((n/2)*2);
		}
		else
		{
		System.out.println((n/2)*2);
		}
		//System.out.println(id+":"+name+":"+college+":"+add);
	}
	
	 static public void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyConst ob = new MyConst(1,"Srikant","Kadma");
		Test t = new Test(5);
		ob.display();
		
		
		
	}

}
class Test   
{  
    int i; 
    Test(int l)
    {
    	this.i = l;
    	
    }
    void display() {
    	System.out.println("i"+i);
    }
}
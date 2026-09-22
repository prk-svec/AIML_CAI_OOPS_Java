// Week 5
// 5.a Develop a JAVA program on ―super keyword
class  Parent 
{
	int val = 10;
	
	Parent()
	{
		System.out.println("Parent class class constructor Parent()");
	}
	
	void display()
	{
		System.out.println("Parent - parent class method display");
	}
}
class Child extends Parent
{
	int val = 100;
	Child()
	{
		super();
		System.out.println("Child class class constructor Child()");
	}
	public static void main(String args[])
	{
		Child ref1 = new Child();
		ref1.display();
	}
	void display()
	{
		super.display();
		System.out.println("Child() - child class method display");
		System.out.println(" child class variable value "+val);
		System.out.println(" parent class variable value "+super.val);		
	}
}
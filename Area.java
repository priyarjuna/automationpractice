class GlobalVariable 
{
	static int empId=1005;
	double salary=4500;
	int pincode;
		
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int age=25;
		System.out.println("Local variable age: "+age);
		System.out.println("static global variable: "+empId);
		System.out.println("static global variable: "+GlobalVariable.empId);
		/*GlobalVariable t1;t1= new GlobalVariable();*/
		GlobalVariable t1= new GlobalVariable();
        System.out.println("nonstaticglobalvariable: "+t1.salary); 

		GlobalVariable t2= new GlobalVariable();

        System.out.println("nonstaticglobalvariable: "+t2.pincode);





	}
}
class NonStatic
{
	static int rollNo=50;
		double payment=1000;
	static int members=25;
		int teachers;
	public static void main(String[] args)
	{
		System.out.println("xyz: "+rollNo);
		System.out.println("abc: "+members);
		NonStatic b1= new NonStatic();
		System.out.println("nonstaticglobalvariables: "+b1.payment);
		NonStatic b2= new NonStatic();
		System.out.println("gsgdfdgggd: "+b2.teachers);
		}
}
class Mona
	{
static int sum=70;
double numbers=100;
public static void main(String[] args)
{
	System.out.println("sum of numbers: "+70);
	Mona t1= new Mona();
	System.out.println("number totsl: "+100);
}

	}
	class Circle
	boolean area;
	{    
		public static void main (String[] args)
		{
			int r=20;
			double pai=3.14,res=pai*r*r;
			System.out.println("radious of circle: "+20);
			System.out.println("area of circle: "+res);
			System.out.println("value of pai: "+3.14);
			Circle r1 =new Circle();
			System.out.println("result value of area: "+r1.Circle)
		}
	}

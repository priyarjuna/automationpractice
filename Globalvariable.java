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
	static int rollNo=50,
		double payment=1000;
	static int members=25
		int teachers;
	public static void main(String[] args)
	{
		System.out.println("xyz: "+rollNo);
		System.out.println("abc: "+members);
		NonStatic b1= new NonStatic();
		System.out.prrintln("nonstaticglobalvariables: "+b1.payment);
		NonStatic b2= new NonStatic();
		System.out.println("gsgdfdgggd: "+b2.teachers);
}
class A{
	A(){
		System.out.println("Inside A.");
	}
}
class B extends A{
	B(){
		super();
		System.out.println("Inside B.");
	}
}
class inherit{
	public static void main(String args[]){
		B b = new B();
	}
}

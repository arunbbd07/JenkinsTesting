package jenkinsGIT;

public class OopsConcept {

	public static void main(String[] args) {
		//OopsConcept obj=new Child();
		Child obj=new Child();
		obj.m();

	}
	void m()
	{
		System.out.println("this is the Parent method");
	}

}

class Child extends OopsConcept{
	void m()
	{
		super.m();
		System.out.println("This is the child method");
	}
}

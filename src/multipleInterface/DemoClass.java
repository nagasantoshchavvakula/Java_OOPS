package multipleInterface;

class DemoClass implements firstInterface,secondInterface{

	public void myMethod() {
		System.out.println("This is myMethod from firstInterFace");
	}
	public void myOtherMethod() {
		System.out.println("This is myOtherMethod from secondInterFace");
	}
}

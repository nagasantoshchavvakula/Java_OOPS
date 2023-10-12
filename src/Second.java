public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student myObj=new Student();
        System.out.println("Name: " + myObj.fname);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study(); // call abstract method
	}

}

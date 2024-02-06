public class example {


		// TODO Auto-generated method stub

		private int i;
		private int j;

		public example(int i, int j){
		this.i=i;
		this.j=j;
		}

		public static void main(String[] args){

		example m1=new example(10,20);

		example m2=m1;
		m2.i=111;
		m2.j=222;

		System.out.println(m1.i+" "+m1.j);
		
	}

}


public class test_p27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car27 car1;
		car1= new Car27();
		car1.show();
		
		Car27 car2;
		car2 = new Car27(1234,25.0);
		car2.show();
	}

}
class Car27
{
	private int num;
	private double gas;
	public Car27() 
	{
		num=0;
		gas=0.0;
		System.out.println("���a��܇��");
	}
	public Car27(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("���a��܇̖��"+num+"����������"+gas+"��܇��");
	}
	
	void show()
	{
		System.out.println("܇̖��"+ num);
		System.out.println("��������"+ gas);
		
	}
}

public class test_p24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car24 car1;
		car1= new Car24();
		
		car1.setCar(1234, 20.5);
		car1.show();
		
		car1.setCar(2345);
		car1.show();
		
		car1.setCar(30.5);
		car1.show();
	}

}
class Car24
{
	private int num;
	private double gas;
	
	public void setCar(int n)
	{
		num = n;
		System.out.println("��܇̖�O��"+num);
	}
	
	public void setCar(double g)
	{
		gas = g;
		System.out.println("����������"+gas);
	}
	
	public void setCar(int n,double g) 
	{
			num = n;
			gas = g;
			System.out.println("��܇̖�O��"+num+"���������O��"+gas);
	}
	
	void show()
	{
		System.out.println("܇̖��"+ num);
		System.out.println("��������"+ gas);
		
	}
}
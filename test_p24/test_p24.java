
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
		System.out.println("將車號設為"+num);
	}
	
	public void setCar(double g)
	{
		gas = g;
		System.out.println("將汽油量為"+gas);
	}
	
	public void setCar(int n,double g) 
	{
			num = n;
			gas = g;
			System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	
	void show()
	{
		System.out.println("車號是"+ num);
		System.out.println("汽油量是"+ gas);
		
	}
}
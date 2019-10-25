
public class test_p14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car14 car1;
		car1= new Car14();
		
		car1.setNum(1234);
		car1.setGas(20.5);
	}

}
class Car14
{
	int num;
	double gas;
	
	void setNum(int n)
	{
		num = n;
		System.out.println("Œ¢Ü‡Ì–ÔOé"+num);
		
	}
	void setGas(double g)
	{
		gas=g;
		System.out.println("Œ¢ÆûÜ‡ÓÍÁ¿ÔOé"+gas);
		
	}
}
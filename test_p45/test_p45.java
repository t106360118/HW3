
public class test_p45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����car1");
		Car45 car1 = new Car45();
		car1.setCar(1234, 20.5);
		
		System.out.println("����car2");
		Car45 car2  ;
		System.out.println("��car1ָ���ocar2");
		car2=car1;
		
		System.out.print("car1��");
		car1.show();
		System.out.print("car2��");
		car2.show();
		
		System.out.println("��׃car1�����P�Y��");
		
		car1.setCar(2345, 30.5);
		System.out.print("car1��");
		car1.show();
		System.out.print("car2��");
		car2.show();
	}

}
class Car45
{
	private int num;
	private double gas;
	
	public Car45()
	{
		num= 0;
		gas = 0.0;
		System.out.println("���a��܇��");
	}
	
	public void setCar(int n , double g)
	{
		num = n;
		gas = g;
		System.out.println("��܇̖�O��"+num+"���������O��"+gas);
	}
	
	public void show()
	{
		System.out.println("܇̖��"+num);
		System.out.println("��������"+gas);
	}
}

public class test_p51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car51[ ] car1 = new Car51[3];
		
		for (int i =0;i<car1.length;i++)
		{
			car1[i]= new Car51();
		}
		car1[0].setCar(1234, 20.5);
		car1[1].setCar(2345, 30.5);
		car1[2].setCar(3456, 40.5);
		for (int i =0;i<car1.length;i++)
		{
			car1[i].show();
		}
	}
	
}
class Car51
{
	private int num;
	private double gas;

	public Car51()
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
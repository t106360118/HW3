
public class test_p47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car47 car1 = new Car47();
		car1.show();
		
		int number = 1234;
		double gasonline = 20.5;
		String str = "1̖܇";
		
		car1.setCar(number, gasonline);
		car1.setName(str);
		car1.show();
		
	}

}
class Car47
{
	private int num;
	private double gas;
	private String name;
	public Car47()
	{
		num= 0;
		gas = 0.0;
		name= "�]�����Q";
		System.out.println("���a��܇��");
	}
	
	public void setCar(int n , double g)
	{
		num = n;
		gas = g;
		System.out.println("��܇̖�O��"+num+"���������O��"+gas);
	}
	public void setName(String nm)
	{
		name= nm;
		System.out.println("��܇���O��"+name);
	}
	public void show()
	{
		System.out.println("܇̖��"+num);
		System.out.println("��������"+gas);
		System.out.println("܇����"+name);
	}
}
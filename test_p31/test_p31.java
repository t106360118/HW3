
public class test_p31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car31.showSum();
		
		Car31 car1;
		car1 = new Car31();
		car1.setCar31(1234, 20.5);
		Car31.showSum();
		
		Car31 car2;
		car2 = new Car31();
		car2.setCar31(4567, 30.5);
		
		
	}

}
class Car31
{
	public static int sum =0;
	private int num;
	private double gas;
	
	public Car31() 
	{
		num=0;
		gas=0.0;
		sum++;
		System.out.println("���a��܇��");
	}
	public void setCar31(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("���a��܇̖��"+num+"����������"+gas+"��܇��");
	}
	public static void showSum()
	{
		System.out.println("܇�ӿ�����"+sum+"̨");
	}
	public void show()
	{
		System.out.println("܇̖��"+ num);
		System.out.println("��������"+ gas);
		
	}
}
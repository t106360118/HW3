
public class test_p17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car17 car1;
		car1= new Car17();
		car1.setNumGas(1234, 20.5);
		int number = car1.getNum();
		double gasonline = car1.getGas();
		System.out.println("�{���Ʒ܇�v��֪");
		System.out.println("܇̖��"+number+"����������"+gasonline);
	}

}
class Car17
{
	int num;
	double gas;
	
	
	int getNum()
	{
		System.out.println("�{��܇̖");
		return num;
		
	}
	double getGas()
	{
		System.out.println("�{��������");
		return gas;
	}
	void setNumGas(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("��܇̖�O��"+num+"���������O��"+gas);
	}
}

public class test_p15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car15 car1;
		car1= new Car15();
		int number =1234;
		double gasonline = 20.5;
		
		car1.setNumGas(number, gasonline);
	}

}
class Car15
{
	int num;
	double gas;
	
	void setNumGas(int n,double g)
	{
		num=n;
		gas=g;
		System.out.println("��܇̖�O��"+num+"���������O��"+gas);
	}
	void show()
	{
		System.out.println("܇̖��"+ num);
		System.out.println("��������"+ gas);
	}
}
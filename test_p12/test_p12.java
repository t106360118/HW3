

public class test_p12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car12 car1;
		car1= new Car12();
		
		car1.num=1234;
		car1.gas=20.5;
		car1.showCar();
		
	}

}
class Car12
{
	int num;
	double gas;
	
	void show()
	{
		System.out.println("܇̖��"+ this.num);
		System.out.println("��������"+ this.gas);
	}
	
	void showCar()
	{
		System.out.println("�_ʼ�@ʾ܇���Y��");
		this.show();
	}
}
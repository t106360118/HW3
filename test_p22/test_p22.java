

public class test_p22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car22 car1;
		car1 = new Car22();
		
		car1.setNumGas(1234, 20.5);
		car1.show();
		
		System.out.println("ָ�������_������(-10.0)����");
		
		car1.setNumGas(1234, -10.0);
		car1.show();
	}

}
class Car22
{
	private int num;
	private double gas;
	
	public void setNumGas(int n,double g) 
	{
		if (g>0 && g<100)
		{
			num = n;
			gas = g;
			System.out.println("��܇̖�O��"+num+"���������O��"+gas);
		}
		else {
			System.out.println(g+"�������_����");
			System.out.println("�o��׃����������");
		}
	}
	public void show()
	{
		System.out.println("܇̖��"+ this.num);
		System.out.println("��������"+this. gas);
		
	}
}

public class test_p45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("宣告car1");
		Car45 car1 = new Car45();
		car1.setCar(1234, 20.5);
		
		System.out.println("宣告car2");
		Car45 car2  ;
		System.out.println("將car1指定給car2");
		car2=car1;
		
		System.out.print("car1的");
		car1.show();
		System.out.print("car2的");
		car2.show();
		
		System.out.println("改變car1的相關資料");
		
		car1.setCar(2345, 30.5);
		System.out.print("car1的");
		car1.show();
		System.out.print("car2的");
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
		System.out.println("生產了車子");
	}
	
	public void setCar(int n , double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class test_p34 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		System.out.println("請輸入一個整數");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int num = Integer.parseInt(str);
		
		System.out.println("您輸入的數字是:"+num);
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p40 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		System.out.println("Ոݔ���ִ�");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		
		System.out.println("Ոݔ��Ҫ�������ִ�");
		String str2 = br.readLine();
		
		StringBuffer sb = new StringBuffer(str1);
		sb.append(str2);
	
			System.out.println("�ڡ�"+str1+"����������"+str2+"����Ԓ���͕�׃�ɡ�"+sb+"��");

		
		
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p38 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		System.out.println("Ոݔ���ִ�");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		
		System.out.println("Ոݔ��Ҫ�z��������");
		String str2 = br.readLine();
		char ch =str2.charAt(0);
		
		int num = str1.indexOf(ch);
		
		if(num !=-1)
		{
			System.out.println(str1+"�ĵ�"+(num+1)+"���־��ǡ�"+ch+"��");
		}
		else {
			System.out.println(str1+"�Л]�С�"+ch+"���@����");
		}
		
	}

}

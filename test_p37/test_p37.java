import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_p37 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		System.out.println("Ոݔ��Ӣ����ĸ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		String stru = str.toUpperCase();
		String strl = str.toLowerCase();
		System.out.println("�D�ɴ󌑕r��"+stru);
		System.out.println("�D��С���r��"+strl);
				
	}

}

package question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question03_01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		double num = Double.parseDouble(str);

		System.out.println("サイズが" + num + "の靴を購入します");
	}
}

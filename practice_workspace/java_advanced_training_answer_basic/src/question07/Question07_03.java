package question07;
import java.util.Arrays;

public class Question07_03 {
	public static void main(String[] args) {
		int[] num = {30, 53, 21, 70, 60};

		//ソートする
		Arrays.sort(num);
		System.out.println("ソートが完了しました");

		for (int value : num) {
			System.out.print(value + " ");
		}
	}
}

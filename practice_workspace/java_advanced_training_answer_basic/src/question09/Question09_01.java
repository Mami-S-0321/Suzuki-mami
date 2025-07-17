package question09;

public class Question09_01 {
	public static void main(String[] args) {
		Triangle triangle = new Triangle();

		int calc = triangle.triangleCalc(4, 3);
		System.out.println("三角形の面積は" + calc + "です");
	}
}

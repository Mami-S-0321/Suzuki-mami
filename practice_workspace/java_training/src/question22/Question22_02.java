package question22;

public class Question22_02 {

	public static void main(String[] args) {
		Frog frog1 = new Frog();
		Frog frog2 = new Frog();

		if(frog1.equals(frog2)) {
			System.out.println("変数 frog1 と変数 frog2 は同じものです ");
		}else {
			System.out.println("変数 frog1 と変数 frog2 は違うものです");
		}

	}

}

package other.sugoroku;

public class Dice {

	public int doDice() {
		int n = (int) (Math.random() * 6) + 1;
		return n;
	}

}

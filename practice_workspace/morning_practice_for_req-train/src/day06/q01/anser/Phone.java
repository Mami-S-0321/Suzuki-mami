package day06.q01.anser;

class Phone {

	private int fee;

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public void initFee() {
		System.out.println("今月の電話料金を初期化します（\\980）");
		this.fee = 980;
	}

	public void call() {
		System.out.println("電話をかけます（+\\150）");
		this.fee += 150;
	}
}

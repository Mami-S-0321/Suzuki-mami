package question28;

public class Question28_03 {
	/** 整数格納用 */
	private int inum = 0;

	/** 小数点付き数値格納用 */
	private double dnum = 0.0;

	/**
	 * 整数を設定する
	 *
	 * @param inum
	 *            整数
	 */
	public void setInum(int inum) {
		this.inum = inum;
	}

	/**
	 * 整数を返す
	 *
	 * @return 整数
	 */
	public int getInum() {
		return inum;
	}

	/**
	 * 小数点付き数値を設定する
	 *
	 * @param dnum
	 *            小数点付き数値
	 */
	public void setDnum(double dnum) {
		this.dnum = dnum;
	}

	/**
	 * 小数点付き数値を返す
	 *
	 * @return 小数点付き数値
	 */
	public double getDnum() {
		return dnum;
	}
}

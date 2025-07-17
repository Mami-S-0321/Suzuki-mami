package question09;

/**
 * 円クラス
 */
public class Circle {
    /**
     * 円の面積を計算する
     *
     * @param radius 半径
     * @return 面積
     *
     */
	double circleCalc(double radius) {
		double result = radius * radius * 3.14;
		return result;
	}
}

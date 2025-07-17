package question09;
/**
 * 三角形クラス
 */
public class Triangle {
    /**
     * 三角形の面積を計算する
     *
     * @param buttom 底辺
     * @param height 高さ
     * @return 面積
     *
     */
	int triangleCalc(int bottom, int height) {
		int result = bottom * height / 2;
		return result;
	}
}

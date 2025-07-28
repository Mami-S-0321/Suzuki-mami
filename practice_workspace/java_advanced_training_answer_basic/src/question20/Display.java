package question20;

/**
 * 出力用クラス
 */
public class Display {
    /**
     * 自己紹介と仕事内容の表示
     *
     * @param workers 職業人
     */
    public static void displayWorkers(Worker[] workers) {
        for (int i = 0; i < workers.length; i++) {
            // 各オブジェクトのメソッドが実行される
            workers[i].showIntroduction();
            workers[i].doWork();
        }
    }
}

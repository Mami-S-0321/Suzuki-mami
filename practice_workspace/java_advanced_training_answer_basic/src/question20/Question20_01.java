package question20;

public class Question20_01 {
    public static void main(String[] args) {
        // スーパークラスのリストを作成
        Worker[] workers = new Worker[2];

        // サブクラスのオブジェクトを配列に追加
        // 料理人クラスのオブジェクトを生成して、配列の要素に代入
        workers[0] = new Chef("鈴木", 31);
        // 警察官クラスのオブジェクトを生成して、配列の要素に代入
        workers[1] = new Police("田中", 28);

        // 出力用クラスに各オブジェクト情報を渡す
        Display.displayWorkers(workers);
    }
}

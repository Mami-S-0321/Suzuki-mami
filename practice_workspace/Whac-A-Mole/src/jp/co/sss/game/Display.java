package jp.co.sss.game;

/**
 * 画面表示クラス<br/>
 * 盤を画面に表示する機能をまとめたクラス
 *
 * @author SystemShared
 *
 */
public class Display {

    /** 縦方向のマスの数 */
    private static final int VERTICAL_LINE = 2;

    /** 横方向のマスの数 */
    private static final int HORIZONTAL_LINE = 2;

    /** マス内に表示するための数字(全角) */
    private static final String[] POINT_NUM = { "   １   ", "   ２   ",
            "   ３   ", "   ４   " };

    /**
     * プレイヤー選択用盤表示機能<br/>
     * プレイヤーにたたくポイントを選んでもらうために<br/>
     * 盤を表示する
     *
     */
    public static void showHex() {

        // マス番号の初期化
        int point = 0;

        // 盤の表示処理開始
        System.out.println("\n  ---------------------   ");

        // 縦方向のマスの総数まで繰り返す
        for (int i = 0; i < VERTICAL_LINE; i++) {

            // 横方向のマスの総数まで繰り返す
            for (int j = 0; j < HORIZONTAL_LINE; j++) {

                // マス番号の左側の罫線の表示
                System.out.print(" | ");

                // マス番号に対応した全角数字を表示
                System.out.print(POINT_NUM[point]);

                // マス番号を一つ進める
                point++;
            }
            // 行の最後に一つ罫線を足す(一番右側の罫線)
            System.out.println(" |  ");

            // 各行の下に罫線を付ける
            System.out.println("  ---------------------   ");
        }

    }

    /**
     * (1回ごとの)勝敗判定後盤表示機能<br/>
     * プレイヤーがポイントを選択した結果、<br/>
     * 盤がどうなったのかを表示する
     *
     * @param mole
     *            モグラ
     * @param strikePoint
     *            プレイヤーが選んだ座標
     */
    public static void showHex(Mole mole, int strikePoint) {

        // マス番号の初期化
        int point = 0;

        // 盤の表示処理開始
        System.out.println("  ---------------------   ");

        // 縦方向のマスの総数まで繰り返す
        for (int i = 0; i < VERTICAL_LINE; i++) {

            // 横方向のマスの総数まで繰り返す
            for (int j = 0; j < HORIZONTAL_LINE; j++) {

                // マス番号の左側の罫線の表示
                System.out.print(" | ");

                // 座標キャラクターの表示
                showPoint(mole, strikePoint, point);

                // マス番号を一つ進める
                point++;
            }

            // 行の最後に一つ罫線を足す(一番右側の罫線)
            System.out.println(" |  ");

            // 各行の下に罫線を付ける
            System.out.println("  ---------------------   ");
        }
        System.out.println();
    }

    /**
     * 座標キャラクター表示機能<br/>
     * 当該座標にセットされている値に応じてキャラクターを表示する )
     *
     * @param mole
     *            モグラ
     * @param strikePoint
     *            プレイヤーが選んだ座標
     * @param point
     *            マスの番号
     */
    private static void showPoint(Mole mole, int strikePoint, int point) {

        // プレイヤーが選んだ座標だった場合
        if (strikePoint == point) {

            // モグラにあたっていたらHIT!を表示
            if (mole.isHitFlag()) {
                System.out.print("  HIT!  ");

                // あたっていなければmissを表示
            } else {
                System.out.print("  miss  ");
            }

            // プレイヤーが選んでいない座標だった場合
        } else {

            // モグラがいる座標だった場合(・＊・)を表示
            if (mole.getStayPoint() == point) {
                System.out.print("(・＊・)");

                // それ以外の座標だった場合はマス番号に対応した全角数字を表示
            } else {
                System.out.print(POINT_NUM[point]);
            }
        }
    }
}

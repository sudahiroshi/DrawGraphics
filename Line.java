import java.awt.*;

/**
 * Lineオブジェクト
 * 図形オブジェクトの例
 */
class Line extends Figure {
	int x1, y1, x2, y2;
	/**
	 * コンストラクタ
	 * @param x1 始点のX座標
	 * @param y1 始点のY座標
	 * @param x2 終点のX座標
	 * @param y2 終点のY座標
	 */
	Line( int x1, int y1, int x2, int y2 ){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	/** 描画メソッド */
	@Override public void paint( Graphics g ){
		g.drawLine( this.x1, this.y1, this.x2, this.y2 );
	}
	/** 確認用 */
	@Override public String toString() {
		return "Line " + this.x1 + ", " + this.y1 + ", " + this.x2 + ", " + this.y2;
	}
}

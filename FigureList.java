class FigureList {
	private Figure[] data;
	private int length = 0;

	/** コンストラクタ */
	FigureList() {
		data = new Figure[ 10 ];
	}
	/**
	 * 配列長を受け取るコンストラクタ
	 * @param number 配列長
	 */
	FigureList( int number ) {
		data = new Figure[ number ];
	}
	/**
	 * 配列に図形を代入する
	 * @param fg 図形オブジェクト
	 */
	public void push( Figure fg ) {
		if( length < 10 ) {
			data[ length ] = fg;
			length++;
		} else {
			System.out.println( "これ以上記憶できません" );
		}
	}
	/**
	 * 論理的なデータ数を返す
	 * @return データ数
	 */
	public int getLength() {
		return this.length;
	}
	/**
	 * 図形オブジェクトを返す
	 * @param number データ番号
	 * @return 図形オブジェクト
	 */
	public Figure getFigure( int number ) {
		if( number < length )
			return data[number];
		else return null;
	}
}

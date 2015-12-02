import java.awt.*;
import java.util.*;

public class MyCanvas extends Canvas{
	FigureList fl;

	MyCanvas() {
		this.fl = new FigureList();
	}

	@Override public void update( Graphics g ) {
		this.paint( g );
	}

	@Override public void paint( Graphics g ) {
		for( int i=0; i<this.fl.getLength(); i++ ) {
			this.fl.getFigure(i).paint(g);
		}
		if( this.fl.getLength() == 0 ) {
			g.clearRect( 0, 0, 9999, 9999 );
			g.setColor( new Color( 0, 0, 0 ) );
		}
	}

	public void push( Figure f ) {
		this.fl.push( f );
	}

	public int getLength() {
		return this.fl.getLength();
	}
}

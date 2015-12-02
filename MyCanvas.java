import java.awt.*;
import java.util.*;

public class MyCanvas extends Canvas{
	FigureList fl;

	MyCanvas() {
		fl = new FigureList();
	}

	@Override public void update( Graphics g ) {
		this.paint( g );
	}

	@Override public void paint( Graphics g ) {
		for( int i=0; i<fl.getLength(); i++ ) {
			fl.getFigure(i).paint(g);
		}
		if( fl.getLength() == 0 ) {
			g.clearRect( 0, 0, 9999, 9999 );
			g.setColor( new Color( 0, 0, 0 ) );
		}
	}

	public void push( Figure f ) {
		fl.push( f );
	}

	public int getLength() {
		return fl.getLength();
	}
}

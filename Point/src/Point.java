
public class Point {

	private int x;
	private int y;
	
	public Point(int i, int j) {
		this.x = i;
		this.y = j;
	}
	
	public Point midPoint(Point P2) {
		x = (this.x + P2.x)/2;
		y = (this.y + P2.y)/2;
		return (new Point( x, y));
	}
	
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public Point scalePoint(int scaling_factor) {
		return(new Point(this.x * scaling_factor, this.y * scaling_factor));
	}

	public Point differsPoint(Point P2) {
		return(new Point(Math.abs(this.x - P2.x), Math.abs(this.y - P2.y)));
	}
}

package Point;

import org.w3c.dom.NodeList;

import java.util.LinkedList;
import java.util.List;

public class Point {
	String id;
	double x,y;

	//TODO add new variable
	String color;

	//TODO constructor
	public Point(){}
	public Point(String id, double x, double y, String color) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.color = color;
	}


	//TODO setters and getters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void move (char xDirection, char yDirection) {
		//TODO
		if (xDirection == 'L') {
			x = x - 1;
		} else if (xDirection == 'R') {
			x = x + 1;
		}
		if (yDirection == 'U') {
			y = y + 1;
		} else if (yDirection == 'D') {
			y = y - 1;
		}
	}

	public void draw () {
		//TODO
		System.out.println("(" + getX() + "," + getY() + ")");
	}

	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		Point newPoint1 = new Point("6", 7, 2, "blue");
		Point newPoint2 = new Point("7", 4, 8, "red")
		canvas.dodadiTocka(newPoint1);
		canvas.dodadiTocka(newPoint2);
	}
}

class Canvas extends Point{
	List<Point> list = new LinkedList();

	public void dodadiTocka(Point point)
	{
		list.add(point);
	}
}


package springDemo;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean,DisposableBean{
    private String type;
    private int height;
    private Point pointA;
    private Point pointB;

    private List<Point> points;
    
	public Triangle(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	
	

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void draw() {
		for(Point p : points) {
			System.out.println(getType()+" Triangle draw "+getHeight()+" Point de coordonnees "+p.getX()+" "+p.getY());

		}
	}

	@Override
	public void afterPropertiesSet() throws Exception {
   System.out.println("Initializing for bean method ");		
	}

	@Override
	public void destroy() throws Exception {
		   System.out.println("DisposableBean for bean method ");		
		
	}
}

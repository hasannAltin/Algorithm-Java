package s2;
import java.util.ArrayList; 
import java.util.Collections;
import java.util.HashSet;
import java.util.Set; 
public class HasanAltin_20010310016_PointMain {

	public static void main(String[] args) { 
	Point p1 = new Point(3, 4); 
	Set<String> sehirler = new HashSet<String>(); 
	sehirler.add("Ankara"); 
	Set<Point> points = new HashSet<Point>(); 
	points.add(p1); 
	points.add(new Point(10, 20)); 
	points.add(new Point(5, 6)); 
	points.add(p1); 
	System.out.println(points.toString()); 
	System.out.println(points.size()); 
	for (Point p : points) { 
	System.out.println(p.getX() + "," + p.getY()); 
	} 
	}}
		
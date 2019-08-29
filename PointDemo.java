class Point {
	int x, y;
	Point(){
		x=0;
		y=0;
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	Point(Point p){
		x = p.x;
		y = p.y;
	}
	double dist(Point p){
		return Math.sqrt((Math.pow(x-p.x,2))+(Math.pow(y-p.y,2)));
	}
}
class PointDemo{
	public static void main(String args[]){
		Point p1 = new Point(1,2);
		Point p2 = new Point(p1);
		Point p3 = new Point(3,4);
		double d1 = p1.dist(p2);//Dist bet p1 & p2
		double d2 = p2.dist(p3);//Dist bet p2 & p3
		System.out.println("Distance between Point 1 and Point 2 is:  "+d1);
		System.out.println("Distance between Point 2 and Point 3 is:  "+d2);
	}
}

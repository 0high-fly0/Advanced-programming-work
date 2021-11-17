package lab08;

public class Point {
    double x=0;
    double y=0;

    Point(){
        this.x=0;
        this.y=0;
    }

    Point(double x,double y){
        this.x=x;
        this.y=y;
    }

    public void getter(double x,double y){
        this.x=x;
        this.y=y;
    }
    public boolean equal(Point p){
        if (p.x==this.x && p.y==this.y){
            return true;
        }
        else return false;
    }
    public int hashCode() {
        int hashX = ((Double) x).hashCode();
        int hashY = ((Double) y).hashCode();
        return 31*hashX + hashY;
    }

    public void tostring(){
        System.out.println("(x,y)=("+this.x+","+this.y+")");
    }
    public static void main(String[] args) {
        Point point=new Point();
        point.tostring();
        point=new Point(3.2,5.1);
        point.tostring();
        point.getter(1.1,6.6);
        point.tostring();
        Point p=new Point(1.1,6.6);
        if (point.equal(p)) System.out.println("相等");
        else System.out.println("不相等");
        System.out.println(point.hashCode());
    }
}

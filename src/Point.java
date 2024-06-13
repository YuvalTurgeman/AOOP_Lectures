public class Point {
    //fields
    private double x;
    private double y;

    //ctors
    public Point(){
        x = 0;
        y = 0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(Object other){
        if(other instanceof Point){
            this.x = ((Point) other).x;
            this.y = ((Point)other).y;
        }
    }

    //getters+setters
    public double getX(){return x;}

    public double getY(){return y;}

    //methods
    public void move(double dx, double dy){
        x += dx;
        y += dy;
    }

    public boolean equals(Object other){
        if(other instanceof Point)
            return x == ((Point) other).x && y == ((Point)other).y;
        return false;
    }
}

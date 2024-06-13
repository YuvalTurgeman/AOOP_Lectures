public class Circle {
    //fields
    Point center;
    double radius;

    //ctors
    public Circle(){
        center = new Point();
        radius = 1;
    }

    public Circle(Point p, double r){
        this();//not sure that this is the mose elegant way to do this, maybe put the if statement in "try" block.
        if(p != null){//todo:here there is only a check to see if p is not null, but we are checking whether p is a point, the check will only happen in the copy ctor of point class, is it ok? check
            center = new Point(p);
            radius = r;
        }
    }

    public Circle(Object other){
        if(other instanceof Circle){
            center = new Point(((Circle)other).center);
            radius = ((Circle)other).radius;
        }
    }

    //getters+setters
    public Point getCenter(){
        return new Point(center);//we return a new instance of the center point instead of a referencing the original center point to prevent the ability to change the center from outside the class.
    }

    public double getRadius(){
        return radius;
    }

    public boolean setCenter(Point p){
        if(p!= null) {
            center = new Point(p);
            return true;
        }
        return false;
    }

    public boolean setRadius(double r){
        if(radius >=0) {
            radius = r;
            return true;
        }
        return false;
    }

    //methods
    public double getArea(){
        return radius*radius*Math.PI;
    }

    public double getCircumference(){
        return 2*radius*Math.PI;
    }

    public boolean equals(Object other){
        if(other instanceof Circle)
            return center.equals(((Circle) other).center) && radius == ((Circle)other).radius;
        return false;
    }
}

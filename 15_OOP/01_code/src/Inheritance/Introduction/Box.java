package Inheritance.Introduction;

public class Box {
    double l;
    double w;
    private double h;
//

    public Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    public Box(double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    public Box(Box box){
        this.l = box.l;
        this.w = box.w;
        this.h = box.h;
    }

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
}

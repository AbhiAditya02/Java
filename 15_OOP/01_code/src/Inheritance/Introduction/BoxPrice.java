package Inheritance.Introduction;

public class BoxPrice extends BoxWeight {
    double cost;

     BoxPrice(){
         super();
         cost = -1;
     }

    BoxPrice(double cost) {
        this.cost = cost;
    }

    BoxPrice(BoxPrice other) {
        super(other);
        this.cost = other.cost;
    }

    BoxPrice(double l, double w, double h, double weight, double cost) {
        super(l, w, h, weight);
        this.cost = cost;
    }
}
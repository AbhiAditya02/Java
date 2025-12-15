package Inheritance.Introduction;

public class BoxWeight extends Box{
    double weight;
    // this weight property can not be used by the parent class i.e. box class

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(BoxWeight box) {
        super(box);
        this.weight = box.weight;
    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h);
        /*
            super is used to explicitly access the parent class constructors, methods, fields.
            super() specifically calls the parent constructor
            it must be the first statement of the child constructor.
        */
        this.weight = weight;
    }
}

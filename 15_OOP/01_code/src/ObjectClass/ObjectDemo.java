package ObjectClass;

public class ObjectDemo {
    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }
//    toString returns a string representation of an object.
//    Without overriding, printing an object is useless.

    @Override
    public String toString() {
//        return super.toString();
        return ("number : " + num);
    }

//    finalize is called before garbage collection hits
//    Removed from modern Java practice
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

//    Returns an integer hash value (random integer value) for an object.
//    different obj have different hashcode, it's not the object.
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((ObjectDemo) obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(24);
        ObjectDemo obj2 = new ObjectDemo(24);

//        instanceof :
//        instanceof is used to check whether an object belongs to a specific class or interface at runtime.
        System.out.println(obj instanceof ObjectDemo); // true
        System.out.println(obj instanceof Object); // true


//        getClass method : Returns the runtime class of the object.
        System.out.println(obj.getClass()); // class ObjectClass.ObjectDemo

        if(obj.equals(obj2)){
            System.out.println("Obj is equal to obj2");
        } else {
            System.out.println("Obj is not equal to obj2");
        }

        System.out.println(obj.hashCode());

//        if(obj == obj2){
//            System.out.println("Obj is equal to obj2");
//        } else {
//            System.out.println("Obj is not equal to obj2");
//        }
//        == don't compare the obj, it compares where objects are pointing to same memory location
    }
}

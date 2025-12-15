package Introduction;

class Stu_dent {
    final int num = 10;
    String name;

    public Stu_dent(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
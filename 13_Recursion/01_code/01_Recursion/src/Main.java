public class Main {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int num){
        if(num > 5) return;
        System.out.println(num);
        print(num + 1);
    }
}
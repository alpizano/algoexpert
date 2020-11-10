package recursion;

public class NthFibonacciRecursive {
    public static int getNthFib(int n) {

        if(n==1) {
            return 0;
        }
        else if(n==2) {
            return 1;
        }
        else {
            return getNthFib(n-1) + getNthFib(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(NthFibonacciRecursive.getNthFib(6));
    }
}

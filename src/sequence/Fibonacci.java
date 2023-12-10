package sequence;

import java.util.ArrayList;

public class Fibonacci extends Sequence {
    private int[] beginning = new int[]{0,1};
    
    public Fibonacci(){
        super("Fibonacci");
        initialize();
    }
    
    public Fibonacci(int f0, int f1){
        super("Fibonacci [f0,f1]=["+f0+","+f1+"]");
        beginning[0]=f0;
        beginning[1]=f1;
        initialize();
    }
    
    private int fibonacci(int n, ArrayList<Integer> list){
        if (n<=1){
            return beginning[n];
        } else if (n<list.size()){
            return list.get(n);
        } else {
            return fibonacci(n-1, list)+fibonacci(n-2, list);
        }
    }

    @Override
    void initialize() {
        int i=0;
        int fib;
        while((fib=fibonacci(i, sequence))<=max){
            sequence.add(fib);
            i++;
        }
    }
    
}

package sequence;

public class Arithmetic extends Sequence {
    private int a1,diff;

    public Arithmetic(int a1, int diff){
        super("Arithmetic [a1,diff]=["+a1+","+diff+"]");
        this.a1=a1;
        this.diff=diff;
        initialize();
    }
    
    @Override
    public int getSum(int n){
        return (2*a1+(n-1)*diff)*n/2;
    }
    
    @Override
    void initialize() {
        int an;
        int n=1;
        while((an=a1+(n-1)*diff)<=max){
            sequence.add(an);
            n++;
        }
    }
    
}

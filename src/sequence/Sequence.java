package sequence;

import java.util.ArrayList;
import java.util.Collections;
import exceptions.CantDecomposeException;
import exceptions.OutOfBoundsException;

abstract public class Sequence {
    
    protected int max = 1000;
    protected ArrayList<Integer> sequence = new ArrayList<>();
    private String name;
    
    public Sequence(String name){
        this.name=name;
    }
    
    /**
     * Compute the sum of n initial elements in the sequence
     * @param n ...
     * @return sum of n initial elements
     * @throws OutOfBoundsException
     */
    public int getSum(int n) throws OutOfBoundsException {
        if (n>sequence.size()){
            throw new OutOfBoundsException("In the sum function for "
                    +name+" sequence max="
                    +sequence.size(),n);
        }
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=sequence.get(i);
        }
        return sum;
    }
    
    public ArrayList<Integer> decompose(int n) 
            throws CantDecomposeException {
        int nBackup=n;
        ArrayList<Integer> ret=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>(sequence); //shallow copy
        Collections.sort(list, Collections.reverseOrder());
        
        int i=0;
        while(n>0 && i<list.size()){
            if (list.get(i) <= n){
                ret.add(list.get(i));
                n-=list.get(i);
            }else {
                i++;
            }
        }
        if (n!=0){
            throw new CantDecomposeException(name,nBackup);
        }
        return ret;
    }
    
    public void setMax(int max){
        this.max=max;
        sequence.clear();
        initialize();
    }
    
    public ArrayList<Integer> getSequence(){
        return sequence;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Sequence: "+name+" [max: "+max+"]";
    }
    
    abstract void initialize();
    
}

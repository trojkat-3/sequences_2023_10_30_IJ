package sequence;

public class Primes extends Sequence {
    
    public Primes(){
        super("Primes");
        initialize();
    }
    
    private boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    void initialize() {
        for (int i = 1; i <= max; i++) {
            if (isPrime(i)) {
                sequence.add(i);
            }
        }
    }
    
    
}

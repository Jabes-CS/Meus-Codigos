package Codigos;
public class Fatorial {
    
    long fatorial(long n) {
        
        if (n == 0) {
            return 1;
            
        } else {
            return n * fatorial(n - 1);
        }
    }
}
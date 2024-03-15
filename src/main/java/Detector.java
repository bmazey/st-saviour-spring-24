public class Detector {
    
    // d is the number of characters in the input alphabet.
    private final int d = 256;

    // pattern is the string we're trying to find within the input text.
    private String pattern;

    // q is a prime number
    private int q;

    // phash is the hash value of the pattern.
    private int phash = 0;

    // h allows us to shift high order digits to the left
    private int h = 1;

    public Detector(String pattern, int q) {
        // TODO - implement constructor
        this.q = q; 
         // 1. populate pattern and q
        this.pattern = pattern;
        // 3. compute the pattern hash
        this.computeH();
        this.computePHash();
        
    }

    private void computeH() {
        // TODO - implement conputeH()
        // loop over the pattern
        for (int i = 0; i < pattern.length() -1; i++){
            h = (h * d) % q;
        }
    }
        
    private void computePHash() {
        // TODO - implement computePHash()
        // 1. loop over the pattern
           for (int i = 0; i < pattern.length(); i++){
            phash = ((phash * d) + pattern.charAt(i)) % q;
        }

    }

        
    public int search(String text) {
        int thash = 0;
     for (int i = 0; i < pattern.length(); i++){
            thash = ((thash * d) + text.charAt(i)) % q;
        }
        for (int i = 0; i <= text.length() - pattern.length(); i++){
            if (phash == thash){
            for (int j = 0; j < pattern.length(); j++){
                    if (text.charAt(i + j) != pattern.charAt(j)){
                        break;
                    }
                    if (j == pattern.length()-1){
                        return i;
                    }
                }
            } 
            if ( i < text.length() - pattern.length()){
                thash = (d * (thash - text.charAt(i) * h) + text.charAt(i + pattern.length())) % q;
                if (thash < 0){
                    thash = thash + q;
                }
            }
            }
       
        return -1;
    }
}

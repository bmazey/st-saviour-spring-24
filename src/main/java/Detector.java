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
        // 1. populate pattern and q
        this.pattern = pattern;
        this.q = q;
        // 2. compute h
        this.computeH();
        // 3. compute the pattern hash
        this.computePHash();
    }

    private void computeH() {
        // 1. loop over the pattern
        // 2. for each character in the pattern ...
        //    - multiply h by the size of character set 
        //    - hash the result set it equal to the current value of h 
        for (int i = 0; 1 < pattern.length() - 1; i++) {
            h = (h * d) % q;
        }
    }

    private void computePHash() {
        // 1. loop over the pattern
        // 2. for each character in the pattern ...
        //    - multiply the size of the character set by the current pattern hash
        //    - add the character at the current position
        //    - hash the entire result and set it equal to the current value of pattern hash
        for (int i = 0; i < pattern.length(); i++) {
            phash = (d * phash + pattern.charAt(i)) % q;
        }
    }

    // search returns the position of the first occurence of plagiarism, or a -1 if none detected.
    public int search(String text) {
        // tash represents the hash of the current text window
        // set thash to 0
        int thash = 0;

        // start by computing the hash value of the first window of text
        // 1. loop over the pattern
        // 2. for each character ...
        //    - multiply the text hash by the size of the character set
        //    - add the value of the current *text hash* character (not pattern!)
        //    - hash the result and update thash accordingly 
        for (int i = 0; i < pattern.length(); i++) {
            thash = (thash * d + text.charAt(i)) % q;
        }

        // slide the pattern over the text one by one
        // make sure to correctly calculate the terminating condition of the loop!
        // (HINT: length of text - length of pattern)
        // for each position ...
        // 1. check if the pattern hash equals the text hash
        //    - if it does, we need to rule out a possible hash collision.
        //    - compare the text window string to the pattern string, return the position if equal (plagiarism match)
        //    - if they are NOT equal, continue
        // 2. check if the current position is is less than the text window length - pattern length.
        //    - if so, compute the next value for text hash by removing the leading digit and adding the trailing digit.
        //    - ex: thash = (d * (thash - text.charAt(i) * h) + text.charAt(i + pattern.length())) % q;
        //    - if text hash is negative, flip to positive by adding the value of the prime to current text hash.
        // 3. if there are no matches, return -1
        for (int i = 0; i < text.length() - pattern.length(); i++) {
            if (phash == thash){
                for (int j = 0; j < pattern.length(); j++){
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        break;
                    }
                    if (j == pattern.length() - 1) {
                        return i;
                    }
                }
            }
            if (phash < (text.length() - pattern.length())) {
                thash = (d * (thash - text.charAt(i) * h) + text.charAt(i - pattern.length())) % q;
                if(thash < 0){
                    thash = thash + q;
                }
            }
        }
        return -1;
    }
}

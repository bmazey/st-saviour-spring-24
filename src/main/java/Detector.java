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
        // 1. populate pattern and q
        // 2. compute h
        // 3. compute the pattern hash
    }

    private void computeH() {
        // TODO - implement conputeH()
        // 1. loop over the pattern
        // 2. for each character in the pattern ...
        //    - multiply h by the size of character set 
        //    - hash the result set it equal to the current value of h 
    }

    private void computePHash() {
        // TODO - implement computePHash()
        // 1. loop over the pattern
        // 2. for each character in the pattern ...
        //    - multiply the size of the character set by the current pattern hash
        //    - add the character at the current position
        //    - hash the entire result and set it equal to the current value of pattern hash
    }

    // search returns the position of the first occurence of plagiarism, or a -1 if none detected.
    public int search(String text) {
        // TODO implement search()
        // tash represents the hash of the current text window
        // set thash to 0
        int thash = 0;

        // start by computing the hash value of the first window of text
        // 1. loop over the pattern
        // 2. for each character ...
        //    - multiply the text hash by the size of the character set
        //    - add the value of the current *text hash* character (not pattern!)
        //    - hash the result and update thash accordingly 

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
        return -1;
    }
}

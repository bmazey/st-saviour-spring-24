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
        // populates pattern and q
        this.pattern = pattern;
        this.q = q;
        // computes h
        this.computeH();
        // computes the pattern hash
        this.computePHash();

    }
    private void computeH() {
        // loops over the pattern 
        for (int i = 0; i < pattern.length() - 1; i++) {
            // sets h equal to the hash of the product of h times the character set
            h = (h * d) % q;
        }
    }
    private void computePHash() {
        // loop over the patterns
        for (int i = 0; i < pattern.length(); i++) { 
            // computes the phash at each position by multiplying phash by the character set, 
            // adding the character at that position, and hashing it. 
            phash = (d * phash + pattern.charAt(i)) % q;
        }
    }
    // search returns the position of the first occurence of plagiarism, or a -1 if none detected.
    public int search(String text) {
        // sets the first window of text to begin at position 0. 
        int thash = 0;
        // loops over the pattern
        for (int i = 0; i < pattern.length(); i++) {
            // finds the text hash at each position by multiplying the text hash by the character set size, 
            // adding the character at that position, and hashing it. 
            thash = (thash * d + text.charAt(i)) % q;
        }
        // goes through the pattern position by position
        for (int i = 0; i < text.length() - pattern.length(); i++) {
            // checks if the pattern hash is equal to the text hash
            if (phash == thash) {
                // compares the text window to the pattern window, and checks if the characters are not the same. 
                for (int j = 0; j< pattern.length(); j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        // continues if they are not equal
                        break;
                    }
                    // checks if the characters are the same
                    if (j == pattern.length() - 1) {
                        // returns the position if they are equal
                        return i;
                    }
                }
            }
            // checks if the position is less than the length of the text minus the length of the pattern
            if (i < (text.length() - pattern.length())) {
                // computes the next value for text hash by removing the leading digit and adding the trailing digit.
                thash = (d * (thash - text.charAt(i) * h) + text.charAt(i + pattern.length())) % q;
                // checks if thash is negative
                if (thash < 0) {
                    // if it is, it is made positive by adding the prime number
                    thash = thash + q;
                }
            }
        }
        // returns negative 1 if no plagarism is found. 
        return -1;
    }
}

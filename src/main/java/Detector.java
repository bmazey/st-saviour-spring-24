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
        // q and pattern are defined
        this.q = q; 
        this.pattern = pattern;

        // call h from private method
        this.computeH();

        // Call pattern from private method.
        this.computePHash();
    }

    private void computeH() {
        // when the index is less than the pattern length, hash the character set and define it to h
        for (int i = 0; i < pattern.length() -1; i++) {
            h = (h * d) % q;
        }
    }

    private void computePHash() {
        // when the index is less than the pattern length, hash the pattern
        for (int i = 0; i < pattern.length(); i++) {
            phash = ((phash * d) + pattern.charAt(i)) % q;
        }

    }

    // search returns the position of the first occurence of plagiarism, or a -1 if none detected.
    public int search(String text) {
        // tash represents the hash of the current text window, starting at 0
        int thash = 0;

        // when i is less than the pattern length, hash the current text character
        for (int i = 0; i < pattern.length(); i++) {
            thash = ((thash * d) + text.charAt(i)) % q;
        }

        // when i is less than or equal to the window of text between the text and pattern length
        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            // ...if the pattern hash is equal to the text hash check if the characters are the same. if no then continue. 
            if (phash == thash) {
                for (int j = 0; j < pattern.length(); j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        break;
                    }
                    if (j == pattern.length()-1) {
                        return i;
                    }
                }
            } 
            // if i is less than the value of the window of text between the text and pattern length, calculate the text has.
            if (i < text.length() - pattern.length()) {
                thash = (d * (thash - text.charAt(i) * h) + text.charAt(i + pattern.length())) % q;
                // if the text hash is less than 0, add q.
                if (thash < 0) {
                    thash = thash + q;
                }
            }
        }
        return -1;
    }
}

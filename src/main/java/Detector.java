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
        this.pattern = pattern;
        this.q = q;

        // compute h
        computeH();

        // compute pattern hash
        computePHash();

    }

    private void computeH() {
        for (int i = 0; i < pattern.length() - 1; i++) {
            h = (h * d) % q;
        }
    }

    private void computePHash() {
        for (int i = 0; i < pattern.length(); i++) {
            phash = (d * phash + pattern.charAt(i)) % q;
        }
    }

    // search returns the position of the first occurence of plagiarism, or a -1 if none detected.
    public int search(String text) {
        // tash represents the hash of the current text window
        int thash = 0;

        // start by computing the hash value of the first window of text
        for (int i = 0; i < pattern.length(); i++) {
            thash = (d * thash + text.charAt(i)) % q;
        }

        System.out.println("phash: " + phash);
        System.out.println("thash: " + thash);

        // slide the pattern over the text one by one
        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            // check for hash collision
            if (phash == thash) {
                System.out.println("collision at position: " + i);
                // check for false positive
                for (int j = 0; j < pattern.length(); j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        // false positive, do not continue
                        break;
                    }
                           // we have arrived at end of pattern, match detected
                    if (j == pattern.length() - 1) {
                        return i;
                    }
                }
            }

            // calculate hash value for next window of text
            // remove leading digit, add trailing digit
            if (i < text.length() - pattern.length()) {
                thash = (d * (thash - text.charAt(i) * h) + text.charAt(i + pattern.length())) % q;

                // take absolute value just in case thash is negative
                if (thash < 0) {
                    thash = thash + q;
                }
            }
        }

        // no match detected, return -1
        return -1;
    }
}

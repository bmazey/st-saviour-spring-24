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
        // use key word "this" to refer to constructor pattern and q
        this.pattern = pattern;
        this.q = q;
        // 2. compute h
         // use key word "this" to refer to method compute h and compute pattern hash
        this.computeH();
        // 3. compute the pattern hash
        this.computePHash();
    }

    private void computeH() {
        // TODO - implement conputeH()
        // 1. loop over the pattern
        for(int i = 0; i < pattern.length() - 1; i++){
      // To determine current character; multiply h by the current size of the set and then hash it
            h = (h * d) % q;
        }   
    }

    private void computePHash() {
        // loop over the pattern
        for(int i = 0; i < pattern.length(); i++){
      // Now you're trying to find the current value of the pattern so multiply the current set size 
      // by current pattern hash and then add the current position. Since this is a hash you have to 
      // hash all that you just did (%q)
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
        for(int i = 0; i < pattern.length(); i++){
        // To find the current text value hash repeat the same steps as pattern hash just substitue
        // pattern for text or t instead 
            thash = (thash * d + text.charAt(i)) % q;
        }
        // slide the pattern over the text one by one, shifting over in the loop
        for(int i = 0; i <= text.length() - pattern.length(); i++) {
            // determine if the pattern matches the text 
            if(phash == thash){
                // create a new loop to compare the text by the pattern given
                for(int j = 0; j < pattern.length(); j++) {
                    if(text.charAt(i + j) != pattern.charAt(j)) {
                        // if not equal stop going over loop
                        break;
                    }
                    if(j == pattern.length() - 1) {
                        // if equal return i
                        return i;
                    }
                }
            }
            // 2. check if the current position is is less than the text window length - pattern length.
            if(i < text.length() - pattern.length()) {
                // if it is you need to determine the current thash 
                thash = (d * (thash - text.charAt(i) * h) + text.charAt(i + pattern.length())) % q;
                if(thash < 0) {
                    // if result is a negative number make it positive by absolute value and then adding q
                    thash += q;
                }
            }
        }
        // if no matches return -1
        return -1;
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
         



}


    

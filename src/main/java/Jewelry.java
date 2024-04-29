public class Jewelry {
    // Create the data which will be needed and is not represented by a number rather a word which is 
    // why you use a 'string' instead of an 'int'
    private String metal; // type of metal used
    private String gemstones; // type of gemstones added
    private String jewelryCategory; // type of jewelry making

      // With the strings above you will be building a jewelry so you are notifying the system of a builde
    public Jewelry(JewelryBuilder builder) {
     // Using key word 'this' refers to the strings but with builder because it's going through builder
    // to make the jewelry 
     this.metal = builder.metal;
        this.gemstones = builder.gemstones;
        this.jewelryCategory = builder.jewelryCategory;
    }
    // Create getters for your strings in lines 17-26 and key word 'this' to refer back to the string
    public String getMetal() {
        return this.metal;
    }

    public String getGemstones() {
        return this.gemstones;
    }

    public String getCategory(){
        return this.jewelryCategory;
    }

    public static class JewelryBuilder {
        // Identify and create the data needed for builder 
        private String metal;
        private String gemstones;
        private String jewelryCategory;

      // So you are telling the system that builder is choosing a metal and will return that metal
      // after choosing it 
        public JewelryBuilder metalType(String type) {
            this.metal = type;
            return this;
        }
      // Telling the system that you will have gems and it choose a gem and returns the name of the gem
        public JewelryBuilder withGems (String gemstones) {
            this. gemstones = gemstones;
            return this;
        }
        // Telling the system that builder picks a category and returns name of the category 
        public JewelryBuilder whatCategory (String jewelryCategory) {
            this.jewelryCategory = jewelryCategory;
            return this;
        }
        // Finally put everything together and get a new jewelry 
        public Jewelry build() {
            return new Jewelry(this);
        }
    }
}
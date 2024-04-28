public class Jewelry {
    
    // data members for the characteristics of jewelry
    private String metal;
    private String gemstones;
    private String jewelryCategory;

    // constructor for Jewelry
    public Jewelry(JewelryBuilder builder) {
        this.metal = builder.metal;
        this.gemstones = builder.gemstones;
        this.jewelryCategory = builder.jewelryCategory;
    }

    // getter for metal type
    public String getMetal() {
        return this.metal;
    }

    // getter for gemstone type
    public String getGemstones() {
        return this.gemstones;
    }

    // getter for category type
    public String getCategory() {
        return this.jewelryCategory;
    }

    public static class JewelryBuilder {

        // data members
        private String metal;
        private String gemstones;
        private String jewelryCategory;
        
        // set the metal type and return the builder object
        public JewelryBuilder metalType(String type) {
            this.metal = type;
            return this;
        }

        // set gemstones and return builder object
        public JewelryBuilder withGems(String gemstones) {
            this.gemstones = gemstones;
            return this;
        }

        // set jewelry category and return builder object
        public JewelryBuilder whatCategory(String jewelryCategory) {
            this.jewelryCategory = jewelryCategory;
            return this;
        }

        // method build() returns an instance of Jewelry with the current builder object
        public Jewelry build() {
            return new Jewelry(this);
        }
    }
}
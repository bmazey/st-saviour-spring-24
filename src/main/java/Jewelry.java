public class Jewelry {

    private String metal;
    private String gemstones;
    private String jewelryCategory;

    public Jewelry(JewelryBuilder builder) {
        this.metal = builder.metal;
        this.gemstones = builder.gemstones;
        this.jewelryCategory = builder.jewelryCategory;
    }

    public String getMetal() {
        return this.metal;
    }

    public static class JewelryBuilder {

        private String metal;
        private String gemstones;
        private String jewelryCategory;
        
        public JewelryBuilder metalType(String type) {
            this.metal = type;
            return this;
        }

        public JewelryBuilder withGems(String gemstones) {
            this.gemstones = gemstones;
            return this;
        }

        public JewelryBuilder whatCategory(String jewelryCategory) {
            this.jewelryCategory = jewelryCategory;
            return this;
        }

        public Jewelry build() {
            return new Jewelry(this);
        }
    }
}
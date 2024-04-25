public class Jewelry {


    private String gold;
    private String silver;
    private String mixedMetal;
    private String gemstones;
    private String jewelryCategory;
    

    public static class JewelryBuilder {

        private String gold;
        private String silver;
        private String mixedMetal;
        private String gemstones;
        private String jewelryCategory;
        
        public JewelryBuilder metalType(String gold, String silver, String mixedMetal) {
            this.gold = gold;
            this.silver = silver;
            this.mixedMetal = mixedMetal;
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
    }
}
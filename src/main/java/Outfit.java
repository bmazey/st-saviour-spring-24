public class Outfit {
    
    public static class OutfitBuilder {

        private String shirt;
        private String pants;
        private String accesories;
        private boolean hat;

        public String setShirt() {
            return shirt;
        }
        public void getShirt(String shirt) {
            this.shirt = shirt
        }
    }
}

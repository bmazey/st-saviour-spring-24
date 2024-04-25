public class Outfit {

    public static class OutfitBuilder {
        
        private String shirt;
        private String pants;
        private String accesories;
        private boolean hat;
    
        public String setShirt(){
            return shirt;
        }
        public void getShirt(String shirt){
            this.shirt = shirt;
        }  
    
        public String setPants(){
            return pants;
        }
        public void getPants(String pants){
            this.pants = pants;
        }
    
        public String setAccesories(){
            return accesories;
        }
        public void getAccesories(String accesories){
            this.accesories = accesories;
        }

        public boolean setHat(){
            return hat;
        }
        public void getHat(boolean hat){
            this.hat = hat;
        }

        public OutfitBuilder(String shirt, String pants) {
            this.shirt = shirt;
            this.pants = pants;
        }
    
        public OutfitBuilder withAccesories(String accesories) {
            this.accesories = accesories;
            return this;
        }
    
        public OutfitBuilder wantsHat(boolean hat) {
            this.hat = hat;
            return this;
        }
        
        public Outfit build() {
            return new Outfit();
        }
    }
    
}

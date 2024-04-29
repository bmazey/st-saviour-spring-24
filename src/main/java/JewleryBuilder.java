public class JewleryBuilder {
    //establishing data members and types 
    private int Length;
    private String Material;
    private boolean isNecklace;
    private boolean isBracelet;
    private boolean isRing;
//establishing getters for each member
    public int getLength() {
        return Length;
    }
    public String getMaterial () {
        return Material; 
    }
    public boolean isNecklace () {
        return isNecklace;
    }
    public boolean isRing () {
        return isRing;
    }
    public boolean isBracelet () {
        return isBracelet;
    }

    private JewleryBuilder(JewleryBuilder jewleryBuilder) {
        this.Length = jewleryBuilder.Length;
        this.Material = jewleryBuilder.Material;
        this.isNecklace = jewleryBuilder.isNecklace;
        this.isBracelet = jewleryBuilder.isBracelet;
        this.isRing = jewleryBuilder.isRing;
    }
    public static class JewleryBuilderBuild {
        private int Length;
        private String Material;
        private boolean isNecklace;
        private boolean isBracelet;
        private boolean isRing;
    }
    //connecting those types to that builder method 
    public void JewleryBuilderBuild(int Length, String Material) {
        this.Length = Length;
        this.Material = Material;
    }
    //establishing the setters 
    public JewleryBuilder setBraclet(boolean isBracelet) {
        this.isBracelet = isBracelet;
        return this;
    }
    public JewleryBuilder setNecklace(boolean isNecklace) {
        this.isNecklace = isNecklace;
        return this;
    }
    public JewleryBuilder setRing(boolean isRing) {
            this.isRing = isRing;
            return this;
    }
    public JewleryBuilder build() {
        return new JewleryBuilder(this);
    }
    
        
}

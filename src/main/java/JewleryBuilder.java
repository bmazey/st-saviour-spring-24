public class JewleryBuilder {
    private int Length;
    private String Material;
    private boolean isNecklace;
    private boolean isBracelet;
    private boolean isRing;

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

    private JewleryBuilder(JewleryBuilderBuild builder) {
        this.Length = builder.Length;
        this.Material = builder.Material;
        this.isNecklace = builder.isNecklace;
        this.isBracelet = builder.isBracelet;
        this.isRing = builder.isRing;
    }
    public static class JewleryBuilderBuild {
        private int Length;
        private String Material;
    }
}

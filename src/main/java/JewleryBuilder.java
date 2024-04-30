public class JewleryBuilder {

// parameters 
    private int Length;
	private String Material;

    private boolean isNecklace;
	private boolean isBracelet;
    private boolean isRing;

	
	public int getLength() {
		return Length;
	}

	public String getMaterial() {
		return Material;
	}

	public boolean isNecklace() {
		return isNecklace;
	}

	public boolean isBracelet() {
		return isBracelet;
	}

    public boolean isRing() {
		return isRing;
	}


private JewleryBuilder(JewleryBuilderBuild builder) {
		this.Length=builder.Length;
		this.Material=builder.Material;
		this.isNecklace=builder.isNecklace;
		this.isBracelet=builder.isBracelet;
        this.isRing=builder.isRing;
}

//Builder Class
	public static class JewleryBuilderBuild{

		// required parameters
		private int Length;
		private String Material;

		// optional parameters
		private boolean isNecklace;
		private boolean isBracelet;
		private boolean isRing;
		
		public JewleryBuilderBuild(int Length, String Material){
			this.Length=Length;
			this.Material=Material;
		}

		public JewleryBuilderBuild setBracelet(boolean isBracelet) {
			this.isBracelet = isBracelet;
			return this;
		}

		public JewleryBuilderBuild setNecklace(boolean isNecklace) {
			this.isNecklace = isNecklace;
			return this;
		}
		
		public JewleryBuilderBuild setRing(boolean isRing) {
			this.isRing = isRing;
			return this;
		}
		
		public JewleryBuilder build(){
			return new JewleryBuilder(this);
		}

	}

}


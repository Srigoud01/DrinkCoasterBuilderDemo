package builder;

public class SiliconeCoasterBuilder extends CoasterBuilder{

	public SiliconeCoasterBuilder() {
		this.name = "Silicone Coaster";
	}
	public CoasterBuilder addAlcoholicInk() {
		this.materials.add("Alcoholic Ink");
		return this;
	}
	public CoasterBuilder addHarderner() {
		this.materials.add("Harderner");
		return this;
	}
	public CoasterBuilder addIron() {
		//this.materials.add("Iron");
		return this;
	}
	public CoasterBuilder addMagnesium() {
		//this.materials.add("Magnesium");
		return this;
	}
	public CoasterBuilder addResin() {
		this.materials.add("Resin");
		return this;
	}
	public CoasterBuilder addSilicone() {
		this.materials.add("Silicone");
		return this;
	}
	public CoasterBuilder addSilver() {
		//this.materials.add("Silver");
		return this;
	}
}

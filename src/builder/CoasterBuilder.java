package builder;
import java.util.*;
public abstract class CoasterBuilder {

	String name;
	List<String> materials = new ArrayList<String>();

	public abstract CoasterBuilder addMagnesium();
	public abstract CoasterBuilder addIron();
	public abstract CoasterBuilder addSilver();

	public abstract CoasterBuilder addHarderner();
	public abstract CoasterBuilder addSilicone();
	public abstract CoasterBuilder addResin();
	public abstract CoasterBuilder addAlcoholicInk();




	public Coaster build() {
		Coaster coaster = new Coaster();
		coaster.setName(this.name);
		coaster.addMaterials(materials);
		return coaster;
	}

}

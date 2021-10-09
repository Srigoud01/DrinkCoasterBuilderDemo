package builder;
import java.util.*;
public class Coaster {

	String name;
	List<String> materials;
	public void addMaterials(List<String> materials) {
		this.materials = materials;
	}

	void prepare() {
		System.out.println("Prepare " + name );
		System.out.println("Materials for making DrinkCoaster");
		for(String material : materials) {
			System.out.println("   " + material);
		}

	}

	void pack() {
		System.out.println("Done producing and distributing " + name);
	}
	public void setName(String name ) {
		this.name = name;
	}
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("-----" + this.name + "-----\n");
		for(String material: materials) {
			display.append(material + "\n");
		}
		return display.toString();
	}

}

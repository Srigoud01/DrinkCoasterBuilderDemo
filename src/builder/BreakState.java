package builder;

public class BreakState implements State {
	CoasterManager coaster;
	public BreakState(CoasterManager coaster) {
		this.coaster = coaster;
	}

	@Override
	public void buyCoaster() {
		System.out.println("Buying Coasters ");
		coaster.setState(coaster.getBuyState());
	}

	@Override
	public void breakCoaster() {
		System.out.println("Coaster broke");
		System.out.println("Create a new Coster");
		//here we create the builder pattern
		CoasterBuilder metalicBuilder = new MetallicCoasterBuilder();
		Coaster metalicCoaster = metalicBuilder.addAlcoholicInk().addHarderner().addIron().addMagnesium().addResin().addSilicone().addSilver().build();
		metalicCoaster.prepare();

		metalicCoaster.pack();
		System.out.println(metalicCoaster);

	}

	@Override
	public void serveCoaster() {
		System.out.println("Coaster broken cannot serve");

	}

	@Override
	public void washCoaster() {
		System.out.println("Coaster broken cannot be washed");

	}
	@Override
	public void dryCoaster() {

	}
	public String toString() {
		return " broke";
	}
}

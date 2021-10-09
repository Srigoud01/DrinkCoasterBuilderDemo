package builder;

public class BuyState implements State {
	CoasterManager coaster;
	public BuyState(CoasterManager coaster) {
		this.coaster = coaster;
	}

	@Override
	public void buyCoaster() {
		System.out.println("Buying Coaster");

	}

	@Override
	public void breakCoaster() {
		System.out.println("Coaster broke");
		coaster.setState(coaster.getBreakState());

	}

	@Override
	public void serveCoaster() {
		System.out.println("Serving with coaster");
		coaster.setState(coaster.getServeState());

	}

	@Override
	public void washCoaster() {
		System.out.println("Washing Coaster");
		coaster.setState(coaster.getWashState());

	}
	@Override
	public void dryCoaster() {
		System.out.println("Wash Coaster first before drying");
	}
	public String toString() {
		return " bought";
	}

}

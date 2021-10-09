package builder;

public class ServeState implements State {
	CoasterManager coaster;
	public ServeState(CoasterManager coaster) {
		this.coaster = coaster;
	}

	@Override
	public void buyCoaster() {
		System.out.println("Coaster already bought");

	}

	@Override
	public void breakCoaster() {
		System.out.println("Coaster Broke");
		coaster.setState(coaster.getBreakState());

	}

	@Override
	public void serveCoaster() {
		System.out.println("Serving tea with coaster");

	}
	@Override
	public void dryCoaster() {

	}
	@Override
	public void washCoaster() {
		System.out.println("Coaster finished serving, Washing coaster");
		coaster.setState(coaster.getWashState());
	}
	public String toString() {
		return " Serving tea";
	}
}

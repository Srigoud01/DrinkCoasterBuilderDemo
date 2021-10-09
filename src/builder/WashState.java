package builder;

public class WashState implements State {
	CoasterManager coaster;
	public WashState(CoasterManager coaster) {
		this.coaster = coaster;
	}

	@Override
	public void buyCoaster() {
		System.out.println("Coaster already bought");

	}

	@Override
	public void breakCoaster() {
		System.out.println("Coaster broke");
		coaster.setState(coaster.getBreakState());
	}

	@Override
	public void serveCoaster() {
		System.out.println("Coaster serving tea");
		coaster.setState(coaster.getServeState());

	}

	@Override
	public void washCoaster() {
		System.out.println("Coaster broken, needs to be recycled or thrown away");

	}
	@Override
	public void dryCoaster() {

	}
	public String toString() {
		return " being cleaned";
	}
}

package builder;

public class DryState implements State {
	CoasterManager coaster;

	public DryState(CoasterManager coaster) {
		this.coaster = coaster;
	}

	@Override
	public void buyCoaster() {
		System.out.println("you already hava a coaster");

	}

	@Override
	public void breakCoaster() {
		System.out.println("Breaking coaster");
		coaster.setState(coaster.getBreakState());

	}

	@Override
	public void dryCoaster() {
		System.out.println("Coaster is dry");

	}

	@Override
	public void serveCoaster() {
		System.out.println("Serving with Coaster");
		coaster.setState(coaster.getServeState());

	}

	@Override
	public void washCoaster() {
		System.out.println("Wash Coaster");
		coaster.setState(coaster.getWashState());

	}


}

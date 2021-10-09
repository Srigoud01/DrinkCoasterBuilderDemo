package builder;

public class DrinkCoasterBuilderDemo {

	public static void main(String[] args) {
		CoasterManager coasterManager = new CoasterManager();
		System.out.println(coasterManager);

		coasterManager.washCoaster();
		coasterManager.dryCoaster();
		coasterManager.serveCoaster();
		coasterManager.breakCoaster();

		System.out.println(coasterManager);

		coasterManager.breakCoaster();


	}

}

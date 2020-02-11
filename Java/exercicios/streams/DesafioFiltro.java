package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFiltro {

	public static void main(String[] args) {
		
		/*
		 * 2 expressões lambdas pra fazer dois filtros diferentes.
		 * 
		 */
		
		Spaceship alpha1 = new Spaceship("Alpha I");
		Spaceship alpha2 = new Spaceship("Alpha II");
		Spaceship alpha3 = new Spaceship("Alpha III");
		
		List<Spaceship> alphaSquad = Arrays.asList(alpha1, alpha2, alpha3);
		
		Predicate<Spaceship> checkThrusters = p -> p.thrustersActivated;
		Predicate<Spaceship> checkPropulsion = p -> p.propulsionActivated;
		Predicate<Spaceship> checkNavSystem = p -> p.navSystemActivated;
		Predicate<Spaceship> checkPower = p -> p.powerActivated;
		Predicate<Spaceship> checkComms = p -> p.commsActivated;
		Predicate<Spaceship> checkLifeSupport = p -> p.lifeSupportActivated;
		Function<Spaceship, String> nameShip = 
				ship -> ship.name + " cleared for flight.";
		
		
		alpha1.activateAllSystems();
		alpha2.activateAllSystems();
		alpha3.activateAllSystems();
		
		alphaSquad.stream()
		.filter(checkThrusters)
		.filter(checkPropulsion)
		.filter(checkNavSystem)
		.filter(checkPower)
		.filter(checkComms)
		.filter(checkLifeSupport)
		.map(nameShip)
		.forEach(System.out::println);
	}
}

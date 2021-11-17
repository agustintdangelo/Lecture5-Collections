package task1.runner;

import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import task1.exception.DeadUnitException;
import task1.exception.HealthNegativeException;
import task1.exception.WrongNameException;
import task1.generic.GenericCustomLinkedList;
import task1.robot.C3PO;
import task1.robot.R2D2;
import task1.robot.Robot;
import task1.spaceArmy.Alliance;
import task1.spaceArmy.Empire;
import task1.unit.DemolitionRebel;
import task1.unit.DemolitionTrooper;
import task1.unit.Leader;
import task1.unit.RebelCommando;
import task1.unit.RebelTrooper;
import task1.unit.StormCommando;
import task1.unit.Stormtrooper;
import task1.unit.Unit;

public class Runner {
	private final static Logger LOG = Logger.getLogger(Runner.class.getName());
	private static Map<Integer, String> planets = new TreeMap<>();

	public static void main(String[] args) throws DeadUnitException, HealthNegativeException, WrongNameException {
		planets.put(1, "Tatooine");
		planets.put(2, "Endor");
		planets.put(3, "Hoth");
		planets.put(4, "Corruscant");

		
		Unit soldierE1 = new Stormtrooper(1);
		Unit soldierE2 = new StormCommando(2);
		Unit soldierE3 = new DemolitionTrooper(3);
//		List<Unit> unitsE = new ArrayList<>();
		GenericCustomLinkedList<Unit> unitsE = new GenericCustomLinkedList<Unit>();
		unitsE.insert(soldierE1);
		unitsE.insert(soldierE2);
		unitsE.insert(soldierE3);

		Leader darthVader = new Leader("Darth Vader", 400, 0, "Empire");

		Empire empire = new Empire(darthVader, unitsE, planets.get(1));

		Unit soldierR1 = new RebelTrooper(1);
		Unit soldierR2 = new RebelCommando(2);
		Unit soldierR3 = new DemolitionRebel(3);
		GenericCustomLinkedList<Unit> unitsR = new GenericCustomLinkedList<Unit>();
		Leader lukeSkywalker = new Leader("Luke Skywalker", 600, 0, "Alliance");

		unitsR.insert(soldierR1);
		unitsR.insert(soldierR2);
		unitsR.insert(soldierR3);

		Alliance alliance = new Alliance(lukeSkywalker, unitsR, planets.get(1));

		System.out.println(empire);
		System.out.println(alliance);

		LOG.log(Level.INFO,
				"      ________________.  ___     .______\r\n" + "     /                | /   \\    |   _  \\\r\n"
						+ "    |   (-----|  |----`/  ^  \\   |  |_)  |\r\n"
						+ "     \\   \\    |  |    /  /_\\  \\  |      /\r\n"
						+ ".-----)   |   |  |   /  _____  \\ |  |\\  \\-------.\r\n"
						+ "|________/    |__|  /__/     \\__\\| _| `.________|\r\n"
						+ " ____    __    ____  ___     .______    ________.\r\n"
						+ " \\   \\  /  \\  /   / /   \\    |   _  \\  /        |\r\n"
						+ "  \\   \\/    \\/   / /  ^  \\   |  |_)  ||   (-----`\r\n"
						+ "   \\            / /  /_\\  \\  |      /  \\   \\\r\n"
						+ "    \\    /\\    / /  _____  \\ |  |\\  \\---)   |\r\n"
						+ "     \\__/  \\__/ /__/     \\__\\|__| `._______/");

//		alliance.attackEnemyUnitsWithUnits(empire);
//		empire.travelToAnotherPlanet("Death Star");
//		alliance.allUnitsRun();
//		Unit soldierE4 = new Stormtrooper(4);
//		empire.addUnit(soldierE4);
//
//		lukeSkywalker.attack(soldierE3);
//		lukeSkywalker.forceAttack(darthVader);
//	
//		System.out.println(lukeSkywalker.equals(darthVader));//use of equals		
//		System.out.println(lukeSkywalker.hashCode());//use of hashcode
//		
//		soldierE1.staminaRecover(-5);
//		soldierE3.healthRecover(5);
//		soldierE3.healthRecover(-5);
//		Leader EmperorPalpatine = new Leader("", 400, 0, "Empire");

		System.out.println("---------MAP---------");
		empire.addVehicle("AT-AT", 4);
		empire.addVehicle("Tie Fighter", 20);
		empire.printVehicles();

		alliance.addVehicle("Millenium Falcon", 1);
		alliance.addVehicle("X-Wing Fighter", 25);
		alliance.printVehicles();

		System.out.println("Planets: " + planets.toString());

		System.out.println("---------SET---------");
		Robot c3po = new C3PO();
		Robot r2d2 = new R2D2();
		alliance.addRobot(r2d2);
		alliance.addRobot(c3po);
		alliance.printRobots();

		System.out.println("---------CUSTOM LINKED LIST---------");
		empire.printUnits();
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("----------- THE FOLLOWING METHODS WERE ADAPTED TO THE CUSTOM LINKED LIST.------------");
		System.out.println("-------------------------------------------------------------------------------------");
		empire.attackEnemyUnitsWithUnits(alliance);
		empire.allUnitsRun();
	}
}

package task1.spaceArmy;

import task1.unit.Unit;

public interface ISpaceSoldiers {
	public void attackEnemyLeaderWithUnits(SpaceArmy enemySpaceArmy);

	public void attackEnemyUnitsWithUnits(SpaceArmy enemySpaceArmy);

	public void travelToAnotherPlanet(String planet);

	public void allUnitsRun();

	public void addUnit(Unit unitToAdd);
}

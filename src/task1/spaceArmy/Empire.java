package task1.spaceArmy;


import task1.generic.GenericCustomLinkedList;
import task1.unit.Leader;
import task1.unit.Unit;

public class Empire extends SpaceArmy {

	public Empire(Leader leader, GenericCustomLinkedList<Unit> unitsE, String location) {
		super("Empire", leader, unitsE, location);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Empire [Villain=" + leader + ", unit=" + units + ", location=" + getLocation() + "]";
	}

}

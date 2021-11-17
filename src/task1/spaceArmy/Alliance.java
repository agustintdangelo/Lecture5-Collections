package task1.spaceArmy;


import task1.generic.GenericCustomLinkedList;
import task1.unit.Leader;
import task1.unit.Unit;

public class Alliance extends SpaceArmy {

	public Alliance(Leader leader, GenericCustomLinkedList<Unit> units, String location) {
		super("Alliance", leader, units, location);
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
		return "Alliance [leader=" + leader + ", units=" + units + ", location=" + getLocation() + "]";
	}

}

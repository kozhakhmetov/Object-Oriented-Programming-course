public class Manager extends Employee {
    public Employee[] team;
    public int bonus;

    public Manager(String _name, double _salary, int _year, String _insuranceNumber, Employee[] _team, int _bonus) {
        super(_name, _salary, _year, _insuranceNumber);
        team = _team;
        bonus = _bonus;
    }

    @Override
    public String toString() {
        return super.toString() + " " + Integer.toString(bonus) + "team size: " + team.length;
    }
    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (!(other instanceof Manager))return false;
        Manager otherManager = (Manager)other;
        if (!super.equals(otherManager)) return false;
        if (bonus != otherManager.bonus) return false;
        if (!team.equals(otherManager.team)) return false;
        return true;
    }

}

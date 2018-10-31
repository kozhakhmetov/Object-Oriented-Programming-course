public class Person {
    public String name;

    public Person(String _name) {
        name = _name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) return false;
        if (other == this) return true;
        if (!(other instanceof Person))return false;
        Person otherPerson = (Person)other;
        return otherPerson.name.equals(name);
    }

}

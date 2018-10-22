public class Student {

    private String name;
    private int id;
    int year_of_study;

    Student(String _name, int _id) {
        name = _name;
        id = _id;
        year_of_study = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String newname) {
        name = newname;
    }

    public void incrementYearOfStudy() {
        year_of_study++;
    }

    public int getId() {
        return id;
    }

    public void setId(int newid) {
        id = newid;
    }
}

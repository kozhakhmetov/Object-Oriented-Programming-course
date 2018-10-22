public class Animal {
    public int age, weight, height, length, jrat;
    public String name;

    public Animal(int _age, int _weight, int _height, int _length, String _name, int _jrat) {
        age = _age;
        weight = _weight;
        height = _height;
        length = _length;
        name = _name;
        jrat = _jrat;
    }

    public int getArea() {
        return height * weight;
    }

    public void getJrat(int _jrat) {
        jrat += _jrat;
    }

    public void getJrat(int x, int y, int z) {
        jrat += x * y * z;
    }
}

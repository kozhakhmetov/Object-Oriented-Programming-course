public class Cat extends Animal {
    public int number_of_lifes;

    public Cat(int _age, int _weight, int _height, int _length, String _name, int _jrat, int _number_of_lifes) {
        super(_age, _weight, _height, _length, _name, _jrat);
        number_of_lifes = _number_of_lifes;
    }

    @Override
    public int getArea() {
        return height * weight * number_of_lifes;
    }

    public void getJrat(int number, int _jrat) {
      jrat += _jrat * number;
    }
}

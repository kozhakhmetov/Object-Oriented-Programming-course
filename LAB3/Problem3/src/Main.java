public class Main {

    public static void main(String[] args) {
        Employee one = new Employee("asd", 123.3, 2003, "1234");
        Employee two = new Employee("asd", 123.3, 2003, "1234");
        Employee three = new Employee("Fucl", 123.4, 2003, "123");
        Manager mone = new Manager("asd", 123.3, 2003, "123", new Employee[]{one, two}, 123);
        Manager mtwo = new Manager("asd", 123.3, 2003, "123", new Employee[]{one, two}, 123);
        Manager mthree = new Manager("asd", 123.3, 2003, "123", new Employee[]{one, three, one}, 123);
        Manager mfour = new Manager("asd", 123.3, 2003, "123", new Employee[]{one, three}, 123);

        System.out.print(mone.equals(mfour));


    }
}

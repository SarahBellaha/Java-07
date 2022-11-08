public class Hangar {
    public static void main(String[] args) {
        Car clio = new Car ("Clio", 10250);
        Boat titanic = new Boat ("Titanic", 12325);
        System.out.println(clio.doStuff());
        System.out.println(titanic.doStuff());
    }
}

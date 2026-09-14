public class HorseRidingStrategy implements MovementStrategy {
    @Override
    public void move(Point from, Point to) {
        System.out.println("Герой едет на лошади из " + from + " в " + to + ".");
    }
}

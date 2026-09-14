public class WalkingStrategy implements MovementStrategy {
    @Override
    public void move(Point from, Point to) {
        System.out.println("Герой идёт пешком из " + from + " в " + to + ".");
    }
}

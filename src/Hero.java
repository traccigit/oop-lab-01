public class Hero {
    private Point position;
    private MovementStrategy movementStrategy;

    public Hero(Point startPosition, MovementStrategy movementStrategy) {
        this.position = startPosition;
        setMovementStrategy(movementStrategy);
    }

    public void setMovementStrategy(MovementStrategy movementStrategy) {
        if (movementStrategy == null) {
            throw new IllegalArgumentException("Способ перемещения не может быть null");
        }
        this.movementStrategy = movementStrategy;
    }

    public void move(Point destination) {
        if (destination == null) {
            throw new IllegalArgumentException("Точка назначения не может быть null");
        }

        movementStrategy.move(position, destination);
        position = destination;
    }

    public Point getPosition() {
        return position;
    }
}

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero(new Point(0, 0), new WalkingStrategy());

        hero.move(new Point(2, 3));

        hero.setMovementStrategy(new HorseRidingStrategy());
        hero.move(new Point(8, 5));

        hero.setMovementStrategy(new FlyingStrategy());
        hero.move(new Point(20, 10));

        System.out.println("Итоговая позиция героя: " + hero.getPosition());
    }
}

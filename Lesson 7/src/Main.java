public class Main {

    public static void main(String[] args) {
        Light carLight = new Light(400, 120, 3, "Scoda",
                4, 10, "3", 5);
        carLight.description();
        carLight.movingInfo();

        Freight carFreight = new Freight(600, 100, 10, "Toyota", 6, 30, 3);
        carFreight.description();
        carFreight.checkLoadCapacity();

        Civilian planeCivilian1 = new Civilian(1000, 700, 6, "Br", 8, 700,
                20, false);
        planeCivilian1.description();
        planeCivilian1.checkPassengers();
        Civilian planeCivilian2 = new Civilian(1000, 700, 6, "Br", 8, 700,
                25, true);
        planeCivilian2.description();

        Military planeMilitary1 = new Military(1300, 1000, 9, "Military",
                10, 500, true, 0);
        planeMilitary1.description();
        planeMilitary1.openFire();
        planeMilitary1.catapult();

        Military planeMilitary2 = new Military(1300, 1000, 9, "Military",
                10, 500, false, 10);
        planeMilitary2.description();
        planeMilitary2.openFire();
        planeMilitary2.catapult();
    }

}

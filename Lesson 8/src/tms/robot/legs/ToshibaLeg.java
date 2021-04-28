package tms.robot.legs;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Toshiba делает шаг");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

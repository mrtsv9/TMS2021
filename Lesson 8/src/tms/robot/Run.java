package tms.robot;

import tms.robot.hands.SamsungHand;
import tms.robot.hands.SonyHand;
import tms.robot.hands.ToshibaHand;
import tms.robot.heads.SamsungHead;
import tms.robot.heads.SonyHead;
import tms.robot.heads.ToshibaHead;
import tms.robot.legs.SamsungLeg;
import tms.robot.legs.SonyLeg;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        {
            SamsungHead samsungHead = new SamsungHead(1000);
            ToshibaHand toshibaHand = new ToshibaHand(600);
            SonyLeg sonyLeg = new SonyLeg(300);
            Robot sonyRobot = new Robot(samsungHead, toshibaHand, sonyLeg);
            sonyRobot.action();
            System.out.println(sonyRobot.getPrice());
        }

        System.out.println("\n\n");

        {
            SonyHead sonyHead = new SonyHead(2000);
            SamsungHand samsungHead = new SamsungHand(900);
            SonyLeg sonyLeg = new SonyLeg(300);
            Robot sonyRobot = new Robot(sonyHead, samsungHead, sonyLeg);
            sonyRobot.action();
            System.out.println(sonyRobot.getPrice());
        }

        System.out.println("\n\n");

        {
            ToshibaHead toshibaHead = new ToshibaHead(800);
            SonyHand sonyHand = new SonyHand(800);
            SamsungLeg samsungLeg = new SamsungLeg(1000);
            Robot sonyRobot = new Robot(toshibaHead, sonyHand, samsungLeg);
            sonyRobot.action();
            System.out.println(sonyRobot.getPrice());
        }
    }
}

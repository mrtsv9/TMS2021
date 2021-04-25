package com.home.model;

import lombok.Data;

import java.util.Random;
import java.util.Scanner;

@Data
public class Computer {
    public String proc = "default";
    public String ram = "default";
    public String hdd = "default";
    public int maxCycles = 1;
    private int maxCyclesCounter = 0;
    private boolean isBurned = false;
    private boolean isTurnOn = false;

    public Computer() {

    }

    public Computer(String proc, String ram, String hhd, int maxCycles) {
        this.proc = proc;
        this.ram = ram;
        this.hdd = hdd;
        this.maxCycles = maxCycles;
    }

    private void info() {
        System.out.printf("Processor - %s%nRAM - %s%nHHD - %s%nMaximum of turning on cycles - %d%nCurrent number of cycles - %d%n",
                proc, ram, hdd, maxCycles, maxCyclesCounter);
    }

    public void print () {
        System.out.println("-------------------------------------------------------");
    }

    public void TurnOn () {
        isTurnOn = true;
        if (!isBurned) {
            Random random = new Random();
            int rand = random.nextInt(2);
            System.out.println(rand);
            System.out.print("Attention! Enter 0 or 1: ");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if (rand == input) {
                TurnOff();
            } else {
                System.out.println("Computer just burned down...");
                isBurned = true;
            }
        }
        else {
            System.out.println("Computer is burned!");
        }
    }

    public void TurnOff () {
        if (!isTurnOn) {
            System.out.println("Computer is not turned on");
            return;
        }
            maxCyclesCounter++;
            if (maxCyclesCounter >= maxCycles) {
                isBurned = true;
            }
            isTurnOn = false;
    }

    public void whatToDo() {
        int input = 8;
        do {
            System.out.println("What do you like to do? \n1 - Turn on computer \n2 - Turn off computer" +
                    "\n3 - change processor \n4 - change RAM \n5 - change HDD \n6 - repair computer " +
                    "(to fix if it is burned and set reduce current cycles by 2 times" +
                    "\n7 - show info" +
                    "\n8 - just stop it");
            Scanner scannerInt = new Scanner(System.in);
            Scanner scannerStr = new Scanner(System.in);
            input = scannerInt.nextInt();
            switch (input) {
                case 1:
                    print();
                    TurnOn();
                    print();
                    break;
                case 2:
                    print();
                    TurnOff();
                    print();
                    break;
                case 3:
                    if (isBurned) {
                        System.out.println("Computer is burned!");
                        break;
                    }
                    print();
                    System.out.print("Enter the new processor: ");
                    this.proc = scannerStr.nextLine();
                    print();
                    break;
                case 4:
                    if (isBurned) {
                        System.out.println("Computer is burned!");
                        break;
                    }
                    print();
                    System.out.print("Enter the new RAM: ");
                    this.ram = scannerStr.nextLine();
                    print();
                    break;
                case 5:
                    if (isBurned) {
                        System.out.println("Computer is burned!");
                        break;
                    }
                    print();
                    System.out.print("Enter the new HDD: ");
                    this.hdd = scannerStr.nextLine();
                    print();
                    break;
                case 6:
                    print();
                    maxCyclesCounter /= 2;
                    isBurned = false;
                    for (int i = 0; i < 10; i++) {
                        System.out.println("repairing computer...");
                    }
                    System.out.println("Finally repaired!!");
                    print();
                    break;
                case 7:
                    if (isBurned) {
                        System.out.println("Computer is burned!");
                    }
                    print();
                    info();
                    print();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Enter value from 1 to 8!");
            }
        } while(input != 8);
    }

}

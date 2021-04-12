package com.home.service;
import com.home.model.Computer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("AMD", "8 GB", "1 TB", 3);
        computer.whatToDo();
    }
}

package isp.lab10.raceapp;

import jdk.jshell.spi.ExecutionControl;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("CarRace");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SemaphorePanel semaphorePanel = new SemaphorePanel();
        CarPanel carPanel = new CarPanel();

//        frame.getContentPane().add(semaphorePanel);
//        frame.getContentPane().add(carPanel);

        frame.getContentPane().setLayout(new GridLayout(1, 2));
        frame.getContentPane().add(semaphorePanel);
        frame.getContentPane().add(carPanel);

        frame.pack();
        frame.setVisible(true);

        frame.pack();
        frame.setVisible(true);

        SemaphoreThread semaphoreThread = new SemaphoreThread(semaphorePanel);

//        JFrame frame = new JFrame("Car Race");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 300);

        Car car1 = new Car("Red car", carPanel);
        Car car2 = new Car("Blue car", carPanel);
        Car car3 = new Car("Green car", carPanel);
        Car car4 = new Car("Yellow car", carPanel);

        Car[] carPool = {car1, car2, car3, car4};

        PlaySound sound = new PlaySound();

        Thread raceTimer = new Thread(new Runnable() {
            private long millis = 0;

            @Override
            public void run() {
                try {
                    while (true) {
                        Thread.sleep(10);
                        millis += 10;
                    }
                } catch (InterruptedException e) {
                    System.out.println("Race time is: " + millis + "ms");
                   // throw new RuntimeException(e);
                }
            }
        });

        semaphoreThread.start();

        try {
            semaphoreThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        raceTimer.start();
        sound.playSound();

        try {
            for (var car : carPool) {
                car.start();
            }
            for (var car : carPool) {
                car.join();
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            sound.stopSound();
            raceTimer.interrupt();
        }

    }
}
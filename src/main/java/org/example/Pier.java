package org.example;

import java.util.Random;

public class Pier {
    private int averagePassengerArrivalTime;
    private int averageBoatArrivalTime;
    private boolean isFinalStop;
    private int maxPeopleOnPier;

    public Pier(int averagePassengerArrivalTime, int averageBoatArrivalTime, boolean isFinalStop, int maxPeopleOnPier) {
        this.averagePassengerArrivalTime = averagePassengerArrivalTime;
        this.averageBoatArrivalTime = averageBoatArrivalTime;
        this.isFinalStop = isFinalStop;
        this.maxPeopleOnPier = maxPeopleOnPier;
    }

    public void simulate() {
        Random random = new Random();
        int totalPeople = 0;
        int totalBoats = 0;
        int currentTime = 0;

        while (currentTime < 24 * 60) {
            if (random.nextInt(averagePassengerArrivalTime) == 0) {
                totalPeople++;
            }

            if (random.nextInt(averageBoatArrivalTime) == 0) {
                totalBoats++;
                int freeSeats = random.nextInt(50);
                int peopleBoarding = Math.min(totalPeople, freeSeats);
                totalPeople -= peopleBoarding;
            }

            currentTime++;
        }
        if (totalPeople != 0) {
            System.out.println("Середній час, що людина проводить на пристані: " + (24.0 * 60 / Math.round(totalPeople)) + " хвилин");
        } else {
            System.out.println("Середній час, що людина проводить на пристані: Неможливо обчислити");
        }

        if (totalBoats != 0) {
            System.out.println("Достатній інтервал між човнами: " + (24.0 * 60 / Math.round(totalBoats)) + " хвилин");
        } else {
            System.out.println("Достатній інтервал між човнами: Неможливо обчислити");
        }

    }
}

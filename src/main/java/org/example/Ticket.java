package org.example;

public class Ticket {
    private String typeTicket;

    private String infoTicket;

    private int numbersTicket;

    public Ticket(String typeTicket, String infoTicket, int numbersTicket) {
        this.typeTicket = typeTicket;
        this.infoTicket = infoTicket;
        this.numbersTicket = numbersTicket;
    }

    public String getTypeTicket() {
        return typeTicket;
    }

    public void setTypeTicket(String typeTicket) {
        this.typeTicket = typeTicket;
    }

    public String getInfoTicket() {
        return infoTicket;
    }

    public void setInfoTicket(String infoTicket) {
        this.infoTicket = infoTicket;
    }

    public int getNumbersTicket() {
        return numbersTicket;
    }

    public void setNumbersTicket(int numbersTicket) {
        this.numbersTicket = numbersTicket;
    }
    public void printInfo() {
        System.out.println("Type of Ticket: " + typeTicket);
        System.out.println("Info Ticket: " + infoTicket);
        System.out.println("Numbers Ticket: " + numbersTicket);
    }


}

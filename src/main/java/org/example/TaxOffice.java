package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TaxOffice {

    List<HumanTicket> humanTicketList = new ArrayList<>();
    public TaxOffice() {

    }

    public void add(String firstname, String lastName, int age, int personalCode, String city , Ticket ticket){
        humanTicketList.add(new HumanTicket(firstname,lastName, age, personalCode, city,ticket));
    }
    public void showAll(){
        for (int i = 0; i < humanTicketList.size(); i++) {
            humanTicketList.get(i).printInfo();
        }
    }
    public void printToCode(int code){
        for (int i = 0; i < humanTicketList.size(); i++) {
            if(humanTicketList.get(i).getPersonalCode()==code){
                humanTicketList.get(i).printInfo();
            }
        }
    }
    public void printToTypeTicket(String ticket){
        for (HumanTicket humanTicket : humanTicketList) {
            humanTicket.printTypeTicket(ticket);
        }
    }
    public void printToTypeCity(String city){
        for (HumanTicket humanTicket : humanTicketList) {
            if (Objects.equals(humanTicket.getCity(), city)) {
                humanTicket.printInfo();
            }
        }
    }
    public void addTikcet(int humanCode, Ticket ticket){
        for (HumanTicket humanTicket : humanTicketList) {
            if (humanTicket.getPersonalCode() == humanCode) {
                humanTicket.addNewTicket(ticket);
            }
        }
    }
    public void deleteTicket(int humanNumber,int numberTicket){
        for (HumanTicket humanTicket : humanTicketList) {
            if (humanTicket.getPersonalCode() == humanNumber) {
                humanTicket.deleteTicket(numberTicket);
            }
        }
    }
    public void updateHumanTicket(int humanCode, String firstname, String lastName, int age, String city) {
        for (HumanTicket humanTicket : humanTicketList) {
            if (humanTicket.getPersonalCode() == humanCode) {
                humanTicket.setFirstname(firstname);
                humanTicket.setLastName(lastName);
                humanTicket.setAge(age);
                humanTicket.setCity(city);
            }
        }
    }

    public void updateTicket(int humanCode, int ticketNumber, String typeTicket, String infoTicket) {
        for (HumanTicket humanTicket : humanTicketList) {
            if (humanTicket.getPersonalCode() == humanCode) {
                for (Ticket ticket : humanTicket.tickets) {
                    if (ticket.getNumbersTicket() == ticketNumber) {
                        ticket.setTypeTicket(typeTicket);
                        ticket.setInfoTicket(infoTicket);
                    }
                }
            }
        }
    }


}

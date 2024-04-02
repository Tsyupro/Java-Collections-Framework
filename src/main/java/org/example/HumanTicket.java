package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HumanTicket {
    private String Firstname;
    private String lastName ;
    private int age;
    private int personalCode;

    private String city;

   List<Ticket> tickets = new ArrayList<>();

    public HumanTicket(String firstname, String lastName, int age, int personalCode, String city,Ticket ticket) {
        Firstname = firstname;
        this.lastName = lastName;
        this.age = age;
        this.personalCode = personalCode;
        this.city = city;
        tickets.add(ticket);
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(int personalCode) {
        this.personalCode = personalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void printInfo() {
        System.out.println("Firstname: " + Firstname);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Personal Code: " + personalCode);
        System.out.println("City: " + city);
        for (int i = 0; i < tickets.size(); i++) {
            tickets.get(i).printInfo();
        }
    }
    public void addNewTicket(Ticket ticket){
        tickets.add(ticket);
    }
    public void deleteTicket(int numberTicket){
        for (int i = 0; i < tickets.size(); i++) {
            if(tickets.get(i).getNumbersTicket() == numberTicket){
                tickets.remove(i);
            }

        }
    }
    public void printTypeTicket(String typeTicket){
        for (int i = 0; i < tickets.size(); i++) {
            if(Objects.equals(tickets.get(i).getTypeTicket(),typeTicket)){
                tickets.get(i).printInfo();
            }
        }
    }
}



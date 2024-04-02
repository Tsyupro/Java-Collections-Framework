package org.example;

public class Main {
    public static void main(String[] args) {

        // Task 1

        Pier pier = new Pier(10, 20, false, 50);

        pier.simulate();

        // Task 2

// Створюємо новий об'єкт Translate
        Translate translate = new Translate("Привіт", "Hello");

        // Додаємо новий переклад
        translate.addTranslate("Дякую", "Thank you");

        // Відображаємо слово і його переклад
        System.out.println("Word and its translation:");
        translate.showWord("Привіт");

        // Додаємо новий переклад для існуючого слова
        translate.addTranslate("Привіт", "Hi");

        // Замінюємо переклад слова
        translate.readTranslate("Hello", "Hola");

        // Замінюємо слово
        translate.readWord("Привіт", "Вітаю");

        // Відображаємо топ-10 найпопулярніших слів
        System.out.println("Top 10 most popular words:");
        translate.showUpPopular();

        // Відображаємо топ-10 найменш популярних слів
        System.out.println("Top 10 least popular words:");
        translate.showLowPopular();

        // Видаляємо слово
        translate.deleteWord("Вітаю");

        // Видаляємо переклад
        translate.deleteTranslate("Hola");


        // Task 3

        // Створюємо новий об'єкт TaxOffice
        TaxOffice taxOffice = new TaxOffice();

        // Додаємо нову людину з штрафом
        Ticket ticket1 = new Ticket("Speeding", "Over 60 km/h in a 50 km/h zone", 1);
        taxOffice.add("John", "Doe", 30, 12345, "Kyiv", ticket1);

        // Додаємо новий штраф для існуючої людини
        Ticket ticket2 = new Ticket("Parking", "Parked in a no-parking zone", 2);
        taxOffice.addTikcet(12345, ticket2);

        // Повний друк бази даних
        System.out.println("All data:");
        taxOffice.showAll();

        // Роздрукування даних по конкретному коду
        System.out.println("Data for code 12345:");
        taxOffice.printToCode(12345);

        // Роздрукування даних по конкретному типу штрафу
        System.out.println("Data for type 'Speeding':");
        taxOffice.printToTypeTicket("Speeding");

        // Роздрукування даних по конкретному місту
        System.out.println("Data for city 'Kyiv':");
        taxOffice.printToTypeCity("Kyiv");

        // Видалення штрафу
        taxOffice.deleteTicket(12345, 1);
        System.out.println("Data after deleting ticket 1:");
        taxOffice.showAll();

        // Заміна інформації про людину і її штрафи
        taxOffice.updateHumanTicket(12345, "Jane", "Doe", 25, "Lviv");
        Ticket ticket3 = new Ticket("Littering", "Threw trash on the street", 3);
        taxOffice.updateTicket(12345, 2, ticket3.getTypeTicket(), ticket3.getInfoTicket());
        System.out.println("Data after updating human and ticket info:");
        taxOffice.showAll();

    }
}
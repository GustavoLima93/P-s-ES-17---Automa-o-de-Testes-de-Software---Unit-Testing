package utils;

import model.MoneyType;
import model.Ticket;

import java.util.ArrayList;
import java.util.List;

public class Constants {
    public static ArrayList<Ticket> tickets = null;

    public static void ValueTests() {
        tickets = new ArrayList<Ticket>();
        tickets.add(new Ticket(1, "Ticket Magic Kingdom", "Melhor viagem do ano", 50.0, MoneyType.DOLAR, "Orlando - Florida"));
        tickets.add(new Ticket(2, "Ticket Magic Kingdom", "Melhor viagem do ano", 50.0, MoneyType.EURO, "Orlando - Florida"));
        tickets.add(new Ticket(3, "Ticket Magic Kingdom", "Melhor viagem do ano", 50.0, MoneyType.REAIS, "Orlando - Florida"));
    }
}

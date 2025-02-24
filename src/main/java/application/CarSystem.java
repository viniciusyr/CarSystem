package application;

import entities.Customer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CarSystem {
    public static void main(String[] args) {
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Customer c1 = new Customer.CustomerBuilder()
                .firstNameBuilder("Vinicius")
                .lastNameBuilder("Rodrigues")
                .birthDateBuilder(LocalDate.of(1996,03,25))
                .cnhBuilder(54132196)
                .contactBuilder("19996645060")
                .emailBuilder("vinicius@gmail.com")
                .addressBuilder("Rua Pastor José Marques de Almeida, 173, Parque das Laranjeiras, Mogi Mirim, São Paulo")
                .build();

        System.out.println(c1);

    }
}

package com.zanah.payroll;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class LoadDatabase implements CommandLineRunner {
    private final ClientRepository clientRepository;
    private final Faker faker = new Faker(Locale.getDefault());

    public LoadDatabase(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 20; i++) {
            // Assuming Client is a JPA entity, you need to create an instance
            Client client = new Client();

            // Set properties of the client using Faker or any other method
            client.setName(faker.name().fullName());
            client.setEmail(faker.internet().emailAddress());

            // Save the client in the repository
            clientRepository.save(client);
        }
    }
}

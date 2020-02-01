package com.rsjavasol.bazajedendowielu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class OrderData implements CommandLineRunner {

    @Autowired
    private  ClientRepository clientRepository;

    @Override
    public void run(String... args) throws Exception {
        Client client = new Client();
        client.setFirstName("Adam");
        client.setLastName("Kowaliski");

        Order order = new Order();
        order.setPrice(5000.77);
        order.setProductName("Telewizor");

        client.addOrder(order);

        Order order2 = new Order();
        order2.setPrice(2000.53);
        order2.setProductName("Pralka");

        client.addOrder(order2);

        clientRepository.save(client);
    }
}

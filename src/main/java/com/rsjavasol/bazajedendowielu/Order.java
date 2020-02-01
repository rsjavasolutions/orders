package com.rsjavasol.bazajedendowielu;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table (name = "client_order")
public class Order {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    //@JoinColumn (name = "client_id")
    //robi to co:
    //@Column (name = "client_id")
    //Ale dodatkowo robi zabezpiecznie w bazie danych (constraint w bazie);
    // które sprawdza czy prawidłowy został numer klient

    @ManyToOne
   @JoinColumn (name = "client_id")
    private Client client;

    //1 zamówienie do danego klienta,
    //ale klient może mieć wiele zamówień

    private String productName;

    private Double price;



}

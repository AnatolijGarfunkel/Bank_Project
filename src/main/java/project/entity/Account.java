package project.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import project.enums.Bank;
import project.enums.Currency;

@Entity
@Table(name = "bank_accounts")
@NoArgsConstructor
@Data
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private Bank institute;

    private String number;

    private double amount;

    @Enumerated(EnumType.STRING)
    private Currency currency;

    private long user_id;
}

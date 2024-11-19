package project.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Bank {

    Lombard_Odier("Swiss"),
    HSBC("England"),
    La_Banque_Postale("France"),;

    private String description;
}

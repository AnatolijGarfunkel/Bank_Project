package project.enums;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum Currency {

    DOLLAR("USA"),
    EURO("Europe"),
    POUND_STERLING("United Kingdom"),
    SWISS_FRANC("Swiss"),
    YEN("Japan"),
    YUAN("China"),
    RUBLES("Russia");

    private String description;
}

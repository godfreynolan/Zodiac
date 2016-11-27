package com.riis.zodiac;

public class Zodiac {
    private String name;
    private String description;
    private String symbol;
    private String month;

    public static final Zodiac[] signs = {
            new Zodiac("Aries","Enterprising, Incisive, Spontaneous, Daring, Active, Courageous and Energetic, the Aries are the proverbial infants, guileless and optimistic to the fault.", "Ram", "April")
    };


    private Zodiac(String name, String description, String symbol, String month) {
        this.name = name;
        this.description = description;
        this.symbol = symbol;
        this.month = month;
    }

    public String getName() { return name; }

    public String getDescription() { return description;  }

    public String getSymbol() { return symbol; }

    public String getMonth() { return month; }

    public String toString() { return this.name; }
}
package utils;

public enum GameRace {
    ELF() { public String getRaceName() { return "Elf"; }},
    MOUNTAINDWARF() { public String getRaceName() { return "Mountain Dwarf"; }},
    HUMAN() { public String getRaceName() { return "Human"; }},
    HIGHELF() { public String getRaceName() { return "High Elf"; }};

    public abstract String getRaceName();
}


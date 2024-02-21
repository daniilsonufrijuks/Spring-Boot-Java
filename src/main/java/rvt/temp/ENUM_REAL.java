package rvt.temp;

public enum ENUM_REAL {
    ADD("THIS COMMAND ADDS STUDENT"),
    REMOVE("THIS COMMAND REMOVES STUDENT"),
    SHOW("THIS COMMAND SHOWS STUDENT");

    private String description;

    private ENUM_REAL(String description) { 
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}

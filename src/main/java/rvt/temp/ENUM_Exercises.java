package rvt.temp;

public class ENUM_Exercises {
    public static void runCommand(ENUM_REAL command) {
        if (command == ENUM_REAL.ADD) {
            System.out.println("Add");
        }

        if (command == ENUM_REAL.REMOVE) {
            System.out.println("Remve");
        }
    }

    public static void main(String[] args) {
        runCommand(ENUM_REAL.ADD);
    }
}

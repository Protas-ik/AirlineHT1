package domain.plane.passanger;

public enum TypeOfPassengerPlane{
    UNDEFINED,//не определено
    PREMIUM,//премиум
    PRIVATE,//личный
    PUBLIC,//общественный
    ;

    public static String ToString() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < TypeOfPassengerPlane.values().length; i++) {
            result.append(i + ") " + TypeOfPassengerPlane.values()[i] + "\n");
        }
        return result.toString();
    }
}
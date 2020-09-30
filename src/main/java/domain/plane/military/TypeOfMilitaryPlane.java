package domain.plane.military;

public enum TypeOfMilitaryPlane{
    UNDEFINED,//не определено
    BOMBER,//Бомбадировщик
    FIGHTER,//истребитель
    ;

    public static String ToString() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < TypeOfMilitaryPlane.values().length; i++) {
            result.append(i + ") " + TypeOfMilitaryPlane.values()[i] + "\n");
        }
        return result.toString();
    }
}

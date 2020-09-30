package domain.plane.freight;

public enum TypeOfCargo{
    UNDEFINED,//не определено
    CARS,//машины
    MATERIALS,//материалы
    FOOD,//еда
    TOYS,//игрушки
    TECH,//техника
    ;

    public static String ToString() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < TypeOfCargo.values().length; i++) {
            result.append(i + ") " + TypeOfCargo.values()[i] + "\n");
        }
        return result.toString();
    }
}

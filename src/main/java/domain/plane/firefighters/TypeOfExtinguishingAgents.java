package domain.plane.firefighters;

//виды огнетушащих веществ
public enum TypeOfExtinguishingAgents{
    UNDEFINED,//не определено
    WATER, //вода
    FOAM,  //пена
    ;

    public static String ToString() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < TypeOfExtinguishingAgents.values().length; i++) {
            result.append(i + ") " + TypeOfExtinguishingAgents.values()[i] + "\n");
        }
        return result.toString();
    }
}

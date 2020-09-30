package domain.plane.postage;

public enum TypeOfMail{
    UNDEFINED,//не определено
    LETTER,//письмо
    PARSEL,//посылка
    MIXED,//писмо и посылка
    ;

    public static String ToString() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < TypeOfMail.values().length; i++) {
            result.append(i + ") " + TypeOfMail.values()[i] + "\n");
        }
        return result.toString();
    }
}



import datatypes.StringBuilderEnhanced;
import snapshots.StringBuilderSnapshot;

public class Main {
    public static void main(String[] args) {
        //начальная строка
        StringBuilderEnhanced stringBuilderEnhanced = new StringBuilderEnhanced("Привет");
        System.out.println(new StringBuilder("Исходная строка: ").append(stringBuilderEnhanced.getStringBuilder()));

        //делаем снимок строки
        StringBuilderSnapshot snapshot = new StringBuilderSnapshot(stringBuilderEnhanced.getStringBuilder());

        //меняем строку
        stringBuilderEnhanced = new StringBuilderEnhanced("Привет Мир");
        System.out.println(new StringBuilder("Измененная строка: ").append(stringBuilderEnhanced.getStringBuilder()));

        //возврат к исходному состоянию
        stringBuilderEnhanced.undo(snapshot.getState());
        System.out.println(new StringBuilder("Восстановленная строка: ").append(stringBuilderEnhanced.getStringBuilder()));
    }
}
package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Вася Васильев");
        members1.add("Петя Васильев");
        members1.add("Даня Васильев");

        MusicBand band1 = new MusicBand("Колхозники", 1995, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Вася Петров");
        members2.add("Вова Петров");
        members2.add("Миша Петров");

        MusicBand band2 = new MusicBand("Городчане", 2003, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}

package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Вася Васильев", 45));
        members1.add(new MusicArtist("Петя Васильев", 23));
        members1.add(new MusicArtist("Даня Васильев", 48));

        MusicBand band1 = new MusicBand("Колхозники", 1995, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Вася Петров", 35));
        members2.add(new MusicArtist("Вова Петров", 38));
        members2.add(new MusicArtist("Миша Петров", 41));

        MusicBand band2 = new MusicBand("Городчане", 2003, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}

package day12.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand metallica = new MusicBand("Metallica", 1981);
        MusicBand skillet = new MusicBand("Skillet", 1996);
        MusicBand abba = new MusicBand("ABBA", 1972);
        MusicBand prodigy = new MusicBand("Prodigy", 1990);
        MusicBand limpBizkit = new MusicBand("Limp Bizkit", 1994);
        MusicBand oneRepublic = new MusicBand("OneRepublic", 2002);
        MusicBand nickelback = new MusicBand("Nickelback", 1995);
        MusicBand rammstein = new MusicBand("Rammstein", 1994);
        MusicBand pendulum = new MusicBand("Pendulum", 2002);
        MusicBand imagineDragons = new MusicBand("Imagine Dragons", 2008);

        List<MusicBand> groups = new ArrayList<>();

        groups.add(metallica);
        groups.add(skillet);
        groups.add(abba);
        groups.add(prodigy);
        groups.add(limpBizkit);
        groups.add(oneRepublic);
        groups.add(nickelback);
        groups.add(rammstein);
        groups.add(pendulum);
        groups.add(imagineDragons);

        System.out.println(groups);

        Collections.shuffle(groups);

        System.out.println(groupsAfter2000(groups));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> groups){
        List<MusicBand> groups2000 = new ArrayList<>();
        for (MusicBand band: groups) {
            if (band.getYear()>2000){
                groups2000.add(band);
            }
        }
        return groups2000;
    }
}

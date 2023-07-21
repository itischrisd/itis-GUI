package s25692.gui.oop.LABO04;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Osoba kowalski = new Osoba("Jan", "Kowalski");
        Osoba nowak = new Osoba("Adam", "Nowak");
        Osoba krawczyk = new Osoba("Bartosz", "Krawczyk");
        Osoba heniek = new Osoba("Kierownik", "Heniek");

        Samochod skoda1 = new Samochod("WA00001", Samochod.Marka.SKODA);
        Samochod skoda2 = new Samochod("SC36010", Samochod.Marka.SKODA);
        Samochod mazda1 = new Samochod("WA01234", Samochod.Marka.MAZDA);
        Samochod mazda2 = new Samochod("DW01ASD", Samochod.Marka.MAZDA);
        Samochod bmw = new Samochod("WA12690", Samochod.Marka.BMW);
        Samochod volvo = new Samochod("KR60606", Samochod.Marka.VOLVO);

        Map<Osoba, List<Samochod>> mapaSamochodow = new LinkedHashMap<>();

        mapaSamochodow.put(kowalski, new ArrayList<>());
        mapaSamochodow.put(nowak, new ArrayList<>());
        mapaSamochodow.put(krawczyk, new ArrayList<>());
        mapaSamochodow.put(heniek, new ArrayList<>());
        mapaSamochodow.get(kowalski).add(skoda1);
        mapaSamochodow.get(kowalski).add(bmw);
        mapaSamochodow.get(nowak).add(mazda2);
        mapaSamochodow.get(krawczyk).add(volvo);
        mapaSamochodow.get(krawczyk).add(mazda1);
        mapaSamochodow.get(krawczyk).add(skoda2);

        mapaSamochodow.forEach(((osoba, samochody) -> {
            if (samochody.isEmpty())
                System.out.println(osoba + "  -> [Brak samochodów]");
            else
                System.out.println(osoba + "  -> " + samochody.toString().replaceAll("[\\[\\]]", ""));
        }));

        System.out.println("Samochody , których  numery  rejestracyjne  zaczynają się na WA:");
        mapaSamochodow.forEach(((osoba, samochody) -> {
            samochody.forEach(samochod -> {
                if (samochod.toString().contains(" WA"))
                    System.out.println(samochod);
            });
        }));

        for (Map.Entry<Osoba, List<Samochod>> entry : mapaSamochodow.entrySet()) {
            String pojazd;
            if ( entry.getValue().size() == 0 || entry.getValue().size() > 4)
                pojazd = "pojazdów";
            else
                pojazd = "pojazdy";
            System.out.println(entry.getKey() + " posiada " + entry.getValue().size() + " " + pojazd + ".");
        }

        System.out.println(mapaSamochodow.get(nowak).get(0));
    }
}

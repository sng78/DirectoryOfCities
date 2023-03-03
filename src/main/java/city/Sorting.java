package city;

import java.util.Comparator;
import java.util.List;

public class Sorting {
    public static void byName(List<City> citiesList) {
        citiesList.sort(new ComparatorByName());
    }

    public static void byRegionAndName(List<City> citiesList) {
        citiesList.sort(Comparator.comparing(City::getRegion).
                thenComparing(City::getName));
    }
}

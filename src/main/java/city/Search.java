package city;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Search {
    public static int maxPopulationIndexArray(List<City> citiesList) {
        City[] cities = citiesList.toArray(new City[0]);
        int index = 0;
        for (int i = 0; i < cities.length; i++) {
            if (cities[i].getPopulation() > index) {
                index = i;
            }
        }
        return index;
    }

    public static Map<String, Integer> mapRegionCities(List<City> citiesList) {
        Map<String, Integer> map = new HashMap<>();
        for (City city : citiesList) {
            if (!map.containsKey(city.getRegion())) {
                map.put(city.getRegion(), 1);
            } else {
                map.put(city.getRegion(), map.get(city.getRegion()) + 1);
            }
        }
        return map;
    }
}

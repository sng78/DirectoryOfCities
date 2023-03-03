import city.City;
import city.Search;
import city.Sorting;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<City> citiesList = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new FileInputStream("test.csv"));
            while (scanner.hasNextLine()) {
                String string = scanner.nextLine();
                String[] parts = string.split(",");
                City city = new City();
                city.setName(parts[1]);
                city.setRegion(parts[2]);
                city.setDistrict(parts[3]);
                city.setPopulation(Integer.parseInt(parts[4]));
                if (parts.length == 6) {
                    city.setFoundation(parts[5]);
                }
                citiesList.add(city);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден!");
            e.printStackTrace();
        }

        System.out.println("\n" + "-------Список объектов city.City без сортировки-------");
        citiesList.forEach(System.out::println);

        System.out.println("\n" + "-------Сортировка по названию города-------");
        Sorting.byName(citiesList);
        citiesList.forEach(System.out::println);

        System.out.println("\n" + "-------Сортировка по региону и названию города-------");
        Sorting.byRegionAndName(citiesList);
        citiesList.forEach(System.out::println);

        System.out.println("\n" + "-------Поиск номера города с наибольшим количеством жителей-------");
        int index = Search.maxPopulationIndexArray(citiesList);
        System.out.println("[" + (index + 1) + "]" + "=" +
                citiesList.get(index).getPopulation());

        System.out.println("\n" + "-------Поиск количества городов в каждом регионе-------");
        Map<String, Integer> map = Search.mapRegionCities(citiesList);
        map.forEach((key, value) -> System.out.println(key + "=" + value));
    }
}

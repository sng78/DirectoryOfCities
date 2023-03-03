package city;

public class City {
    private String name;
    private String region;
    private String district;
    private int population;
    private String foundation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getFoundation() {
        return foundation;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    @Override
    public String toString() {
        return String
                .format("city.City{name='%s', region='%s', district='%s', population=%d, foundation='%s'}",
                        getName(), getRegion(), getDistrict(), getPopulation(), getFoundation())
                .replace("\"", "");
    }
}

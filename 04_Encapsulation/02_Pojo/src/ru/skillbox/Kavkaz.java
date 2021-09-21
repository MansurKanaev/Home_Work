package ru.skillbox;

public class Kavkaz{
    private String republicName;
    private int areaInSqKm;
    private int population;
    private String capitalName;

    public Kavkaz(String republicName, String capitalName, int areaInSqKm, int population){
        this.republicName = republicName;
        this.capitalName = capitalName;
        this.areaInSqKm = areaInSqKm;
        this.population = population;
    }

    public void setRepublicName(String countryName){
        this.republicName= countryName;
    }
    public String getCountryName(){
        return republicName;
    }
    public void setAreaInSqKm(int areaInSqKm) {
        this.areaInSqKm = areaInSqKm;
    }
    public int getAreaInSqKm() {
        return areaInSqKm;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public int getPopulation() {
        return population;
    }
    public String getCapitalName() {
        return capitalName;
    }
    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }
}

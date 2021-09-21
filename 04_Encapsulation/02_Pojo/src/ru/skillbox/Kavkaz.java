package ru.skillbox;

public class Kavkaz{
    public String republicName;
    public String areaInSqKm;
    public String population;
    public String capitalName;

    public Kavkaz(String republicName, String capitalName, String areaInSqKm, String population){
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
    public void setAreaInSqKm(String areaInSqKm) {
        this.areaInSqKm = areaInSqKm;
    }
    public String getAreaInSqKm() {
        return areaInSqKm;
    }
    public void setPopulation(String population) {
        this.population = population;
    }
    public String getPopulation() {
        return population;
    }
    public String getCapitalName() {
        return capitalName;
    }
    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }
}

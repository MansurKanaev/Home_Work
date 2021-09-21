package ru.skillbox;

public class Country {
    public String countryName;
    public int areaInSqKm;
    public int Population;
    public String capitalName;
    public String seaOutlet;

    public Country(String countryName){
        this.capitalName = countryName;
    }
    public void setCountryName(String countryName){
        this.countryName= countryName;
    }
    public String getCountryName(){
        return countryName;
    }
    public void setAreaInSqKm(int areaInSqKm) {
        this.areaInSqKm = areaInSqKm;
    }
    public int getAreaInSqKm() {
        return areaInSqKm;
    }
    public int getPopulation() {
        return Population;
    }
    public void setPopulation(int population) {
        Population = population;
    }
    public String getCapitalName() {
        return capitalName;
    }
    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }
    public String getSeaOutlet() {
        return seaOutlet;
    }
    public void setSeaOutlet(String seaOutlet) {
        this.seaOutlet = seaOutlet;
    }
}

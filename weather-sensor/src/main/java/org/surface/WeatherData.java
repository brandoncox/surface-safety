package org.surface;


public class WeatherData {

    
    private int tempF;
    private int tempC;
    private int humidity;
    private int wind;

    
    public WeatherData() {
        this.conditions = Conditions.FOG;
        this.wind = generateIntByRange(1, 20);
        this.tempC = generateIntByRange(0, 32);
        this.tempF = generateIntByRange(50, 70);
        this.humidity = generateIntByRange(20, 50);
    }

    public int getWind() {
        return wind;
    }
    public void setWind(int wind) {
        this.wind = wind;
    }
    private Conditions conditions;


    public int getTempF() {
        return tempF;
    }
    public void setTempF(int tempF) {
        this.tempF = tempF;
    }
    public int getTempC() {
        return tempC;
    }
    public void setTempC(int tempC) {
        this.tempC = tempC;
    }
    public int getHumidity() {
        return humidity;
    }
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    public Conditions getConditions() {
        return conditions;
    }
    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }


    private int generateIntByRange(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }
    
}

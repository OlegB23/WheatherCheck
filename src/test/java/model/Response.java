package model;

import java.beans.Visibility;

public class Response {

    private Coord coodr;
    public Coord getCoodr() { return coodr; }
    public void setCoodr(Coord coodr) { this.coodr = coodr; }

    private Weather weather;
    public Weather getWeather() { return weather; }
    public void setWeather(Weather weather) { this.weather = weather; }

    private Main main;
    public Main getMain() { return main; }
    public void setMain(Main main) { this.main = main; }

    private model.Visibility visibility;
    public model.Visibility getVisibility() { return visibility; }
    public void setVisibility(model.Visibility visibility) { this.visibility = visibility; }

    private Wind wind;
    public Wind getWind() { return wind; }
    public void setWind(Wind wind) { this.wind = wind; }

    private Clouds clouds;
    public Clouds getClouds() { return clouds; }
    public void setClouds(Clouds clouds) { this.clouds = clouds; }
}

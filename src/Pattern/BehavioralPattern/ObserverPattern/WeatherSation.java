package Pattern.BehavioralPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;


/***
 * 气象站天气发布发布&提供订阅服务
 */
public class WeatherSation {
    private List<Observer> observers = new ArrayList<Observer>();

    private int temperature;
    private int windSpeed;

    public int getTemperature() {
        return temperature;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWeatherData(int temperature, int windSpeed) {
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        notifyAllObservers();
    }


    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void dettach(Observer observer) {
        if (observers.contains(observer))
            observers.remove(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.action();
        }
    }

    public static void main(String[] args) {
        WeatherSation weatherSation = new WeatherSation();

        FarmerObserver farmerObserver = new FarmerObserver(weatherSation);
        ShopKeeperObserver officerObserver = new ShopKeeperObserver(weatherSation);

        for (int i = 1; i < 5; i++) {
            System.out.println("Today Temp is:" + (5 * i) + "; Wind Speed :" + (i * 2));
            weatherSation.setWeatherData(5 * i, (i * 2));
        }
    }
}
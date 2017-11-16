package Pattern.BehavioralPattern.ObserverPattern;


/***
 * 农民伯伯观察者
 */
public class FarmerObserver extends Observer {

    public FarmerObserver(WeatherSation weatherSation) {
        this.weatherSation = weatherSation;
        this.weatherSation.attach(this);
    }


    public void action() {
        System.out.println("------------FarmerObserver");
        if (this.weatherSation.getWindSpeed() > 8) {
            System.out.println("------------At home");
        } else {
            if (this.weatherSation.getTemperature() > 40) {
                System.out.println("------------At home");
            } else if (this.weatherSation.getTemperature() > 30) {
                System.out.println("------------Sleep at home 10:00-16:00;Work 07:00-10:00   16:00-18:00");
            } else if (this.weatherSation.getTemperature() > 10) {
                System.out.println("------------Work 08:00-18:00");
            } else {
                System.out.println("------------At home");
            }
        }
    }
}
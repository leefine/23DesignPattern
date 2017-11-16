package Pattern.BehavioralPattern.ObserverPattern;


/***
 * 商店店主观察者
 */
public class ShopKeeperObserver extends Observer {

    public ShopKeeperObserver(WeatherSation weatherSation) {
        this.weatherSation = weatherSation;
        this.weatherSation.attach(this);
    }


    public void action() {
        System.out.println("------------ShopKeeperObserver");

        if (this.weatherSation.getWindSpeed() > 8) {
            System.out.println("------------At home");
        } else {
            if (this.weatherSation.getTemperature() >= 25) {
                System.out.println("------------Work 07:00-21:00");
            } else if (this.weatherSation.getTemperature() > 10) {
                System.out.println("------------Work 08:00-19:00");
            } else {
                System.out.println("------------Work 09:00-18:00");
            }
        }
    }
}
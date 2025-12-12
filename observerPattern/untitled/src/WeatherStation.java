import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private int temperature;
    private int humidity;
    private int pressure;

    @Override
    public void add(Observer o) {
        observers.add(o);
        
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }

    @Override
    public void broadcast() {
        for (Observer o : observers) {
            o.update();
        }
        
    }

    public int getTemperature() {
        return temperature;
    }
    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }
    public void setMeasurements(int temperature, int humidity, int pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        System.out.println("measurements set! "+ temperature + "," + humidity + "," + pressure);

        measurementsChanged();
    }
    public void measurementsChanged(){
        broadcast();
    }

}

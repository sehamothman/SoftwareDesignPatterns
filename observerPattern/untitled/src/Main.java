//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        WeatherStation ws = new WeatherStation();
        ws.add(new StatisticsDisplay());
        ws.add(new CurrentConditionsDisplay());
        ws.add(new ForecastDisplay());

        System.out.println("weather station is having an update!");
        ws.setMeasurements(20,90,80);









    }
}
class Sensor {
    private String name;
    private int batteryLevel;

    public Sensor(String name, int batteryLevel) {
        this.name = name;
        this.batteryLevel = batteryLevel;

    }
    public void charge() {
        this.batteryLevel = 100;
        System.out.println("Sensor fully charged");
    }
    public int getBatteryLevel() {
        return this.batteryLevel;
    }
    public String getName() {
        return this.name;
    }
    
}
public class Main4 {
    public static void main(String[] args) {
        Sensor proximitySensor = new Sensor("Proximity sensor", 24);
        System.out.println("Intial battery level for" + proximitySensor.getName() + ":" + proximitySensor.getBatteryLevel() + "%");
        proximitySensor.charge();
        System.out.println("Verified battery level:" + proximitySensor.getBatteryLevel() + "%");
    }

}


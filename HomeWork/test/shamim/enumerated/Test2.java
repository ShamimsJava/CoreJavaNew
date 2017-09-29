package shamim.enumerated;

public class Test2 {
    public enum TrafficSignal{
        STOP("red"),
        CAUTION("yellow"),
        GO("green");
        
        private final String light;

        private TrafficSignal(String light) {
            this.light = light;
        }
        
        public String format(String message){
            return message + " " + light;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(TrafficSignal.GO.format("The light is"));
        System.out.println(TrafficSignal.CAUTION.format("The light is"));
        System.out.println(TrafficSignal.STOP.format("The light is"));
    }
}

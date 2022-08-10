class Vehicles{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheel;

    public Vehicles (String name, int cylinders){
        this.name = name;
        this.cylinders = cylinders;
        this.wheel = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }
    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return "Default engine start ";
    }
    public String accelerate(){
        return "Default acceleration mode";
    }
    public String brake (){
        return "ctach the brake oooooooo!";
    }
}
//class 1
class V9 extends Vehicles{
    public V9(){
        super("V9", 2);
    }

    @Override
    public String startEngine(){
        return "V9 engine start ";
    }
    public String accelerate(){
        return "V9 acceleration mode";
    }
    public String brake (){
        return "V9 your brake good";
    }
}
//class 2
class Hyundai extends Vehicles{
    public Hyundai(){
        super("Hyundai", 3);
    }

    @Override
    public String startEngine(){
        return "Hyundai engine start ";
    }
    public String accelerate(){
        return "Hyundai acceleration mode";
    }
    public String brake (){
        return "Hyundai your brake good";
    }
}
//class 3
class Ferrari extends Vehicles{
    public Ferrari(){
        super("Ferrari", 5);
    }

    @Override
    public String startEngine(){
        return "Ferrari engine start ";
    }
    public String accelerate(){
        return "Ferrari acceleration mode";
    }
    public String brake(){
        return "Ferrari your brake good";
    }
}
//class 3
class Best extends Vehicles{
    public Best(){
        super("Best", 20);
    }

    // No override
    
}





public class Main{
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Vehicles vehicles = randomVehicles();
            System.out.println("Vhehicle #" + i + ": " + vehicles.getName() + "\n" +
                                "Cylinder : " + vehicles.getCylinders() + "\n" +
                                "Start engine : " + vehicles.startEngine() + "\n" +
                                "Accelerate : " + vehicles.accelerate() + "\n" +
                                "Brake : " + vehicles.brake() + "\n");
            
        }
    } 

    public static Vehicles randomVehicles() {
        int randomNumber = (int) (Math.random() * 3);
        System.out.println("Random number generated is : " + randomNumber);
        switch (randomNumber) {
            case 0:
                return new Best();
            case 1:
                return new V9();
            case 2:
                return new Hyundai();
            case 3:
                return new Ferrari();
        }
        return null;
    }

}
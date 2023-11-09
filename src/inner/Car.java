package inner;

public class Car {
    private String brand;
    private String type;
    private Engine engine;
    public Car(String brand, String type) {
        this.brand = brand;
        this.type = type;
        this.engine = new Engine();
        engine.setEngineType();
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", engine=" + engine +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    class Engine {
        private String engineType;

        public void setEngineType() {
            String aux = "";
            if ("economy".equals(type)){
                this.engineType = "diesel";
            }else if ("luxury".equals(type)) {
                this.engineType = "electric";
            }else  {
                this.engineType = "petrol";
            }
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "engineType='" + engineType + '\'' +
                    '}';
        }
    }
}

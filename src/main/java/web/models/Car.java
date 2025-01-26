package web.models;


public class Car {

    private int id;
    private String model;
    private String engine;

    public Car(int id, String model, String engine) {
        this.id = id;
        this.model = model;
        this.engine = engine;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}

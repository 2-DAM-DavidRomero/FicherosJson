package semana05.ejercicio;

public class Platforma {
    private String name;
    private String manufacturer;

    public Platforma() {
    }

    public Platforma(String name, String manufacturer) {
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' +
                ", manufacturer='" + manufacturer;
    }
}
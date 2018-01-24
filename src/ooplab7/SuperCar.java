package ooplab7;

public class SuperCar {
    private String  CarBrand;
    private String  CarColor;
    private String  CarEngineSize;
    private String  MaxSpeed ;
    private String  CountryOfOrigin ;

    public SuperCar() {
    }
    //Constructor
    public SuperCar(String CarBrand, String n, String a, String g) {
        //assign data to properties
        this.CarBrand = CarBrand;
        this.CarColor = CarColor;
        this.CarEngineSize = CarEngineSize;
        this.MaxSpeed = MaxSpeed;
        this.CountryOfOrigin = CountryOfOrigin;
    }//SuperCar
    //getter and setter methods


    @Override
    public String toString() {
        return "SuperCar{" +
                "CarBrand='" + CarBrand + '\'' +
                ", CarColor='" + CarColor + '\'' +
                ", CarEngineSize='" + CarEngineSize + '\'' +
                ", MaxSpeed='" + MaxSpeed + '\'' +
                ", CountryOfOrigin='" + CountryOfOrigin + '\'' +
                '}';
    }

    public String getCarBrand() {
        return CarBrand;
    }

    public void setCarBrand(String carBrand) {
        CarBrand = carBrand;
    }

    public String getCarColor() {
        return CarColor;
    }

    public void setCarColor(String carColor) {
        CarColor = carColor;
    }

    public String getCarEngineSize() {
        return CarEngineSize;
    }

    public void setCarEngineSize(String carEngineSize) {
        CarEngineSize = carEngineSize;
    }

    public String getMaxSpeed() {
        return MaxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    public String getCountryOfOrigin() {
        return CountryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        CountryOfOrigin = countryOfOrigin;
    }
}//class
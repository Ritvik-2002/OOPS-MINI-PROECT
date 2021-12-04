package package1;
public abstract class car{
    String car_no;
    String model;
    int availability;
    int charges;

    public car(String car_no, String model, int availability, int charges) {
        this.car_no = car_no;
        this.model = model;
        this.availability = availability;
        this.charges = charges;
    }
    public abstract void discount();
}
   class discountCar extends car{
    public discountCar(String car_no, String model, int availability, int charges) {
        super(car_no, model, availability, charges);
    }

    public void discount(){
        charges = charges/2;
    }
   }
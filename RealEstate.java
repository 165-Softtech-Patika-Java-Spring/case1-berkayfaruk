import java.util.List;

//taşınmaz mülk sınıfı
public class RealEstate {
    public String name;
    public int price;
    public int squareMeters;
    public int numberOfRooms;
    public int numberOfHalls;

    public RealEstate(){

    }
    public RealEstate(String name,int price, int squareMeters, int numberOfRooms, int numberOfHalls) {
        this.name=name;
        this.price = price;
        this.squareMeters = squareMeters;
        this.numberOfRooms = numberOfRooms;
        this.numberOfHalls = numberOfHalls;
    }



}

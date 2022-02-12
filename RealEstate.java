import java.util.List;

public class RealEstate implements IRealEstate<RealEstate> {
    public int price;
    public int squareMeters;
    public int numberOfRooms;
    public int numberOfHalls;

    public RealEstate(){

    }
    public RealEstate(int price, int squareMeters, int numberOfRooms, int numberOfHalls) {
        this.price = price;
        this.squareMeters = squareMeters;
        this.numberOfRooms = numberOfRooms;
        this.numberOfHalls = numberOfHalls;
    }

    @Override
    public int totalPrice(RealEstate realEstate) {
        return 0;
    }

    @Override
    public List<RealEstate> realEstateCount(RealEstate realEstate) {
        return null;
    }
}

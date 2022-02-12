import java.util.List;

public interface IRealEstate<T> {
    public int totalPrice(T t);
    public List<T> realEstateCount(T t);

}

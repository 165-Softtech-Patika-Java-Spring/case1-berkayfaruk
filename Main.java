import java.util.ArrayList;
import java.util.List;

public class Main {

    public static RealEstate realEstate;
    public static void main(String[] args) {

        System.out.println("Evlerin Toplam Fiyatları: "+ RealEstateService.homeTotalPrice());
        System.out.println("Villaların Toplam Fiyatları: "+RealEstateService.villaTotalPrice());
        System.out.println("Yazlıkların Toplam Fiyatları: "+RealEstateService.summerHouseTotalPrice());
        System.out.println("Tüm Taşınmazların Toplam Fiyatları: "+RealEstateService.realEstateTotalPrice());
        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Evlerin Ortalama Metrekareleri: "+ RealEstateService.homeAverageSquareMeters());
        System.out.println("Vilların Ortalama Metrekareleri: "+ RealEstateService.villaAverageSquareMeters());
        System.out.println("Evlerin Ortalama Metrekareleri: "+ RealEstateService.summerHouseAverageSquareMeters());
        System.out.println("Tüm Taşınmazların Ortalama Metrekareleri: "+ RealEstateService.realEstateAverageSquareMeters());
        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Oda Sayısına Göre Taşınmaz İsmini Getir: (2 odalı ) ");
        ArrayList<String> a=RealEstateService.byTheNumberOfRooms(2);
        for(var i:a){
            System.out.println(i);
        }
        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Salon Sayısına Göre Taşınmaz İsmini Getir: (1 salon ) ");
        ArrayList<String> b=RealEstateService.byTheNumberOfHalls(1);
        for(var i:a){
            System.out.println(i);
        }
        System.out.println("-------------------------------------------------------------------------");

        System.out.println("Oda ve Salon Sayısına Göre Taşınmaz İsmini Getir: (1 salon ) ");
        ArrayList<String> c=RealEstateService.byTheNumberOfRoomsAndHalls(3,1);
        for(var i:a){
            System.out.println(i);
        }
        System.out.println("-------------------------------------------------------------------------");





    }

}

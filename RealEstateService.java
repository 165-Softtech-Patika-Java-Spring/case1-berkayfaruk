import java.util.ArrayList;

public class RealEstateService extends RealEstate {

    //region Taşınmazların Listeleri
    public static ArrayList<RealEstate> getHomeList(){
        ArrayList<RealEstate> homes=new ClassesInstance().getHomeList();
        return homes;
    }
    public static ArrayList<RealEstate>  getVillaList(){
        ArrayList<RealEstate> villas=new ClassesInstance().getVillaList();
        return villas;
    }
    public static ArrayList<RealEstate>  getSummerHouseList(){
        ArrayList<RealEstate> summerHouses=new ClassesInstance().getSummerHouseList();
        return summerHouses;
    }
    //endregion

    //region Taşınmazların Toplamı ve Tüm taşınmazların toplamı
    public static int homeTotalPrice(){
        ArrayList<RealEstate> homes=getHomeList();
        int sum=0;
        for(var items:homes){
            sum+=items.price;
        }
        return sum;
    }
    public static int villaTotalPrice(){
        ArrayList<RealEstate> villas=getVillaList();
        int sum=0;
        for(var items:villas){
            sum+=items.price;
        }
        return sum;
    }
    public static int summerHouseTotalPrice(){
        ArrayList<RealEstate> summerHouses=getSummerHouseList();
        int sum=0;
        for(var items:summerHouses){
            sum+=items.price;
        }
        return sum;
    }
    public static int realEstateTotalPrice(){
        ArrayList<RealEstate> realEstates=new ClassesInstance().getRealEstatelist();
        int sum=0;
        for(var items:realEstates){
            sum+=items.price;
        }
        return sum;
    }
    //endregion

    //region Taşınmazların Ortalama metre karesi ve Tüm taşınmazların ortalama metrekaresi
    public static int homeAverageSquareMeters(){
        int homeCount=getHomeList().size();
        ArrayList<RealEstate> homes=getHomeList();
        int sum=0;
        for(var items:homes){
            sum+=items.squareMeters;
        }
        int average=sum/homeCount;
        return average;
    }
    public static int villaAverageSquareMeters(){
        int villaCount=getVillaList().size();
        ArrayList<RealEstate> villas=getVillaList();
        int sum=0;
        for(var items:villas){
            sum+=items.squareMeters;
        }
        int average=sum/villaCount;
        return average;
    }
    public static int summerHouseAverageSquareMeters(){
        int summerHouseCount=getSummerHouseList().size();
        ArrayList<RealEstate> summerHouses=getSummerHouseList();
        int sum=0;
        for(var items:summerHouses){
            sum+=items.squareMeters;
        }
        int average=sum/summerHouseCount;
        return average;
    }
    public static int realEstateAverageSquareMeters(){
        int realEstatesCount=new ClassesInstance().getRealEstatelist().size();
        ArrayList<RealEstate> realEstates=new ClassesInstance().getRealEstatelist();
        int sum=0;
        for(var items:realEstates){
            sum+=items.squareMeters;
        }
        int average=sum/realEstatesCount;
        return average;
    }
    //endregion

    //region Oda ve salon sayısına göre tüm tipteki taşınmazlar filtreyip isimlerini(id) getir
    public static ArrayList<String> byTheNumberOfRoomsAndHalls(int room,int hall){
        ArrayList<RealEstate> realEstates=new ClassesInstance().getRealEstatelist();
        ArrayList<String> results=new ArrayList<>();
        for(var items:realEstates){
            if(items.numberOfRooms==room && items.numberOfHalls==hall){
                results.add(items.name);
            }
        }
        return results;
    }
    public static ArrayList<String> byTheNumberOfRooms(int room){
        ArrayList<RealEstate> realEstates=new ClassesInstance().getRealEstatelist();
        ArrayList<String> results=new ArrayList<>();
        for(var items:realEstates){
            if(items.numberOfRooms==room){
                results.add(items.name);
            }
        }
        return results;
    }
    public static ArrayList<String> byTheNumberOfHalls(int hall){
        ArrayList<RealEstate> realEstates=new ClassesInstance().getRealEstatelist();
        ArrayList<String> results=new ArrayList<>();
        for(var items:realEstates){
            if(items.numberOfHalls==hall){
                results.add(items.name);
            }
        }
        return results;
    }
    //endregion



}

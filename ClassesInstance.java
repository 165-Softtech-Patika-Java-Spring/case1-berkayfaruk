import java.util.ArrayList;
import java.util.List;

public class ClassesInstance {
    RealEstate home1=new Home("ev1",450000,75,2,1);
    RealEstate home2=new Home("ev2",1250000,250,4,2);
    RealEstate home3=new Home("ev3",500000,110,3,1);



    RealEstate villa1=new Villa("villa1",100000,150,5,1);
    RealEstate villa2=new Villa("villa2",200000,300,6,2);
    RealEstate villa3=new Villa("villa3",300000,435,2,1);

    RealEstate summerHouse1=new SummerHouse("yazlik1",100000,300,6,2);
    RealEstate summerHouse2=new SummerHouse("yazlik2",200000,300,7,2);
    RealEstate summerHouse3=new SummerHouse("yazlik3",300000,300,8,4);

    public ArrayList<RealEstate> getHomeList(){
        ArrayList<RealEstate> homes=new ArrayList<>();
        homes.add(home1);
        homes.add(home2);
        homes.add(home3);
        return homes;
    }
    public ArrayList<RealEstate> getVillaList(){
        ArrayList<RealEstate> villas=new ArrayList<>();
        villas.add(villa1);
        villas.add(villa2);
        villas.add(villa3);
        return villas;
    }
    public ArrayList<RealEstate> getSummerHouseList(){
        ArrayList<RealEstate> summerHouses=new ArrayList<>();
        summerHouses.add(summerHouse1);
        summerHouses.add(summerHouse2);
        summerHouses.add(summerHouse3);
        return summerHouses;
    }
    public ArrayList<RealEstate> getRealEstatelist(){
        ArrayList<RealEstate> realEstates=new ArrayList<>();

        realEstates.add(home1);
        realEstates.add(home2);
        realEstates.add(home3);

        realEstates.add(villa1);
        realEstates.add(villa2);
        realEstates.add(villa3);

        realEstates.add(summerHouse1);
        realEstates.add(summerHouse2);
        realEstates.add(summerHouse3);

        return realEstates;
    }


}

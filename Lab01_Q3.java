public class Lab01_Q3 {
    public static void main(String[] args) {

        double TotalAreaOfTheWorld = 510072000 ;
        double TotalAreaOfTurkey = 78347.01908632623 ;
        long TurkeyDryLand = (long)(TotalAreaOfTurkey*76/77) ;
        long TurkeyWater = (long)(TotalAreaOfTurkey*1/77) ;
        long EarthDryLand = (long)(TotalAreaOfTheWorld*29.2/100) ;
        long EarthWater = (long)(TotalAreaOfTheWorld - EarthDryLand) ;
        double TurkeyDryPercentage = (double)TurkeyDryLand/EarthDryLand*100 ;
        double EarthWaterExceptTurkey = 100 - (double)TurkeyWater/EarthWater*100 ;

        System.out.println("Turkey has " + TurkeyDryLand + " km2 dry land and " + TurkeyWater + " km2 water.");
        System.out.println("Earth has " + EarthDryLand +" km2 dry land and "+ EarthWater + " km2 water.");
        System.out.println("Turkey has " + TurkeyDryPercentage + " percent of the Earth's dry land.") ;
        System.out.println("Percentage of Earth water outside Turkey is " + EarthWaterExceptTurkey + " percent.") ;
    }

    


} 

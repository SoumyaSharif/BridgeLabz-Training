public class EarthVolume{
     public static void main(String[] args){
     
     //Create double variable names and assign them values 
     double radiusOfEarth = 6378;
     double radiusCube = Math.pow(radiusOfEarth,3);
     double volumeOfEarthInKm = ((4* 3.14 * radiusCube)/3);
     double volumeOfEarthInmiles = volumeOfEarthInKm * 0.2;

     //Display the results
     System.out.print("The volume of earth in cubic kilometers is " + volumeOfEarthInKm + " and cubic miles is " + volumeOfEarthInmiles);
     }
}
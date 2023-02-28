public class monotributo {
    public static void main(String[] args) {
        
        float earning = 900.200f;
        int numberOfCars = 2;
        int yearOfCars = 5;
        int numberOfHouse = 2;
        boolean deluxeVehicle = false;

        float classA = 489.083f;
        float classB = 748.382f;
        float classC = 999.657f;
        

        if ( earning <= classA && numberOfCars <= 3 && yearOfCars < 8 && numberOfHouse <= 2 && deluxeVehicle != true ) {
            System.out.println( " Familia de clase A");
        }else if( earning > classA && earning <= classB && numberOfCars <= 3 && yearOfCars < 7 && numberOfHouse <= 2 && deluxeVehicle != true ){
            System.out.println( " Familia de clase B");
        }else if ( earning > classB && earning < classC && numberOfCars > 3 && yearOfCars < 5 && numberOfHouse > 3 && deluxeVehicle != false) {
            System.out.println( " Familia de clase c");
        }else{
            System.out.println(" Algunos de los datos ingresados,  no corresponden con el programa :) ");
        }

    }
}

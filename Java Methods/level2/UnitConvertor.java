public class UnitConvertor {
    private static final double KM_TO_MILES = 0.621371;
    private static final double MILES_TO_KM = 1.60934;
    private static final double METERS_TO_FEET = 3.28084;
    private static final double FEET_TO_METERS = 0.3048;
    private static final double YARDS_TO_FEET = 3;
    private static final double FEET_TO_YARDS = 0.333333;
    private static final double METERS_TO_INCHES = 39.3701;
    private static final double INCHES_TO_METERS = 0.0254;
    private static final double INCHES_TO_CM = 2.54;
    private static final double POUNDS_TO_KILOGRAMS = 0.453592;
    private static final double KILOGRAMS_TO_POUNDS = 2.20462;
    private static final double GALLONS_TO_LITERS = 3.78541;
    private static final double LITERS_TO_GALLONS = 0.264172;
    public static double convertKmToMiles(double km) {
        return km * KM_TO_MILES;
    }
    public static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }
    public static double convertMetersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }
    public static double convertFeetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }
    public static double convertYardsToFeet(double yards) {
        return yards * YARDS_TO_FEET;
    }
    public static double convertFeetToYards(double feet) {
        return feet * FEET_TO_YARDS;
    }
    public static double convertMetersToInches(double meters) {
        return meters * METERS_TO_INCHES;
    }
    public static double convertInchesToMeters(double inches) {
        return inches * INCHES_TO_METERS;
    }
    public static double convertInchesToCm(double inches) {
        return inches * INCHES_TO_CM;
    }
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * POUNDS_TO_KILOGRAMS;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * KILOGRAMS_TO_POUNDS;
    }
    public static double convertGallonsToLiters(double gallons) {
        return gallons * GALLONS_TO_LITERS;
    }
    public static double convertLitersToGallons(double liters) {
        return liters * LITERS_TO_GALLONS;
    }
    public static void main(String[] args) {
        System.out.println("5 km to miles: " + convertKmToMiles(5));
        System.out.println("5 miles to km: " + convertMilesToKm(5));
        System.out.println("10 meters to feet: " + convertMetersToFeet(10));
        System.out.println("10 feet to meters: " + convertFeetToMeters(10));
        System.out.println("5 yards to feet: " + convertYardsToFeet(5));
        System.out.println("15 feet to yards: " + convertFeetToYards(15));
        System.out.println("2 meters to inches: " + convertMetersToInches(2));
        System.out.println("78.74 inches to meters: " + convertInchesToMeters(78.74));
        System.out.println("12 inches to cm: " + convertInchesToCm(12));
        System.out.println("32 Fahrenheit to Celsius: " + convertFahrenheitToCelsius(32));
        System.out.println("0 Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(0));
        System.out.println("10 pounds to kilograms: " + convertPoundsToKilograms(10));
        System.out.println("5 kilograms to pounds: " + convertKilogramsToPounds(5));
        System.out.println("1 gallon to liters: " + convertGallonsToLiters(1));
        System.out.println("4 liters to gallons: " + convertLitersToGallons(4));
    }
}

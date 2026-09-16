package problem12;

import java.util.TreeMap;

public class CountryManagement {
	private TreeMap<String, Country> countryMap;

	public CountryManagement() {
		countryMap = new TreeMap<>();
	}

	public void addCountry(Country country) {
		countryMap.put(country.getCountryCode(), country);
		System.out.println("Country added successfully!");
	}
	
    public void removeCountry(String countryCode) {
        if (countryMap.remove(countryCode) != null) {
            System.out.println("Country removed successfully!");
        } else {
            System.out.println("Country code not found!");
        }
    }

    public void searchCountry(String countryCode) {
        Country c = countryMap.get(countryCode);
        if (c != null)
            System.out.println("Found: " + c);
        else
            System.out.println("Country not found!");
    }


    // Display all countries
    public void displayAllCountries() {
        if (countryMap.isEmpty()) {
            System.out.println("No countries available.");
            return;
        }
        for (Country c : countryMap.values()) {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        CountryManagement cm = new CountryManagement();

        // Adding some countries
        cm.addCountry(new Country("C001", "India", 1400000000));
        cm.addCountry(new Country("C002", "USA", 331000000));
        cm.addCountry(new Country("C003", "Japan", 125000000));

        System.out.println("\n--- Displaying All Countries ---");
        cm.displayAllCountries();

        System.out.println("\n--- Searching for Country with Code C002 ---");
        cm.searchCountry("C002");

        System.out.println("\n--- Removing Country with Code C003 ---");
        cm.removeCountry("C003");

        System.out.println("\n--- Displaying All Countries ---");
        cm.displayAllCountries();
    }
}


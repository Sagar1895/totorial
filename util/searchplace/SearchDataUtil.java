package com.xworkz.tourism.util.searchplace;

import org.springframework.stereotype.Component;

@Component
public class SearchDataUtil {

	public boolean isValidPlace(String place) {
		if (place.length() >= 3 && place.length() <= 15 && !place.isEmpty() && place != null) {
			System.out.println("Place is Valid");
			return true;
		} else {
			System.out.println("Place is Invalid");
			return false;
		}

	}

	public boolean isValidCity(String city) {
		if (city.length() >= 3 && city.length() <= 15 && !city.isEmpty() && city != null) {
			System.out.println("City is Valid");
			return true;
		} else {
			System.out.println("City is Invalid");
			return false;
		}

	}

	public boolean isValidState(String state) {
		if (state.length() >= 3 && state.length() <= 15 && !state.isEmpty() && state != null) {
			System.out.println("State is Valid");
			return true;
		} else {
			System.out.println("State is Invalid");
			return false;
		}

	}

	public boolean isValidCountry(String country) {
		if (country.length() >= 3 && country.length() <= 15 && !country.isEmpty() && country != null) {
			System.out.println("Country is Valid");
			return true;
		} else {
			System.out.println("Country is Invalid");
			return false;
		}

	}

	public boolean isValidDescription(String description) {
		if (description.length() >= 3 && description.length() <= 150 && !description.isEmpty() && description != null) {
			System.out.println("Description is valid");
			return true;

		} else {
			System.out.println("Description is Invalid");
			return false;

		}
	}

	public boolean isValidPopular(String popular) {
		if (popular.length() >= 3 && popular.length() <= 15 && !popular.isEmpty() && popular != null) {
			System.out.println("Popular is Valid");
			return true;
		} else {
			System.out.println("Popular is Invalid");
			return false;
		}
	}

	public boolean isValidSeason(String season) {
		if (season.length() >= 3 && season.length() <= 15 && !season.isEmpty() && season != null) {
			System.out.println("Season is Valid");
			return true;
		} else {
			System.out.println("Season is Invalid\n");
			return false;
		}
}
}
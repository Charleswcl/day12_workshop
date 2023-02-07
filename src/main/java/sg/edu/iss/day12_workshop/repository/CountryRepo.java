package sg.edu.iss.day12_workshop.repository;

import java.util.ArrayList;
import java.util.List;

import sg.edu.iss.day12_workshop.model.Country;

public class CountryRepo {

    List<Country> countryList;

    public List<Country> getAllCountries() {

        countryList = new ArrayList<Country>();
        Country city = new Country("SG", "Singapore", 6000000);
        countryList.add(city);
        city = new Country("MY", "Malaysia", 33000000);
        countryList.add(city);
        city = new Country("CN", "China", 1433000000);
        countryList.add(city);
        city = new Country("HK", "Hong Kong", 7000000);
        countryList.add(city);

        return countryList;

    }

    public Boolean createCountry(Country cty) {

        if (countryList == null) {
            countryList = new ArrayList<Country>();
        }

        countryList.add(cty);
        return true;

    }

}

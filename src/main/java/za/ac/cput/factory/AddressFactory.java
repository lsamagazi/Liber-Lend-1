package za.ac.cput.factory;

/**
 * AddressFactory.java
 * Factory class for Address.
 * Author: Cwenga Dlova(214310671)
 * Date: 16/07/2023
 */

import za.ac.cput.domain.impl.Address;

import java.util.List;
import java.util.Random;

public class AddressFactory {

    public static Address createAddress(String strNo, String strName, String suburb, String city, long postalCode){

        return new Address.Builder()
                .setId(new Random().nextInt())
                .setStrNo(strNo)
                .setStrName(strName)
                .setSuburb(suburb)
                .setCity(city)
                .setPostalCode(postalCode)
                .build();
    }
}

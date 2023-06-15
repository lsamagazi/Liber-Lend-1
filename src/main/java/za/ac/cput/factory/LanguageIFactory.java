package za.ac.cput.factory;


import za.ac.cput.domain.impl.Language;

import java.util.List;
import java.util.Random;

public class LanguageIFactory implements IFactory<Language>{

    public static Language createLanguage(String name, String isoCode, String nativeName, String countrySpokenIn, String dialect ) {

        Random random = new Random();
        int languageId = random.nextInt(1000000);

        return new Language.Builder()
                .setLanguageId(languageId)
                .setName(name)
                .setIsoCode(isoCode)
                .setNativeName(nativeName)
                .setCountrySpokenIn(countrySpokenIn)
                .setDialect(dialect)
                .build();
    }

    @Override
    public Language create() {
        return null;
    }

    @Override
    public Language getById(long id) {
        return null;
    }

    @Override
    public Language update(Language entity) {
        return null;
    }

    @Override
    public boolean delete(Language entity) {
        return false;
    }

    @Override
    public List<Language> getAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public Class<Language> getType() {
        return null;
    }
}

package za.ac.cput.domain.impl;

// notes. might need lists for countrySpokenIn, Dialect

public class Language {
    private int languageId;
    private String name;
    private String isoCode;
    private String nativeName;
    private String countrySpokenIn;
    private String dialect;

    public Language(Builder builder) {
        this.languageId = builder.languageId;
        this.name = builder.name;
        this.isoCode = builder.isoCode;
        this.nativeName = builder.nativeName;
        this.countrySpokenIn = builder.countrySpokenIn;
        this.dialect = builder.dialect;
    }

    public int getLanguageId() {
        return languageId;
    }

    public String getName() {
        return name;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public String getNativeName() {
        return nativeName;
    }

    public String getCountrySpokenIn() {
        return countrySpokenIn;
    }

    public String getDialect() {
        return dialect;
    }

    @Override
    public String toString() {
        return "Language{" +
                "languageId=" + languageId +
                ", name='" + name + '\'' +
                ", isoCode='" + isoCode + '\'' +
                ", nativeName='" + nativeName + '\'' +
                ", countrySpokenIn='" + countrySpokenIn + '\'' +
                ", dialect='" + dialect + '\'' +
                '}';
    }

    public static class Builder {
        private int languageId;
        private String name;
        private String isoCode;
        private String nativeName;
        private String countrySpokenIn;
        private String dialect;

        public Builder setLanguageId(int languageId) {
            this.languageId = languageId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setIsoCode(String isoCode) {
            this.isoCode = isoCode;
            return this;
        }

        public Builder setNativeName(String nativeName) {
            this.nativeName = nativeName;
            return this;
        }

        public Builder setCountrySpokenIn(String countrySpokenIn) {
            this.countrySpokenIn = countrySpokenIn;
            return this;
        }

        public Builder setDialect(String dialect) {
            this.dialect = dialect;
            return this;
        }

        public Builder copy(Language language) {
            this.languageId = language.languageId;
            this.name = language.name;
            this.isoCode = language.isoCode;
            this.nativeName = language.nativeName;
            this.countrySpokenIn = language.countrySpokenIn;
            this.dialect = language.dialect;
            return this;
        }

        public Language build() {
            return new Language(this);
        }
    }

}

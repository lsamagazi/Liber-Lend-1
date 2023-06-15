package za.ac.cput.domain.impl;
/**
 * Branch.java
 * Class for Branch
 * Author: Cwenga Dlova(214310671)
 * Date: 19 March 2023
 */

public class Branch {

    private String name;
    private int code;
    private String emailAddress;
    private String address;
    private String availableItems;

    public Branch() {
    }

    public Branch(Builder builder) {
        this.name = builder.name;
        this.code = builder.code;
        this.emailAddress = builder.emailAddress;
        this.address = builder.address;
        this.availableItems = builder.availableItems;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", emailAddress='" + emailAddress + '\'' +
                ", address='" + address + '\'' +
                ", availableItems='" + availableItems + '\'' +
                '}';
    }

    public static class Builder {
        private String name;
        private int code;
        private String emailAddress;
        private String address;
        private String availableItems;


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setCode(int code) {
            this.code = code;
            return this;
        }

        public Builder setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setAvailableItems(String availableItems) {
            this.availableItems = availableItems;
            return this;
        }
        public Builder copy(Branch branch) {
            this.name = branch.name;
            this.code = branch.code;
            this.emailAddress = branch.emailAddress;
            this.address = branch.address;
            this.availableItems = branch.availableItems;

            return this;
        }
        public Branch build() {
            return new Branch(this);
        }
    }
}

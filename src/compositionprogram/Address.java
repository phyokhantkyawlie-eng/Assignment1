package compositionprogram;

public class Address {

    String city;
    String country;
    String postalCode;
    String addressOne;
    String addressTwo;

    public Address(String city, String country, String postalCode, String addressOne, String addressTwo) {
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
        this.addressOne = addressOne;
        this.addressTwo = addressTwo;
    }

    public String getAddressInfo() {
        return "City = " + city +
                "\nCountry = " + country +
                "\nPostal Code = " + postalCode +
                "\nAddress Line One = " + addressOne +
                "\nAddress Line Two = " + addressTwo;
    }
}
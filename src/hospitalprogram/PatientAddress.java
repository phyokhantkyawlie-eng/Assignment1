package hospitalprogram;

public class PatientAddress {

    String city;
    String country;
    String postalCode;
    String addressLineOne;
    String addressLineTwo;

    public PatientAddress(String city, String country, String postalCode, String addressLineOne, String addressLineTwo) {
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
        this.addressLineOne = addressLineOne;
        this.addressLineTwo = addressLineTwo;
    }

    public String getAddressInfo() {
        return "City = " + city +
                "\nCountry = " + country +
                "\nPostal Code = " + postalCode +
                "\nAddress Line One = " + addressLineOne +
                "\nAddress Line Two = " + addressLineTwo;
    }
}
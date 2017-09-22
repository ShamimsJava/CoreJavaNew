package bd.employee.address.addressType;

public class Address {

    private String thana;
    private String district;
    private AddressType addType;

    public Address(String thana, String district, AddressType addType) {
        this.thana = thana;
        this.district = district;
        this.addType = addType;
    }

    public String getThana() {
        return thana;
    }

    public String getDistrict() {
        return district;
    }

    public AddressType getAddType() {
        return addType;
    }

}

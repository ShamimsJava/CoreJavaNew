package bd.shamim;

public class Address {

    private int houseNo;
    private int blockNo;
    private int roadNo;
    private String thana;
    private String district;
    private AddressType addType;

    public Address(int houseNo, int blockNo, int roadNo, String thana, String district, AddressType addType) {
        this.houseNo = houseNo;
        this.blockNo = blockNo;
        this.roadNo = roadNo;
        this.thana = thana;
        this.district = district;
        this.addType = addType;
    }

    public int getHouseNo() {
        return houseNo;
    }

    public int getBlockNo() {
        return blockNo;
    }

    public int getRoadNo() {
        return roadNo;
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

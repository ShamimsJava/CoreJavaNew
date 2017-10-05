package homeword.collectionList;

public class Location {

    private int postCode;
    private String DistrictName;

    public Location(int postCode, String DistrictName) {
        this.postCode = postCode;
        this.DistrictName = DistrictName;
    }

    public int getPostCode() {
        return postCode;
    }

    public String getDistrictName() {
        return DistrictName;
    }
}

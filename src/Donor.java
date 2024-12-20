public class Donor {
    private int donorId;
    private String name;
    private String contactInfo;


    public Donor(int donorId, String name, String contactInfo) {
        this.donorId = donorId;
        this.name = name;
        this.contactInfo = contactInfo;
    }


    public int getDonorId() {
        return donorId;
    }

    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String toString() {
        return "Donor ID: " + donorId + ", Name: " + name + ", Contact: " + contactInfo;
    }
}

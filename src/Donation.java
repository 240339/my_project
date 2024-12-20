public class Donation {
    private int donationId;
    private double amount;
    private String date;
    private int donorId;
    private int charityId;


    public Donation(int donationId, double amount, String date, int donorId, int charityId) {
        this.donationId = donationId;
        this.amount = amount;
        this.date = date;
        this.donorId = donorId;
        this.charityId = charityId;
    }


    public int getDonationId() {
        return donationId;
    }

    public void setDonationId(int donationId) {
        this.donationId = donationId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDonorId() {
        return donorId;
    }

    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }

    public int getCharityId() {
        return charityId;
    }

    public void setCharityId(int charityId) {
        this.charityId = charityId;
    }

    public String toString() {
        return "Donation ID: " + donationId + ", Amount: " + amount + ", Date: " + date;
    }
}


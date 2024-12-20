public class Main {
    public static void main(String[] args) {

        Charity charity = new Charity(1, "Helping Hands", "Supports education for underprivileged children.");


        Donor donor = new Donor(1, "Alice", "alice@example.com");


        Donation donation = new Donation(1, 100.50, "2024-12-19", donor.getDonorId(), charity.getCharityId());


        Donation anotherDonation = new Donation(2, 200.00, "2024-12-20", donor.getDonorId(), charity.getCharityId());

        System.out.println();
        System.out.println(charity);
        System.out.println(donor);
        System.out.println("First Donation: " + donation);
        System.out.println("Second Donation: " + anotherDonation);


        System.out.println("Comparison of donations: " +
                (donation.getAmount() > anotherDonation.getAmount() ? "First is larger" : "Second is larger"));
    }
}

//test

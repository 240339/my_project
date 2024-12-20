public class Charity {
    private int charityId;
    private String name;
    private String description;

    public Charity(int charityId, String name, String description) {
        this.charityId = charityId;
        this.name = name;
        this.description = description;
    }


    public int getCharityId() {
        return charityId;
    }

    public void setCharityId(int charityId) {
        this.charityId = charityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Charity ID: " + charityId + ", Name: " + name + ", Description: " + description;
    }
}

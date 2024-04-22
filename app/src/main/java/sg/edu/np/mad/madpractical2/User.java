package sg.edu.np.mad.madpractical2;

public class User {
    public String name;
    public String description;
    public int id;
    public boolean followed;
    public User(String name, String description, int id, boolean followed){
        this.name = name;
        this.description = description;
        this.id = id;
        this.followed = followed;
    }

    // Method to toggle the follow status
    public void toggleFollowed() {
        followed = !followed; // Toggle the value
    }

    // Method to check if the user is followed
    public boolean isFollowed() {
        return followed;
    }
}
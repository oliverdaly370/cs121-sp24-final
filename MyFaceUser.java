import java.util.ArrayList;

/**
 * Description: Creates a new MyFaceUser and allows
 * for the name, age, and friends to be changed.
 * 
 * @author oliverdaly370
 */

public class MyFaceUser {
    // Instance variables
    private String name;
    private int age;
    private ArrayList<MyFaceUser> friends;

    // Constructor
    /**
     * Takes name and age to create a new user and
     * clear the friends arraylist
     * 
     * @param name
     * @param age
     */
    public MyFaceUser(String name, int age) {
        String myName = name;
        int myAge = age;
        friends = new ArrayList<MyFaceUser>();
    }

    // Methods: getters and setters
    /**
     * Returns name of the user
     * 
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Returns name of user based off new name given
     * 
     * @param newName
     * @return
     */
    public String setName(String newName) {
        name = newName;
        return name;
    }

    /**
     * Returns age of the user
     * 
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     * Returns age of user based off new age given
     * 
     * @param newAge
     * @return
     */
    public int setAge(int newAge) {
        age = newAge;
        return age;
    }

    // Method to add friend
    /**
     * Allows users to add friends to their friends list
     * 
     * @param newFriend
     */
    public void addFriend(MyFaceUser newFriend) {
        friends.add(newFriend);
    }

    // Main method
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        MyFaceUser oliver = new MyFaceUser("Oliver", 19);
        MyFaceUser billGates = new MyFaceUser("Bill Gates", 62);
        oliver.addFriend(billGates);
    }
}
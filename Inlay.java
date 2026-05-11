public class Inlay {

    public static void main(String[] args) {
        // Look at how VS Code labels these values in your editor!
        createUser("John", "Doe", 25, true);
    }

    /**
     * A method that takes 4 different parameters
     */
    public static void createUser(String firstName, String lastName, int age, boolean isActive) {
        System.out.println("User Created: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Active Status: " + isActive);
    }
}

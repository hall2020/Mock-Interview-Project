package MockInterview;

public class Registration {
    private String email;
    private String userName;
    private String password;




    // Method to set user email
    public void setEmail(String email) {
        // Validating email (considering only yahoo as valid)
        if (email.toLowerCase().endsWith("@yahoo.com")) {
            this.email = email;
            System.out.println("Email set successfully.");
        } else {
            System.out.println("Invalid email format. Please use a Yahoo email.");
        }
    }

    // Method to set user userName
    public void setUserName(String userName) {
        // Validating userName (cannot be empty and should be of length larger than 6 characters)
        if (userName.length() > 6) {
            this.userName = userName;
            System.out.println("Username set successfully.");
        } else {
            System.out.println("Invalid username. Username should be of length larger than 6 characters.");
        }
    }

    // Method to set user password
    public void setPassword(String password) {
        // Validating password (cannot be empty, should be of length larger than 6 characters,
        // and should not contain userName)
        if (password.length() > 6 && !password.contains(userName)) {
            this.password = password;
            System.out.println("Password set successfully.");
        } else {
            System.out.println("Invalid password. Password should be of length larger than 6 characters and should not contain the username.");
        }
    }
}

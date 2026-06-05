package Week_1.OOPS;

// 1. Create the LibraryUser interface
interface LibraryUser {
    void registerAccount();

    void requestBook();
}

// 2. Create the KidUser class implementing the interface
class KidUser implements LibraryUser {
    // 3. Instance variables
    int age;
    String bookType;

    // 4. Logic for KidUser methods
    @Override
    public void registerAccount() {
        if (age < 12) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }

    @Override
    public void requestBook() {
        if ("Kids".equals(bookType)) {
            System.out.println("Book Issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}

// 5. Create the AdultUser class implementing the interface
class AdultUser implements LibraryUser {
    // 3. Instance variables
    int age;
    String bookType;

    // 6. Logic for AdultUser methods
    @Override
    public void registerAccount() {
        if (age > 12) {
            System.out.println("You have successfully registered under an Adult Account");
        } else {
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }

    @Override
    public void requestBook() {
        if ("Fiction".equals(bookType)) {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}

// 6. Main execution class
public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        System.out.println("--- Test Case #1: KidUser ---");
        KidUser kid = new KidUser();

        // Testing age logic
        kid.age = 10;
        kid.registerAccount();
        kid.age = 18;
        kid.registerAccount();

        // Testing book type logic
        kid.bookType = "Kids";
        kid.requestBook();
        kid.bookType = "Fiction";
        kid.requestBook();

        System.out.println("\n--- Test Case #2: AdultUser ---");
        AdultUser adult = new AdultUser();

        // Testing age logic
        adult.age = 5;
        adult.registerAccount();
        adult.age = 23;
        adult.registerAccount();

        // Testing book type logic
        adult.bookType = "Kids";
        adult.requestBook();
        adult.bookType = "Fiction";
        adult.requestBook();
    }
}

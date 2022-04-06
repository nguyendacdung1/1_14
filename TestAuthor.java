public class TestAuthor {
    public static void main(String[] args) {
        // Test constructor and toString()
        Author ahTeck = new Author("Dung~", "nguyendungmk9@gmail.com", 'm');
        System.out.println(ahTeck);  // toString()
        //Tan Ah Teck (m) at teck@nowhere.com

        // Test Setters and Getters
        ahTeck.setEmail("aptech");
        System.out.println(ahTeck);  // toString()
        //Tan Ah Teck (m) at teck@somewhere.com
        System.out.println("name is: " + ahTeck.getName());
        //name is: Tan Ah Teck
        System.out.println("gender is: " + ahTeck.getGender());
        //gender is: m
        System.out.println("email is: " + ahTeck.getEmail());
        //email is: teck@somewhere.com
    }
}

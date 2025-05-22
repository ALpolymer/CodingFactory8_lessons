package gr.aueb.cf.ch12;

public class Main {
    /*
    --- Η αρχική κλάση Student ---
    public class Student {
    int id;
    String firstname;
    String lastname;
}
     */
    public static void main(String[] args) {
        /*
        alice -> Student instance()
        Student() -> (argumentless) constructor method (Αρχικοποιεί τα πέδία της κλάσης)
        Από τη στιγμή που αρχικοποιείται το instance μέσω του constructor
        χωρις παραμέτρους τα πεδία παιρνουν default τιμές:
        id =0;
        firstname = null;
        lastname = null;
         */
        Student alice = new Student();

        alice.id =10;              //set id
        alice.firstname = "Alice"; //set firstname
        alice.lastname = "W.";     //set lastname

        System.out.println(alice.id);           //get id
        System.out.println(alice.firstname);    //get firstname
        System.out.println(alice.lastname);     //get firstname

    }
}

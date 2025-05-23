package gr.aueb.cf.ch13;

public class Main {

    public static void main(String[] args) {
        Account aliceAccount = new Account(1 ,"GR2436", "Alice", "Wallace", "F6289373", 100);

        try{
            aliceAccount.deposit(500);

            System.out.println(aliceAccount.accountToString());

            aliceAccount.withdraw(50, "F6289373");

            System.out.println(aliceAccount.accountToString());

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    }



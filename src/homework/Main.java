package homework;

public class Main{
    public static void main(String[] args){
        User user1 = new User("Bob");
        User user2 = new User("Vlad");

        //save user
        Saveable saveUser1 = new UserSave("Bob");
        saveUser1.save();

        Saveable saveUser2 = new UserSave("Vlad");
        saveUser2.save();

        //report user
        Reportable reporter_User1 = new UserReporter(user1);
        reporter_User1.report();

        Reportable reporter_User2 = new UserReporter(user2);
        reporter_User2.report();
    }
}
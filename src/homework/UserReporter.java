package homework;

public class UserReporter implements Reportable{
    private final User user;

    public UserReporter(User user){
        this.user = user;
    }

    @Override
    public void report() {
        System.out.println("Save user: " + user.getName());
    }
}

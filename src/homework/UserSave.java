package homework;

public class UserSave implements Saveable{
    private final User user;

    public UserSave(String userName){
        this.user = new User(userName);
    }

    @Override
    public void save(){
        System.out.println("Save user: " + user.getName());
    }
}

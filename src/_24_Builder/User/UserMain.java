package _24_Builder.User;

public class UserMain {
    public static void main(String[] args) {

        User user = User.builder().build();

        System.out.println(user);

    }
}

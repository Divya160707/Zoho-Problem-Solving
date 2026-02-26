interface Login {
    void login(String username, String password);
}

class UserLogin implements Login {
    public void login(String username, String password) {
        if (username.equals("admin") && password.equals("1234")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }
    }
}

class loginsystem {
    public static void main(String[] args) {
        Login l = new UserLogin();
        l.login("admin", "1234");
    }
}

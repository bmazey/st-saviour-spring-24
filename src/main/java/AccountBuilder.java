public class AccountBuilder {

    private String email;
    private String password;
    private String username;

    

    public static class Builder {
        private String email;
        private String password;
        private String username;

        public Builder Gmail(String mail) {
            this.email = mail;
            return this;
        }

        public Builder Code(String password) {
            this.password = password;
            return this;
        }

        public Builder newUser
    }
}

public class AccountBuilder {

    public AccountBuilder(AccountBuilder.Builder builder) {
        //TODO Auto-generated constructor stub
    }



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

        public Builder newUser(String username) {
            this.username = username;
            return this;
        }

        public AccountBuilder build() {
            return new AccountBuilder(this);
        }
    }
}

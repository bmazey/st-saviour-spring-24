public class Builder {

    private String email;
    private String password;
    private String username;

    public String getinfo() {
        return this.email;
        return this.password;
        return this.username;
    }

    // public String getUser() {
    //     return this.username;
    // }
    
    public static class Account {
        
        private String email;
        private String password;
        private String username;

        public Account (String email, String password) {
            this.email = email;
            this.password = password;
        }

        public Account createUsername (String username) {
            this.username = username;
            return this;
        }
        public Builder build() {
            return new Builder();
        }
    }
}

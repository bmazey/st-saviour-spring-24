public class Builder {

    private String email;
    private String password;
    private String username;

    public void setinfo(String email, String password, String username) {
        this.email = email;
        this. password = password;
        this.username = username;
    }

    // public String getUser() {
    //     return this.username;
    // }

        public Builder AccountInfo (String mail, String code) {
            this.email = mail;
            this.password = code;
            return this;
        }

        public Account createUsername (String username) {
            this.username = username;
            return this;
        }
}

package sample.models;

public class Contato {
    private String whatts, email, twitter;

    public Contato(String whatts, String email, String twitter) {
        this.whatts = whatts;
        this.email = email;
        this.twitter = twitter;
    }

    public String getWhatts() {
        return whatts;
    }

    public void setWhatts(String whatts) {
        this.whatts = whatts;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    @Override
    public String toString() {
        return  "\n   Whattsapp: " + whatts +
                "\n   Email: " + email +
                "\n   Twitter: " + twitter;
    }
}

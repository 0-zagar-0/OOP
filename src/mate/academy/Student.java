package mate.academy;

public class Student extends Person{

    private String favoriteSubject;

    public String getFavoriteSubject() {
        return favoriteSubject;
    }
    public void setFavoriteSubject(String favoriteSubject) {
        this.favoriteSubject = favoriteSubject;
    }

    @Override
    public String getPersonalInfo() {
        return "I am student. My name is: " + getName();
    }
}

public class User {
    private String name;
    private String surname;
    private String fiscalCode;

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.fiscalCode = this.name.charAt(0) + "" + this.surname.charAt(0);
    }

    @Override
    public boolean equals(Object obj) {
        return this.fiscalCode.equals(((User) obj).fiscalCode);
    }
}

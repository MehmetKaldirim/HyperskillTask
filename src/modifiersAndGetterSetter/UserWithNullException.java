package modifiersAndGetterSetter;

class UserWithNullException {
    private String firstName;
    private String lastName;

    public UserWithNullException() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        this.firstName = null != firstName ? firstName : "";
    }

    public void setLastName(String lastName) {
        this.lastName = null != lastName ? lastName : "";
    }

    public String getFullName() {
        String result = String.format("%s %s", firstName, lastName).trim();
        return "".equals(result) ? "Unknown" : result;
    }

    public static void main(String[] args) {
        UserWithNullException katie = new UserWithNullException();
        katie.setFirstName("Katie");
        katie.setLastName(null);
        System.out.println(katie.getFullName());
    }
}
/*Here is the User class with two fields: firstName and lastName.

Implement two null-safety setters and one calculated getter in the following ways:

both setters should accept and set a value if it is not null or an empty string "";
the getter should return the full name of the user by concatenating firstName and
lastName using a single space between them. If one of the parts was not set,
the getter should return another part without additional spaces. If both parts are empty,
 the getter should return the word "Unknown".*/
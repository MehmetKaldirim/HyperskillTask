package modifiersAndGetterSetter;

class Account { //it s not public
/* The class Account has four fields: id, code, balance and enabled.
 Each field has a keyword private to hide the field from direct access
 from other classes. Also, the class has public getters and setters
 for accessing fields through these methods.*/

    private long id;
    private String code;
    private long balance;
    private boolean enabled;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public static void main(String[] args) {
        Account account = new Account();

        //we are initializing the fields
        account.setId(1000);
        account.setCode("62968503812");
        account.setBalance(100_000_000);
        account.setEnabled(true);

        // we are getting the values from Accoun classes
        System.out.println(account.getId());      // 1000
        System.out.println(account.getCode());    // 62968503812
        System.out.println(account.getBalance()); // 100000000
        System.out.println(account.isEnabled());  // true
    }
}
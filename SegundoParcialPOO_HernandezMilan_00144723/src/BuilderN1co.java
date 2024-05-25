public class BuilderN1co implements BuilderMetodoPago {
    String user, password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void setPaypal(String user, String password) {
        this.user = user;
        this.password = password;
        System.out.println(user + " " + password);
    }

    @Override
    public void setN1co(String user, String password, String empresa) {
        this.user = user;
        this.password = password;
        System.out.println( user + ":" +empresa.toLowerCase());
    }
}

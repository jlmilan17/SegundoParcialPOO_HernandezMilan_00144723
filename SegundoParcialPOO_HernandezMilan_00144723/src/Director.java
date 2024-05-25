public class Director {
    private BuilderMetodoPago builder;
    String user, password;
    public void director(BuilderMetodoPago d){
        this.builder = d;
    }

    public void make(String nombre ,String contraseña, String empresa){
        if(nombre.equals("n1co")){
            builder.setN1co(nombre, contraseña, empresa);
        }
        else if(nombre.equals("Paypal"))
            builder.setPaypal(nombre, contraseña);
    }

}

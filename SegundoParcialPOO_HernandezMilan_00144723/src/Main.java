import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BuilderMetodoPago d = new BuilderN1co();
        Director dir = new Director();
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese el metodo de pago: ");
        String opc = sc.nextLine();
        System.out.println("Ingrese el user: ");
        String user = sc.nextLine();
        System.out.println("Ingrese la contraseña: ");
        String contra = sc.nextLine();


        if(opc.equals("n1co")) {
            d.setN1co(user, contra, opc);
            dir.make(user, contra, opc);
        }else {
            d.setPaypal(user, contra);
            dir.make(user, contra, opc);
        }
    }
}
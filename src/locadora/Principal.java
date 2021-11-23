package locadora;

public class Principal {
    public static void main(String[] args) {
        try {
            Menu menu = new Menu();
            LocacaoVeiculos a = new LocacaoVeiculos();
            while(true) {
                menu.menu();
            }
        }catch(NullPointerException n){
            System.out.println("Objeto vazio!");
        }
    }
}
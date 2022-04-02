public class App {
    public static void main(String[] args) throws Exception {
       
        Persona paolo = new Persona("Paolo", "Rossi", "LDMLVR0AD04I350S");
        Persona riccardo = new Persona("Riccardo", "Fantacci", "FNTRCR04L29G752O");
        Persona riccardo1 = new Persona("Riccardo","Fantacci", "FNTRCR04L29G752R");
       

        System.out.println(riccardo1.isOmonimo(riccardo));
        System.out.println(riccardo.toString());
        System.out.println(paolo.toString());
        
    }

}

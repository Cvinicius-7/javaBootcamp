public class Logicos {
    public static void main(String[] args) {
        /*
         * && operador logico E
         * || operador logico OU
         */
        
         boolean cond1 = true;
         boolean cond2 = false;

         if(cond1 && cond2){
            System.out.println("Ambas Verdadeiras");
         }
         
         if(cond1 || cond2){
            System.out.println("uma Verdadeira");
         }
    }
}

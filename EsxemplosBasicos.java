public class EsxemplosBasicos {
    public static void main (String args [] ){
        //System.out.println(1)
        //System.out.println(2)
        //repetição controlada por contador 
        //declarar o contador 
        //int cont = 1;
        //while (cont <= 3){ //booleana
        //    System.out.print(cont);
        //    cont = cont + 1;
        //}
        
        for (int cont = 1;cont <= 3;cont = cont + 1){
            System.out.println(cont);
        }

        int cont = 1;
        do{
            //%d é um placeholder
            System.out.printf("valor da vez: %d\n" , cont);
            cont += 1; // cont = cont + 1;
        }while(cont <= 3);
    }
}





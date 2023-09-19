import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;
import static javax.swing.JOptionPane.showMessageDialog;
public class CalculoDeMedia{
    public static void main (String [] abc){
        // professor ira informar o numero de alunos que te,
        //ele n pode informar um valor menos ou igual a 0
        //para cada aluno, vamos calcular a média
        int n;
        do{
            n = parseInt(showInputDialog("Quantos alunos voce tem?"));            
        }
        while(n <= 0);
        //cont++ = cont ++1 = cont = cont + 1;
        for(int cont = 1;cont <= n;cont ++){
            double A1, A2, A3;
            do{
                 A1 = parseDouble(showInputDialog("Digite o valor da A1"));               
            }while(A1 < 0 || A1 > 30);
            do{
                 A2 = parseDouble(showInputDialog("Digite o valor da A2"));
            }while(A2 < 0 || A2 > 30);
            do{
                A3 = parseDouble(showInputDialog("Digite o valor da A3"));
            }while(A3 < 0 || A3 > 40);
            double media = A1 + A2 + A3;

            showMessageDialog(null, "media: " + media);
            if(media >= 70){
                showMessageDialog(null, "Aprovado");
            }
            else{
                showMessageDialog (null, "De recuperacao");
            }

        }
    }
}



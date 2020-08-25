
package projeto;

import javax.swing.JOptionPane;
import projeto.mensagem.Mensagem;
import projeto.mensagem.MensagemFactory;


public class Main {

    
    public static void main(String[] args) {
        
     String texto = JOptionPane.showInputDialog(null);
        
     Mensagem mensagem = MensagemFactory.getMensagem(1);
     mensagem.enviar(texto);
        
    }
    
}

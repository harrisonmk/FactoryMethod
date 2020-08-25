package projeto.mensagem;

public class MensagemFactory {

    public static Mensagem getMensagem(int i) {

        switch (i) {
            case 1:
                return new MensagemSMS();
            case 2:
                return new MensagemEmail();
            default:
                return new MensagemSMS();
        }

    }

}

package excecao;

public class ChecadaVSNaoChecada {
    public static void main(String[] args) {
        geraErro1();
        geraErro2();
        System.out.println("FIM");
    }

    // Não checada ou não verificada
    static void geraErro1(){
        throw new RuntimeException("Ocorreu um erro bem legal #01");
    }

    // Checada
    static void geraErro2() {
        try {
            throw new Exception("Ocorreu um erro bem legal #02");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package excecao.personalizada.checada;

import streams.Aluno;

public class TesteValidações {
    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno("ana", -7);;
            Validar.aluno(aluno);
        }catch (StringVaziaException e){
            System.out.println(e.getMessage());
        }catch (NumeroForaIntervaloException e){
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

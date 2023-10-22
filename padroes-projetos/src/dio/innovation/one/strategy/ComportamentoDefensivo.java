package dio.innovation.one.strategy;

public class ComportamentoDefensivo implements Comportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se Defensivamente");
    }
}
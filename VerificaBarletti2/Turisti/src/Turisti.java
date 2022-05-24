public class Turisti extends Thread {
    protected String nome;
    protected Museo m;


    public Turisti(String nome, Museo m) {
        this.nome = nome;
        this.setName(nome);
        this.m = m;
    }
    @Override
    public void run(){
        m.enter();
        m.attesa();
    }
}

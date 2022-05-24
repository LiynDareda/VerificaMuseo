public class App {
    public static void main(String[] args) throws Exception {
        Museo m = new Museo();
        Thread t1 = new Turisti("Giovanni", m);
        Thread t2 = new Turisti("Giada", m);
        Thread t3 = new Turisti("Kayn", m);
        Thread t4 = new Turisti("Vann", m);
        Thread t5 = new Turisti("Biagi", m);
        Thread t6 = new Turisti("Fede", m);
        Thread t7 = new Turisti("Cuppo", m);
        Thread t8 = new Turisti("Eug", m);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();
        t8.join();
    }
}

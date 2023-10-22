package dio.innovation.one;

import dio.innovation.one.facade.Facade;
import dio.innovation.one.single.SingletonEager;
import dio.innovation.one.single.SingletonLazy;
import dio.innovation.one.single.SingletonLazyHolder;
import dio.innovation.one.strategy.ComportamentoAgressivo;
import dio.innovation.one.strategy.ComportamentoDefensivo;
import dio.innovation.one.strategy.ComportamentoNormal;
import dio.innovation.one.strategy.Comportamento;
import dio.innovation.one.strategy.Robo;


public class Main {

    public static void main(String[] args) {

        //Singleton

        System.out.println("=========================");
        System.out.println("--------SINGLETON--------");
        System.out.println("=========================");

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonLazy lazy2 = SingletonLazy.getInstancia();
        System.out.println(lazy2);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        SingletonEager eager2 = SingletonEager.getInstancia();
        System.out.println(eager2);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        SingletonLazyHolder holder2 = SingletonLazyHolder.getInstancia();
        System.out.println(holder2);


        //Strategy

        System.out.println("=========================");
        System.out.println("--------STRATEGY---------");
        System.out.println("=========================");

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        //Facade

        System.out.println("=========================");
        System.out.println("---------FACADE----------");
        System.out.println("=========================");

        Facade facade = new Facade();
        facade.migrarClient("Bob Jhon", "63800-000");
    }

}
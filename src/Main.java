

import com.mrcruz.facade.Facade;
import com.mrcruz.singleton.SingletonEager;
import com.mrcruz.singleton.SingletonLazy;
import com.mrcruz.singleton.SingletonLazyHolder;
import com.mrcruz.strategy.Comportamento;
import com.mrcruz.strategy.ComportamentoAgressivo;
import com.mrcruz.strategy.ComportamentoDefensivo;
import com.mrcruz.strategy.ComportamentoNormal;
import com.mrcruz.strategy.Robo;

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

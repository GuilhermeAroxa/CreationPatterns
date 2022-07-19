package com.example.demo.singleton;


//1.2 Lazy Singleton
//É carregado na primeira instanciação da classe
//Não é thread safe da primeira forma que foi comentada

public class SingletonCourseLazy {
	
//	private static SingletonCourseLazy instance = null;
//	
//	private SingletonCourseLazy(){}
//	
//	public static SingletonCourseLazy getInstance() {
//		if (instance == null) {
//			instance = new SingletonCourseLazy();
//		}
//		return instance;
//	}

	//	https://pt.stackoverflow.com/questions/116047/qual-a-finalidade-do-transient-e-volatile-no-java
	//	Um atributo volátil tem garantia de que o valor atualizado estará sempre disponível para outras threads, sendo gravado na memória principal assim que atualizado, de forma atômica.
	private static volatile SingletonCourseLazy instance = null;
	
	private SingletonCourseLazy(){
		if (instance != null) {
			throw new RuntimeException("Utilize o getInstance para criar");
		}
	}
	
	public static SingletonCourseLazy getInstance() {
		if (instance == null) {
			// http://disciplinas.tecnico.ulisboa.pt/leic-sod/2017-2018/labs/01-tools/java-synch/index.html
			// A primitiva synchronized é aplicada a métodos do objeto e oferece um mecanismo de exclusão mútua a um recurso partilhado, que previne a reordenação do código pelo compilador. Um método sincronizado adquire o trinco do objeto no início de execução e liberta-o no fim.
			synchronized(SingletonCourseLazy.class){
				if(instance == null) {
					instance = new SingletonCourseLazy();									
				}
			}
		}
		return instance;
	}
}
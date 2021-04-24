package oo.encapsulamento.casa.b;

import oo.encapsulamento.casa.a.Ana;

public class Pedro extends Ana {
	void testeAcessos() {
		Ana ana = new Ana();
//		System.out.println(ana.segredo);
//		System.out.println(ana.facoDentroDeCasa);
		System.out.println(super.formaDeFalar); // Mesmo sendo protected precisa do super para acessar
		System.out.println(super.todosSabem);
	}
}

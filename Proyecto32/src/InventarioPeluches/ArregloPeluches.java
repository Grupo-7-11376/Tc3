package InventarioPeluches;

import java.util.ArrayList;

public class ArregloPeluches {

	private ArrayList<Peluches>pelu;
	public ArregloPeluches() {
		pelu=new ArrayList<Peluches>();
	Adicionar(new Peluches(100,"Eevee",20,50.0));
	Adicionar(new Peluches(110,"Espeon",20,40.0));
	Adicionar(new Peluches(120,"Glaceon",20,80.0));
	Adicionar(new Peluches(130,"Sylveon",20,70.0));
	Adicionar(new Peluches(140,"Jolteon",20,10.0));
	Adicionar(new Peluches(150,"Vaporeon",20,70.0));
	Adicionar(new Peluches(160,"Leafeon",20,100.0));
	Adicionar(new Peluches(170,"Flareon",20,49.0));
	Adicionar(new Peluches(180,"umbreon",20,60.0));
	}
	
	public void Adicionar(Peluches x) {
		pelu.add(x);
	}
	public int Tamaño() {
	    return pelu.size();
	}
	
}

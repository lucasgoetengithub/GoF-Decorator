package com.estudo.gof;

public class Decor {
	public static void main(String[] args) {
		combine();
	}

	public static void combine() {
		new ErvilhaVerde(new ErvilhaVermelha());
		new ErvilhaAmarela(new ErvilhaVerde());
		new ErvilhaAmarela();
	}
}

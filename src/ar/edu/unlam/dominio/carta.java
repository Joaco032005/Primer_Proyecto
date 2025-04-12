package ar.edu.unlam.dominio;

public class carta {
int salud;

public carta() {
	this.salud = 100;
}
public int getsaludDeCarta() {
	return this.salud;
}
public int danioACarta(int danio) {
	this.salud -= danio;
	return salud;
}
}

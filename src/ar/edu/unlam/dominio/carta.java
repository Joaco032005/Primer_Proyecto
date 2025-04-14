package ar.edu.unlam.dominio;

public class carta {
int salud;
int pocionDeSalud;

public carta() {
	this.salud = 100;
	this.pocionDeSalud = 50;
	
}
public int getsaludDeCarta() {
	return this.salud;
}
public int danioACarta(int danio) {
	this.salud -= danio;
	return salud;
}
public void curarse() {
	if(this.salud < 100) {
		salud+=this.pocionDeSalud;
	}
}
public void ataqueFuerte() {
    this.salud = 0;
}
}

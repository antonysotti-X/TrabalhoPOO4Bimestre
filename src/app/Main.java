package app;

import java.util.List;
import java.util.function.Predicate;

import model.Disponibilidade;
import model.FormaPagamento;
import model.Hospede;
import model.Hotel;
import model.Quarto;
import model.Reserva;
import model.StatusReserva;
import model.Tipo;
import model.TipoHospede;
import utils.ComparadorPorNumero;
import utils.ComparadorPorPreco;
import utils.FiltroPorDisponibilidade;

public class Main {

	public static void main(String[] args) {
		Quarto q1 = new Quarto(101, 180.0, Tipo.SIMPLES, Disponibilidade.DISPONIVEL);
		Quarto q2 = new Quarto(105, 110.0, Tipo.DUPLO, Disponibilidade.OCUPADO);
		Quarto q3 = new Quarto(103, 500.0, Tipo.COBERTURA, Disponibilidade.DISPONIVEL);
		Quarto q4 = new Quarto(104, 280.0, Tipo.SUITE, Disponibilidade.DISPONIVEL);
		Quarto q5 = new Quarto(102, 250.0, Tipo.SIMPLES, Disponibilidade.MANUTENCAO);

		Hotel hotel = new Hotel();
		
		hotel.adicionarQuarto(q1);
		hotel.adicionarQuarto(q2);
		hotel.adicionarQuarto(q3);
		hotel.adicionarQuarto(q4);
		hotel.adicionarQuarto(q5);
		
		Tipo t = Tipo.DUPLO;
		
		for(Quarto q : hotel.filtrar(q -> q.getTipo() == t && q.getValorDiaria() < 200.0)) {
			System.out.println(q);
		}
	}

}

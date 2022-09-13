package cabral.ignacio;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class CallcenterTest {
	
	Empresa miEmpresa = new Empresa();
	
	Candidato candidato1 = new Candidato("Ignacio","Cabral","ignacasdio@s.com","Luis Paz 21232","A234","Casanova","Buenos Aires");
	Candidato candidato2 = new Candidato("Pedro","Gonzalez","asd3acio@s.com","Libertador 2223","B234","Casanova","Buenos Aires");
	Candidato candidato3 = new Candidato("Joaquin","Perez","bve232323o@s.com","Cordoba 24442","C234","Casanova","Buenos Aires");
	Candidato candidato4 = new Candidato("Fabricio","Bracal","izzsd@s.com","Pueyrredon 5552","D234","Casanova","Buenos Aires");
	Candidato candidato5 = new Candidato("Lucas","Pepo","ad23ssh@s.com","Vidal 112","E234","Casanova","Buenos Aires");
	
	
	
	@Test
	public void seEligeUnCandidatoALlamar() {
		
		
		miEmpresa.getListaDeCandidatos().add(candidato1);
		miEmpresa.getListaDeCandidatos().add(candidato2);
		miEmpresa.getListaDeCandidatos().add(candidato3);
		miEmpresa.getListaDeCandidatos().add(candidato4);
		miEmpresa.getListaDeCandidatos().add(candidato5);
		
		
		// se selecciona al candidato aleatoriamente
		Candidato candidato = miEmpresa.buscarAlCandidato();
//		System.out.println(candidato.getApellido());
		Assert.assertNotNull(candidato);
	}
	
	@Test
	public void elClienteLlamadoDeseaConvertirseEnCliente() {
		miEmpresa.getListaDeCandidatos().add(candidato1);
		miEmpresa.getListaDeCandidatos().add(candidato2);
		miEmpresa.getListaDeCandidatos().add(candidato3);
		miEmpresa.getListaDeCandidatos().add(candidato4);
		miEmpresa.getListaDeCandidatos().add(candidato5);
		
		// se selecciona al candidato aleatoriamente
		Candidato candidato = miEmpresa.buscarAlCandidato();
		
		candidato.llamadaExitosa(Boolean.TRUE);
		
		Assert.assertTrue(candidato.getEsCliente());
	}
	
	@Test
	public void elClienteNoDeseaSerLlamadoOtraVez() {
		miEmpresa.getListaDeCandidatos().add(candidato1);
		miEmpresa.getListaDeCandidatos().add(candidato2);
		miEmpresa.getListaDeCandidatos().add(candidato3);
		miEmpresa.getListaDeCandidatos().add(candidato4);
		miEmpresa.getListaDeCandidatos().add(candidato5);
		
		// se selecciona al candidato aleatoriamente
		Candidato candidato = miEmpresa.buscarAlCandidato();
		
		candidato.noLlamarNuevamente(Boolean.FALSE);
		
		Assert.assertFalse(candidato.getLlamarNuevamente());
	}
	
	
	@Test
	public void elCandidatoDeseaSerCliente_NoDeseaVolverASerLlamadoYseAnotanObservacionesSobreLaLlamada() {
		miEmpresa.getListaDeCandidatos().add(candidato1);
		miEmpresa.getListaDeCandidatos().add(candidato2);
		miEmpresa.getListaDeCandidatos().add(candidato3);
		miEmpresa.getListaDeCandidatos().add(candidato4);
		miEmpresa.getListaDeCandidatos().add(candidato5);
		
		// se selecciona al candidato aleatoriamente
		Candidato candidato = miEmpresa.buscarAlCandidato();
		
		candidato.llamadaExitosa(Boolean.TRUE);
		candidato.noLlamarNuevamente(Boolean.FALSE);
		candidato.anotaObservaciones("El cliente afirma que sera cliente por 2 anios");
		
		
//		for(Candidato candi : miEmpresa.getListaDeCandidatos()) {
//			System.out.println(candi.getObservaciones());
//		}
	}

}

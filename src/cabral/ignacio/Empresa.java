package cabral.ignacio;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Empresa {
	
	private List<Candidato> listaDeCandidatos = new ArrayList<>();

	public List<Candidato> getListaDeCandidatos() {
		return listaDeCandidatos;
	}

	public void setListaDeCandidatos(List<Candidato> listaDeCandidatos) {
		this.listaDeCandidatos = listaDeCandidatos;
	}
	
	public Candidato buscarAlCandidato() {
		List<Candidato> lista = getListaDeCandidatos();
		List<Candidato> listaFiltrada = new ArrayList<>();
		for(Candidato candidato : listaDeCandidatos) {
			if(!candidato.getEsCliente() && candidato.getLlamarNuevamente()) {
				listaFiltrada.add(candidato);
			}
		}
		Candidato candidatoSeleccionado = listaFiltrada.get(new Random().nextInt(listaFiltrada.size()));
		return candidatoSeleccionado;
	}
	
	

}

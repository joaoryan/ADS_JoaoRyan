package state.artigo;

import java.time.LocalDate;

public class EstadoRevisando implements Estado {

	private Artigo artigo;

	public EstadoRevisando(Artigo artigo) {
		this.artigo = artigo;
	}

	@Override
	public void publicar() {

		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();

		if (gerenteDeSeguranca.ehUsuarioModerador()) {
			this.artigo.transitarEstadoPara(new EstadoAprovado(artigo));
			this.artigo.getLogHistorico().add("Transitado para aprovado em " + LocalDate.now());
			return;
		} else {
			throw new RuntimeException("Usuario não tem permissão");
		}

	}

	@Override
	public void reprovar() {

		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();

		if (gerenteDeSeguranca.ehUsuarioModerador()) {
			this.artigo.transitarEstadoPara(new EstadoRascunho(artigo));
			this.artigo.getLogHistorico().add("Transitado para rascunho em " + LocalDate.now());
			return;
		} else {
			throw new RuntimeException("Usuario não tem permissão");
		}

	}

}

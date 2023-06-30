package state.artigo;

public class EstadoAprovado implements Estado {
	public EstadoAprovado(Artigo artigo) {
		this.artigo = artigo;
	}

	@Override
	public void publicar() {

	}

	@Override
	public void reprovar() {

	}

}

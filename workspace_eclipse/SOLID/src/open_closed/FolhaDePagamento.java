package open_closed;

public class FolhaDePagamento {

	Double totalFolha = 0.0;

	public void calcular(Remuneravel r) {
		this.totalFolha += r.getRemuneracao();
	}

	public Double getTotalFolha() {
		return totalFolha;
	}

}

package builder.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarroBuilderFluentTest {

	@Test
	void dadoPartesValidas_quandoGetCarro_entaoCarroEhConstruido() {
		Motor motorVTEC = new Motor();
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas = { portaMotorista, portaPassageiro };
		ComputadorBordo cbSiemens = new ComputadorBordo();
		FreioABS freioBosch = new FreioABS();
		Carro carroPronto = new CarroBuilderFluente()
				.buildMotor(motorVTEC)
				.buildPortas(portas)
				.buildComputadorBordo(cbSiemens)
				.buildFreioABS(freioBosch)
				.GetCarro();
		assertNotNull(carroPronto);
		assertNotNull(carroPronto.getM());
		assertNotNull(carroPronto.getPortas());
		assertTrue(carroPronto.getPortas().length == 2);
		assertNotNull(carroPronto.getCb());
		assertNotNull(carroPronto.getF());
	}

}

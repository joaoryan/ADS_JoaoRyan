package builder.carro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarroBuilderTest {

	@Test
	void dadoPartesValidas_quandoGetCarro_entaoCarroEhConstruido() {
		Motor motorVTEC = new Motor();
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas = { portaMotorista, portaPassageiro };
		ComputadorBordo cbSiemens = new ComputadorBordo();
		FreioABS freioBosch = new FreioABS();
		CarroBuilder builder = new CarroBuilder();
		builder.buildMotor(motorVTEC);
		builder.buildPortas(portas);
		builder.buildComputadorBordo(cbSiemens);
		builder.buildFreioABS(freioBosch);
		Carro carroPronto = builder.GetCarro();
		assertNotNull(carroPronto);
		assertNotNull(carroPronto.getM());
		assertNotNull(carroPronto.getPortas());
		assertTrue(carroPronto.getPortas().length == 2);
		assertNotNull(carroPronto.getCb());
		assertNotNull(carroPronto.getF());
	}

	@Test
	void dadoPortasInvalidas_quandoGetCarro_entaoException() {
		Motor motorVTEC = new Motor();
		Porta[] portas = {};
		ComputadorBordo cbSiemens = new ComputadorBordo();
		FreioABS freioBosch = new FreioABS();
		CarroBuilder builder = new CarroBuilder();
		builder.buildMotor(motorVTEC);
		builder.buildPortas(portas);
		builder.buildComputadorBordo(cbSiemens);
		builder.buildFreioABS(freioBosch);
		try {
			builder.GetCarro();
			fail();
		} catch (Exception e) {
		}

	}

	@Test
	void dadoSemMotor_quandoGetCarro_entaoException() {
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas = { portaMotorista, portaPassageiro };
		ComputadorBordo cbSiemens = new ComputadorBordo();
		FreioABS freioBosch = new FreioABS();

		CarroBuilder builder = new CarroBuilder();
		builder.buildPortas(portas);
		builder.buildComputadorBordo(cbSiemens);
		builder.buildFreioABS(freioBosch);
		try {
			builder.GetCarro();
			fail();
		} catch (Exception e) {
		}

	}

}
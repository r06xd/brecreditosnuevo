package com.relative.brecreditosnuevos.objetosnegocio;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class OpcionSimulada implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Plazo")
	private java.lang.Integer plazo;
	@org.kie.api.definition.type.Label("MontoCredito")
	private Double montoCredito;
	@org.kie.api.definition.type.Label("RiesgoAcumulado")
	private Double riesgoAcumulado;
	@org.kie.api.definition.type.Label("ValorDesembolso")
	private Double valorDesembolso;
	@org.kie.api.definition.type.Label("Cuota")
	private Double cuota;

	public OpcionSimulada() {
	}

	public java.lang.Integer getPlazo() {
		return this.plazo;
	}

	public void setPlazo(java.lang.Integer plazo) {
		this.plazo = plazo;
	}

	public java.lang.Double getMontoCredito() {
		return this.montoCredito;
	}

	public void setMontoCredito(java.lang.Double montoCredito) {
		this.montoCredito = montoCredito;
	}

	public java.lang.Double getRiesgoAcumulado() {
		return this.riesgoAcumulado;
	}

	public void setRiesgoAcumulado(java.lang.Double riesgoAcumulado) {
		this.riesgoAcumulado = riesgoAcumulado;
	}

	public java.lang.Double getValorDesembolso() {
		return this.valorDesembolso;
	}

	public void setValorDesembolso(java.lang.Double valorDesembolso) {
		this.valorDesembolso = valorDesembolso;
	}

	public java.lang.Double getCuota() {
		return this.cuota;
	}

	public void setCuota(java.lang.Double cuota) {
		this.cuota = cuota;
	}

	public OpcionSimulada(java.lang.Integer plazo,
			java.lang.Double montoCredito, java.lang.Double riesgoAcumulado,
			java.lang.Double valorDesembolso, java.lang.Double cuota) {
		this.plazo = plazo;
		this.montoCredito = montoCredito;
		this.riesgoAcumulado = riesgoAcumulado;
		this.valorDesembolso = valorDesembolso;
		this.cuota = cuota;
	}

}
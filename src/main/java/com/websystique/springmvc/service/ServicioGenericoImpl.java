package com.websystique.springmvc.service;

import org.springframework.stereotype.Service;

@Service
public class ServicioGenericoImpl implements ServicioGenerico {

	
	
	/**
	 * @author Cristhian Acurio Implementación para obtener los 3 digitos que
	 *         identifan el codigo del proyecto 202=Café y Cacao 204 = SISCOMTEC
	 * @param codigoAval
	 * @return String
	 */

	@Override
	public String getCodigoProyecto(Long codigoAval) {
		String codigoProyecto = null;
		char[] nums = codigoAval.toString().toCharArray();
		int j = 0;
		for (char c : nums) {
			j++;
			if (codigoProyecto == null) {
				codigoProyecto = String.valueOf(c);
			} else {
				codigoProyecto = codigoProyecto + c;
				if (j == 3) {
					return codigoProyecto;
				}
			}
		}
		return codigoProyecto;
	}

	/**
	 * Hologación de cultivos de cafe y cacao del RNA con el BanEcuador
	 * 
	 * @author Cristhian Acurio
	 */

	@Override
	public String homologarCodigosBanEcuadorPerenne(Integer semId) {
		String codigoHomologado = "";
		switch (semId) {
		case 281:
			codigoHomologado = "008043"; // CAFE ARABIGO FORMACION CCMA
			break;
		case 282:
			codigoHomologado = "008044"; // CAFE ARABIGO MANTENIMIENTO CCMA
			break;

		case 283:
			codigoHomologado = "008045"; // CAFE ROBUSTA FORMACION CCMA
			break;
		case 284:
			codigoHomologado = "008046"; // CAFE ROBUSTA MANTENIMIENTO CCMA
			break;
		case 285:
			codigoHomologado = "008033"; // CACAO FORMACION CCMA
			break;
		case 286:
			codigoHomologado = "008034"; // CACAO MANTENIMIENTO CCMA
			break;

		default:
			break;
		}

		return codigoHomologado;
	}

	@Override
	public String homologarCodigoBanEcuador(int culId) {
		String codigoCultivoBanEcuador = null;
		switch (culId) {
		case 1:
			codigoCultivoBanEcuador = "001061";
			break;
		case 2:
			codigoCultivoBanEcuador = "001021";
			// voAval.setCodCulBanEcuador("001011"); //ARROZ DE VERANO CCMA
			break;
		default:
			break;
		}
		return codigoCultivoBanEcuador;
	}

}

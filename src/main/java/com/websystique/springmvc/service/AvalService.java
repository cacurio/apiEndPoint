//package com.websystique.springmvc.service;
//
//import java.text.SimpleDateFormat;
//
//import org.apache.log4j.Logger;
//import org.hibernate.Session;
//
//import com.websystique.springmvc.dao.AvalDaoImpl;
//import com.websystique.springmvc.model.AvalSiscomtec;
//import com.websystique.springmvc.vo.RespuestaConsultaAval;
//import com.websystique.springmvc.vo.VoAval;
//import com.websystique.springmvc.vo.voDatosActulizacionCredito;
//
//public class AvalService {
//
//	final static Logger logger = Logger.getLogger(AvalService.class);
//	private AvalDaoImpl avalDao;
//	SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
//
//	public AvalService(Session session) {
//		avalDao = new AvalDaoImpl(session);
//	}
//
//	public RespuestaConsultaAval consultaAval(String cedula, int numAval) {
//		return avalDao.consulaAval(cedula, numAval);
//	}
//
//	public boolean updateAvalEstadoCredito(voDatosActulizacionCredito parametros) {
//		try {
//			AvalSiscomtec objAval = new AvalSiscomtec();
//			if (parametros.getEstadoCredito().contentEquals("Aprobado")
//					|| parametros.getEstadoCredito().contentEquals("Rechazado")) {
//				objAval = avalDao.getAval(parametros.getNumCedula(), parametros.getNumAval());
//				if (objAval.getAvlId() > 0) {
//					objAval.setAvalEstadoProceso(parametros.getEstadoCredito());
//					objAval.setAvlBanFechaProceso(formatter.parse(parametros.getFechaProceso()));
//					avalDao.updateAvalEstadoCredito(objAval);
//					return true;
//				}
//			}else {
//				return false;
//			}
//		} catch (Exception e) {
//			logger.info(e.getMessage());
//			return false;
//		}
//		return false;
//	}
//
//	public void closeSession() {
//		avalDao.closeSession();
//	}
//
//}

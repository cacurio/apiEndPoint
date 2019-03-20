//package com.websystique.springmvc.service;
//
//import java.sql.Timestamp;
//import java.time.LocalDate;
//import java.time.Period;
//import java.time.format.DateTimeFormatter;
//import java.util.Date;
//import java.util.List;
//
//import org.apache.log4j.Logger;
//import org.hibernate.Session;
//import org.hibernate.internal.util.beans.BeanInfoHelper.ReturningBeanInfoDelegate;
//import org.hibernate.loader.custom.Return;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.websystique.springmvc.dao.BeneficiarioDaoImpl;
//import com.websystique.springmvc.model.Beneficiario;
//import com.websystique.springmvc.model.Ubicacion;
//import com.websystique.springmvc.service.endpoint.ServiceEndPointRegistoCivil;
//import com.websystique.springmvc.util.HibernateUtil;
//import com.websystique.springmvc.vo.VoBeneficiario;
//import com.websystique.springmvc.vo.VoBeneficiarioResponse;
//import com.websystique.springmvc.vo.VoRespuestaRegistroCivil;
//
//public class BeneficiarioService {
//
//	final static Logger logger = Logger.getLogger(BeneficiarioService.class);
//
//	private BeneficiarioDaoImpl beneficiarioDao;
//
//	private ServiceEndPointRegistoCivil servicioRegistoCivil;
//
//	public BeneficiarioService(Session session) {
//		beneficiarioDao = new BeneficiarioDaoImpl(session);
//	}
//
//	public VoBeneficiarioResponse save(VoBeneficiario voBeneficiario) {
//		Beneficiario beneficiario = new Beneficiario();
//		Beneficiario beneficiario1 = new Beneficiario();
//		VoBeneficiarioResponse voBeneficiarioResponse = new VoBeneficiarioResponse();
//		if (!validarBeneficiarioRegistrado(voBeneficiario.getCedula())) {
//			if(validarMayorEdad(voBeneficiario.getFechaNacimiento())) {
//				beneficiario.setBen_apellido(voBeneficiario.getApellidos());
//				beneficiario.setBenCelular(voBeneficiario.getCelular());
//				beneficiario.setBenCorreo(voBeneficiario.getCorreo());
//				beneficiario.setBenDireccion(voBeneficiario.getDireccion());
//				beneficiario.setBenEliminado(0);
//				beneficiario.setBenEstado(11);
//				beneficiario.setBenIdentificacion(voBeneficiario.getCedula());
//				beneficiario.setBenNombre(voBeneficiario.getNombres());
//				beneficiario.setBenNombres(voBeneficiario.getNombresApellidosCompletos());
//				beneficiario.setBenOrigen("");
//				beneficiario.setBenRegFecha(new Timestamp(new Date().getTime()));
//				beneficiario.setBenTelefono(voBeneficiario.getTelefono());
//				beneficiario.setCatIdTipoIdentificacion(18);
//				beneficiario.setCatIdTipoNac(27);
//				beneficiario.setCatIdTipoOrgPer(68);
//				beneficiario.setOrgIdBen(36);
//				beneficiario.setUbiId(getUbiID(voBeneficiario.getCodInecParroquia()));
//				beneficiario.setBenRegUsu(0);
//				beneficiarioDao.save(beneficiario);
//				voBeneficiarioResponse.setBenId(beneficiario.getBenId());
//				voBeneficiarioResponse.setObservacion("Beneficiario registrado exitosamente");
//			}else {
//				voBeneficiarioResponse.setBenId(beneficiario1.getBenId());
//				voBeneficiarioResponse.setObservacion("Registro fallido, ciudadano es menor de edad");
//			}
//			
//
//		} else {
//			voBeneficiarioResponse.setBenId(beneficiario1.getBenId());
//			voBeneficiarioResponse.setObservacion("Beneficiario registrado anteriormente");
//		}
//
//		return voBeneficiarioResponse;
//
//	}
//
//	private int getUbiID(String ubiCodInec) {
//		Ubicacion ubicacion = new Ubicacion();
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		UbicacionService ubicacionService = new UbicacionService(session);
//		ubicacion = ubicacionService.findUbiId(ubiCodInec);
//		int ubiID;
//		if (ubicacion != null) {
//			ubiID = ubicacion.getUbiId();
//		} else {
//			ubiID = 0;
//		}
//		ubicacionService.closeSession();
//		return ubiID;
//	}
//
//	public boolean validarBeneficiarioRegistrado(String benIdentificacion) {
//		Beneficiario beneficiario = new Beneficiario();
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		BeneficiarioService beneficiarioService = new BeneficiarioService(session);
//		beneficiario = beneficiarioDao.findBeneficiario(benIdentificacion);
//		beneficiarioService.closeSession();
//		if (beneficiario != null) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//
//	public VoBeneficiarioResponse findByBenIdentificacion(String benIdentificacion) {
//		VoBeneficiarioResponse voBeneficiarioResponse = new VoBeneficiarioResponse();
//		Beneficiario beneficiario = new Beneficiario();
//		beneficiario = beneficiarioDao.findByBenIdentificacion(benIdentificacion);
//		if (beneficiario != null ) {
//			
//			voBeneficiarioResponse.setBenId(beneficiario.getBenId());
//			voBeneficiarioResponse.setObservacion("Beneficiario registrado");
//		} else {
//			voBeneficiarioResponse.setBenId(0);
//			voBeneficiarioResponse.setObservacion("Beneficiario no registrado");
//		}
//
//		return voBeneficiarioResponse;
//	}
//
//	private boolean validarMayorEdad(String fechaNacimiento) {
//		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		LocalDate fechaNac = LocalDate.parse(fechaNacimiento, fmt);
//		LocalDate ahora = LocalDate.now();
//
//		Period periodo = Period.between(fechaNac, ahora);
//		System.out.printf("Tu edad es: %s años, %s meses y %s días", periodo.getYears(), periodo.getMonths(),
//				periodo.getDays());
//
//		if (periodo.getYears() >= 18) {
//			return true;
//		} else {
//			return false;
//		}
//
//	}
//
//	public void closeSession() {
//		beneficiarioDao.closeSession();
//	}
//}

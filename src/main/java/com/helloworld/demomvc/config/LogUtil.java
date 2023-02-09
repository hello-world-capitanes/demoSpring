package com.helloworld.demomvc.config;

import com.helloworld.demomvc.DemomvcApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LogUtil {

	public static void writeLog(String level, String mensaje, Exception e) {
		Logger logger = LoggerFactory.getLogger(DemomvcApplication.class);
		String mensajeCompleto = String.format("[%s] %s", level, mensaje);

		switch (level) {
			case "TRACE":
				logger.trace(mensajeCompleto);
				break;
			case "INFO":
				logger.info(mensajeCompleto);
				break;
			case "ERROR":
				if (e != null) {
					logger.error(mensajeCompleto, e);
				} else {
					logger.error(mensajeCompleto);
				}
				break;
			default:
				logger.debug(mensajeCompleto);
		}
	}
}

package Logging;

import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.SimpleFormatter;

public class IssueLogger {
	FileHandler fileHandler;
	LogManager logmanager;
	Logger logger;
	
	public IssueLogger(String fileName) {
		try {
			logmanager = LogManager.getLogManager();
			logger = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			fileHandler = new FileHandler(fileName);
			fileHandler.setFormatter(new SimpleFormatter());
			 logger.addHandler(fileHandler);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void log(String lognote) {
		logger.info(lognote);
	}

}

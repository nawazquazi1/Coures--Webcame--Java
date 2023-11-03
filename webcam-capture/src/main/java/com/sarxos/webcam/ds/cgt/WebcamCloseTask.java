package com.sarxos.webcam.ds.cgt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sarxos.webcam.WebcamDevice;
import com.sarxos.webcam.WebcamDriver;
import com.sarxos.webcam.WebcamTask;


public class WebcamCloseTask extends WebcamTask {

	private static final Logger LOG = LoggerFactory.getLogger(WebcamCloseTask.class);

	public WebcamCloseTask(WebcamDriver driver, WebcamDevice device) {
		super(driver, device);
	}

	public void close() throws InterruptedException {
		process();
	}

	@Override
	protected void handle() {

		WebcamDevice device = getDevice();
		if (!device.isOpen()) {
			return;
		}

		LOG.info("Closing {}", device.getName());

		device.close();
	}
}

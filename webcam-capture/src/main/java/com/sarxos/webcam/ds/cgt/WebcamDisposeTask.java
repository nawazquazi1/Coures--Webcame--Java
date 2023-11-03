package com.sarxos.webcam.ds.cgt;

import com.sarxos.webcam.WebcamDevice;
import com.sarxos.webcam.WebcamDriver;
import com.sarxos.webcam.WebcamTask;


/**
 * Dispose webcam device.
 * 
 * @author Bartosz Firyn (sarxos)
 */
public class WebcamDisposeTask extends WebcamTask {

	public WebcamDisposeTask(WebcamDriver driver, WebcamDevice device) {
		super(driver, device);
	}

	public void dispose() throws InterruptedException {
		process();
	}

	@Override
	protected void handle() {
		getDevice().dispose();
	}
}

package com.sarxos.webcam.ds.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.sarxos.webcam.WebcamDevice;
import com.sarxos.webcam.WebcamDriver;


public class DummyDriver implements WebcamDriver {

	private static final List<WebcamDevice> DEVICES = new ArrayList<WebcamDevice>(Arrays.asList(new WebcamDevice[] {
		new DummyDevice(),
		new DummyDevice(),
		new DummyDevice(),
		new DummyDevice(),
	}));

	private static DummyDriver instance = null;

	public DummyDriver() {
		if (instance == null) {
			instance = this;
		}
	}

	public static DummyDriver getInstance() {
		return instance;
	}

	@Override
	public List<WebcamDevice> getDevices() {
		return DEVICES;
	}

	@Override
	public boolean isThreadSafe() {
		return false;
	}
}

package org.sdci.sdk.models;

public class Counter extends Metric{
	public Counter(String name, int value, boolean enabled) {
		this.metricName=name;
		this.value=value;
		this.enabled=enabled;
	}
	
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
}

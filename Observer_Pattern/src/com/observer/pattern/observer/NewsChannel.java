package com.observer.pattern.observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class NewsChannel implements PropertyChangeListener {

	private String news;
	private String channel;
	
	public NewsChannel(String channel) {
		super();
		this.channel = channel;
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
        this.news = ((String) evt.getNewValue());	
        System.out.println(this);
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	@Override
	public String toString() {
		return "NewsChannel [news=" + news + ", channel=" + channel + "]";
	}
}

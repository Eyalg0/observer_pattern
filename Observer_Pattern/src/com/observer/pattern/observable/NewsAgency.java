package com.observer.pattern.observable;

import java.beans.PropertyChangeSupport;
import java.util.HashMap;
import java.util.Map;

import com.observer.pattern.observer.NewsChannel;

public class NewsAgency {
	private Map<String, String> newsTopics;
	private PropertyChangeSupport support;

	public NewsAgency() {
		super();
		newsTopics = new HashMap<String, String>();
		support = new PropertyChangeSupport(this);
	}
	
	public void addPropertyChangeListener(NewsChannel newsChannel) {
        support.addPropertyChangeListener(newsChannel.getChannel(), newsChannel);
    }

    public void removePropertyChangeListener(NewsChannel newsChannel) {
        support.removePropertyChangeListener(newsChannel.getChannel(), newsChannel);
    }
	
	public void setNews(String topic, String news) {
		String oldNews = this.newsTopics.get(topic);
		support.firePropertyChange(topic, oldNews, news);
		this.newsTopics.put(topic, news);
	}	
}

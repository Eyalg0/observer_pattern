package com.observer.pattern;

import com.observer.pattern.observable.NewsAgency;
import com.observer.pattern.observer.NewsChannel;

public class Main {

	public static void main(String[] args) {
		NewsAgency observable = new NewsAgency();
		NewsChannel observerSport = new NewsChannel("Sport");
		NewsChannel observerGames = new NewsChannel("Games");
		NewsChannel observerWorld = new NewsChannel("World");

		observable.addPropertyChangeListener(observerSport);
		observable.addPropertyChangeListener(observerGames);
		observable.addPropertyChangeListener(observerWorld);
		observable.setNews("Sport", "news sport");
		observable.setNews("Games", "news Games");
		observable.setNews("World", "news World");
		observable.removePropertyChangeListener(observerWorld);
		observable.setNews("World", "news World2");
		observable.addPropertyChangeListener(observerWorld);
		NewsChannel observerWorld2 = new NewsChannel("World");
		observable.addPropertyChangeListener(observerWorld2);
		observable.setNews("World", "news World3");
	}

}

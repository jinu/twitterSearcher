package com.searcher;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.social.twitter.api.SearchResults;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

public class TwitterObjectGetTest {

	@Test
	public void test() {
		String consumerKey = "j7i80m7huN2sOq05PMh7zxxsw"; // The application's consumer key
		String consumerSecret = "aJ8Km1rpKhzFbWeS6bGcqK7fUvTWd4IXkh7eTqH2G5v4aTogd2"; // The application's consumer secret
		String accessToken = "105024240-AQNMRdg5WJpzZaXJ06TLf2vhhJjqT2yWmxjKXZfs"; // The access token granted after OAuth authorization
		String accessTokenSecret = "0KXIXWZovb1tNLGWmE2HTU8eQbpDCVeeFkgOKiKTvYzD6"; // The access token secret granted after OAuth authorization
		Twitter twitter = new TwitterTemplate(consumerKey, consumerSecret, accessToken, accessTokenSecret);
		//twitter.timelineOperations().getHomeTimeline().forEach(text -> System.out.println(text.getText()));
		SearchResults results = twitter.searchOperations().search("#김소혜");
		List<Tweet> list = results.getTweets();
		list.forEach(tweet -> System.out.println(tweet.getText()));
	}

}

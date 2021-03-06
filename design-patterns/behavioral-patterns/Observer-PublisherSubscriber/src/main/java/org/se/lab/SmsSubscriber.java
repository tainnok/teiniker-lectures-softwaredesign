package org.se.lab;

public class SmsSubscriber
    implements Subscriber
{
    @Override
    public void update(Publisher publisher)
    {
        if(publisher instanceof NewsPublisher)
        {
            NewsPublisher news = (NewsPublisher)publisher;
            Logger.getInstance().log("SMS: " + news.getLatestNews());
        }
    }    
}

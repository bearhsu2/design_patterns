package com.kuma.visitor;

import com.kuma.visitor.news.GreenNews;
import com.kuma.visitor.news.RedNews;
import com.kuma.visitor.reader.BlueReader;
import com.kuma.visitor.reader.GreenReader;
import org.junit.Test;

public class VisitorTest {

  @Test
  public void name() {
    GreenReader greenReader = new GreenReader();
    BlueReader blueReader = new BlueReader();
    GreenNews greenNews = new GreenNews();
    RedNews redNews = new RedNews();

    System.out.println("藍人讀紅新聞：");
    redNews.accept(blueReader);

    System.out.println("===");

    System.out.println("藍人讀綠新聞：");
    greenNews.accept(blueReader);

    System.out.println("===");

    System.out.println("綠人讀紅新聞：");
    redNews.accept(greenReader);

    System.out.println("===");

    System.out.println("綠人讀綠新聞：");
    greenNews.accept(greenReader);
  }
}

package com.kuma.design_patterns.visitor;

import com.kuma.design_patterns.visitor.news.GreenNews;
import com.kuma.design_patterns.visitor.news.RedNews;
import com.kuma.design_patterns.visitor.reader.BlueReader;
import com.kuma.design_patterns.visitor.reader.GreenReader;
import org.junit.jupiter.api.Test;

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

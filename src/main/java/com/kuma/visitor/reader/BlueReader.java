package com.kuma.visitor.reader;

import com.kuma.visitor.news.GreenNews;
import com.kuma.visitor.news.RedNews;

public class BlueReader implements Reader {
  @Override
  public void read(RedNews news) {
    System.out.println("中華民國萬歲！");
  }

  @Override
  public void read(GreenNews news) {
    System.out.println("社會亂源，綠蛆！");
  }
}

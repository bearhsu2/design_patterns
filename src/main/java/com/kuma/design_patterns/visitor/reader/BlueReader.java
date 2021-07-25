package com.kuma.design_patterns.visitor.reader;

import com.kuma.design_patterns.visitor.news.GreenNews;
import com.kuma.design_patterns.visitor.news.RedNews;

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

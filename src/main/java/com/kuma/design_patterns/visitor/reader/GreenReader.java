package com.kuma.design_patterns.visitor.reader;

import com.kuma.design_patterns.visitor.news.GreenNews;
import com.kuma.design_patterns.visitor.news.RedNews;

public class GreenReader implements Reader {
  @Override
  public void read(RedNews news) {
    System.out.println("狗屁不通，跪舔精。");
  }

  @Override
  public void read(GreenNews news) {
    System.out.println("嗯，中肯。");
  }
}

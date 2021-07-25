package com.kuma.design_patterns.visitor.reader;

import com.kuma.design_patterns.visitor.news.GreenNews;
import com.kuma.design_patterns.visitor.news.RedNews;

public interface Reader {

  void read(RedNews news);

  void read(GreenNews news);
}

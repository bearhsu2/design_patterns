package com.kuma.visitor.reader;

import com.kuma.visitor.news.GreenNews;
import com.kuma.visitor.news.RedNews;

public interface Reader {

  void read(RedNews news);

  void read(GreenNews news);
}

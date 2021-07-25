package com.kuma.design_patterns.visitor.news;

import com.kuma.design_patterns.visitor.reader.Reader;

public interface News {

  void accept(Reader reader);
}

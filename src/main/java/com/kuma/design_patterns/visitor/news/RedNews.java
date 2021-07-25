package com.kuma.design_patterns.visitor.news;

import com.kuma.design_patterns.visitor.reader.Reader;

public class RedNews implements News {

  @Override
  public void accept(Reader reader) {
    reader.read(this);
  }
}

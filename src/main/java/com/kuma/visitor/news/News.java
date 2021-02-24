package com.kuma.visitor.news;

import com.kuma.visitor.reader.Reader;

public interface News {

  void accept(Reader reader);
}

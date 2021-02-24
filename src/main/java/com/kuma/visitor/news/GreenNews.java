package com.kuma.visitor.news;

import com.kuma.visitor.reader.Reader;

public class GreenNews implements News {
    @Override
    public void accept(Reader reader) {
        reader.read(this);
    }
}

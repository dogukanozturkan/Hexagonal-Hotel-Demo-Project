package com.hoteldemo.hotelapi.commond;

public interface Base<I,O> {
    O execute(I i);
}

package com.fpinjava.functions.exercise02_05;

public interface Function<T, U> {

  U apply(T arg);

  static <T, U, V> Function<Function<U, V>, Function<Function<T, U>, Function<T, V>>> higherCompose() {
//  ((U ->  V) ->  ((T ->  U) ->  (T ->  V))
    // (U-> V) -> (T, U) -> (T -> V))
      return f1 -> f2 -> x -> f1.apply(f2.apply(x));
  }
}

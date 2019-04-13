package com.fpinjava.functions.exercise02_04;

public class FunctionExamples {

  public static final Function<Integer, Integer> triple = x -> x * 3;

  public static final Function<Integer, Integer> square = x -> x * x;

  public static final Function<Function<Integer, Integer>, Function<Function<Integer, Integer>,
                                        Function<Integer, Integer>>> compose = f1 -> f2 -> x -> f1.apply(f2.apply(x)); // To be implemented

  public static final Function<Integer, Integer> f = compose.apply(square).apply(triple);
}

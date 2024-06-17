package com.testsealed;

public sealed class Animal permits Tiger, Animal.Test {

    public final class Test extends Animal
    {
    }
}

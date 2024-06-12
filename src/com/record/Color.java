package com.record;

record Color(int x, int y, int z) {

    public Color(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        if(x<0 || x>40) {
            throw new  IllegalArgumentException("value of x is greater than threshold");
        }
    }

    public Color(int x, int y) {
         this(x,y,0);
        if(x<0 || x>40) {
            throw new  IllegalArgumentException("value of x is greater than threshold");
        }
    }
}

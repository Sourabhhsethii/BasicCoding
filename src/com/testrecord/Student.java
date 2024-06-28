package com.testrecord;

  record Student(int a,int b) {

     public static int c = 1;

     public Student(int a,int b,int c){
         this(a,b);
         this.c =c;
     }

     public void test(){

     }

      @Override
      public String toString() {
          return "Student{" +
                  "a=" + a +
                  ", b=" + b +
                  ", c=" + c +
                  '}';
      }
  }

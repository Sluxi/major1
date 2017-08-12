package com.funcpro.major1

object Major1WS {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  //Item 1 here
  def fib(n:Int): Int = {
  	val predicate1 = true;
  	val predicate2 = true;
  	if(n>=0){val predicate1 = false;}
  	if(n==0){val predicate2 = false;}
  	if(predicate1!=true){
  	 return 1;
  	}else if(predicate2){
  	 return 0;
  	}
  	else{
  		fib(n - 1) + fib( n - 2);
  	}
  	}                                         //> fib: (n: Int)Int
  //Item 2
  def fizzString(fizzString:String): Unit ={
  	if(fizzString.startsWith("f")&&fizzString.endsWith("b")){
  		println("FizzBuzz");
  	}else if(fizzString.endsWith("b")){
  		println("Buzz");
  	}else if(fizzString.startsWith("f")){
  		println("Fizz");
  	}}                                        //> fizzString: (fizzString: String)Unit
  //Item 3
  def fac(n:Int): Int = {
  	val predicate1 = false;
  	if(n>=0){val predicate1 = true;}
  		if(predicate1!=true){
    	return 1;
  	}
  		else{
  		 fac(n-1);
  	}
  }                                               //> fac: (n: Int)Int
  
  //Item 4
  
  def num(n:Int): Int = {
  	if(n != 0){
  		0
	  }else {0}
  
  }                                               //> num: (n: Int)Int
  
  fizzString("fib");                              //> FizzBuzz
  println(fac(3));                                //> 1
}
package com.funcpro.major1

object Major1WS {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(89); 
  println("Welcome to the Scala worksheet");$skip(300); 
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
  	};System.out.println("""fib: (n: Int)Int""");$skip(270); 
  //Item 2
  def fizzString(fizzString:String): Unit ={
  	if(fizzString.startsWith("f")&&fizzString.endsWith("b")){
  		println("FizzBuzz");
  	}else if(fizzString.endsWith("b")){
  		println("Buzz");
  	}else if(fizzString.startsWith("f")){
  		println("Fizz");
  	}};System.out.println("""fizzString: (fizzString: String)Unit""");$skip(180); 
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
  };System.out.println("""fac: (n: Int)Int""");$skip(84); 
  
  //Item 4
  
  def num(n:Int): Int = {
  	if(n != 0){
  		0
	  }else {0}
  
  };System.out.println("""num: (n: Int)Int""");$skip(24); 
  
  fizzString("fib");$skip(19); ;
  println(fac(3));}
}

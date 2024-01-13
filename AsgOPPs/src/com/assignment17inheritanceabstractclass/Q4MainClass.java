package com.assignment17inheritanceabstractclass;

//4. Check –
//a. Can we create an object of an abstract class?
//b. Can we declare a class abstract with no methods in it?
//c. Can we declare a class abstract even if it does not have any abstract 
//method?
//d. Can we declare an abstract class which has both abstract as well as 
//implemented methods?
//e. Can a class extend 2 or more abstract classes?
//f. Can an abstract class extend 2 or more abstract classes?
//g. Can an interface extend 1 or many abstract classes?
//h. Can an abstract class implements 1 or many interface


abstract class AbstractClassNoMehods{    ///.............b)
	
}
abstract class AbstractClassNoAbsMehtods{  //............c)
	
	//concrete method
	
	void concreteMethod() {
		System.out.println("Concrete Method in Abstract Calss No Abstract Method");
	}
}

abstract class AbstractAnsImplementedMethods{    ///...................d
	
	abstract void abstractMethod();
	
	void implementedMethod() {
		System.out.println("Implemented Method");
	}
}

class ExtendClassDemo extends AbstractClassNoMehods{
	
}

//class ExtendClassDemo2 extends AbstractClassNoMehods,AbstractClassNoAbsMehtods {
//	
//}
//   e) No, a class in Java cannot extend more than one class (abstract or not). 
//      Java supports single inheritance for classes.

abstract class AbstractClassExtendDemo extends AbstractClassNoMehods{
	
}

//abstract class AbstractClassExtendDemo2 extends AbstractClassNoMehods,AbstractClassNoAbsMehtods {
//	
//}
//  f) No, an abstract class in Java cannot extend more than one class (abstract or not).


//interface MyInterface extends AbstractClassExtendDemo{
//	
//}
//   g) No, an interface in Java cannot extend classes. It can only extend other interfaces using the extends keyword.

interface MyInterface {
    void interfaceMethod();
}

abstract class AbstractClassImplementingInterface implements MyInterface { ///h) yes
   
    public void interfaceMethod() {
        System.out.println("Interface Method implemented in AbstractClassImplementingInterface");
    }
}

public class Q4MainClass {

	public static void main(String[] args) {
		
		//AbstractClassNoAbsMehtods ac1 = new AbstractClassNoAbsMehtods(); /// ---------a)
		//No, you cannot create an object of an abstract class. 
		//Abstract classes are meant to be subclassed, and objects are typically created for concrete subclasses.

	}

}

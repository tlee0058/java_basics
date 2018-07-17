package java_basics;

public class attributes_and_methods
{
	// We create a private attribute weight of type double.
		// Attribute is declared like a common variable,
		// however it is preceded by the access modifier (private
		// in this case)
		private double weight;
		
		// Static attribute maxWeight: relates to all instances.
		// When declaring static attributes, the keyword static is
		// inserted between access modifier and type.
		// Static variables can be initialized directly like
		// non-static variables.
		private static double maxWeight = 270.0;
		
		// This is the constructor.
		// Constructors have the following general syntax:
		// public NAME_OF_CLASS(LIST_OF_PARAMETERS) { INSTRUCTIONS }
		// LIST_OF PARAMETERS is enumeration of passed parameters as
		// NAME_OF_TYPE NAME_OF_VARIABLE
		// Multiple parameters are separated by comma.
		public attributes_and_methods(double theWeight)
		{
			// Assignment: the attribute weight is initialized with 
			// the value passed to the constructor at the time the 
			// object is newly created
			weight = theWeight;
		}
		
		// Method eatSomething:
		// Methods are defined with the general syntax:
		// ACCESS_MODIFIER RETURN_TYPE NAME(LIST_OF_PARAMETERS)
		// { METHOD_BODY }
		// RETURN_TYPE specifies the type of the value/object which is
		// returned upon completion of the execution of the method.
		// If nothing is to be returned, the return type "void" is
		// used
		public void eatSomething()
		{
			// attribute weight is increased by 0.5
			weight += 0.5;
		}
		
		// getter-method for the attribute weight
		// return type is double
		public double getWeight()
		{
			// We simply return the attribute weight.
			// Returning values/objects is always done with the
			// "return" statement
			return weight;
		}
		
		// setter-method for attribute weight
		// This method can be used for changing the weight of the
		// instance from the outside
		public void setWeight(double newWeight)
		{
			// The weight is changed only if the new value passed is
			// greater than 0. If a negative values is passed the 
			// attribute weight remains unchanged.
			// Furthermore it's checked if the weight does not exceed 
			// the maximum weight, which is stored in the static 
			// variable maxWeight. Access to static attributes is 
			// possible via the general syntax 
			// NAME_OF_CLASS.NAME_OF_ATTRIBUTE
			// The two conditions are combined using the operator 
			// "AND" && - this means both conditions have to be 
			// satisfied.1
			if (newWeight > 0 && newWeight <= attributes_and_methods.maxWeight)
				weight = newWeight;
		}
		
		public static void main(String[] args)
		{
			attributes_and_methods barrack = new attributes_and_methods(180.0);
			barrack.eatSomething();
			double newWeight = barrack.getWeight();
			System.out.println("newWeight after eating something = " + newWeight);
			
			barrack.setWeight(300.0);
			newWeight = barrack.getWeight();
			
			System.out.println("newWeight after assigement = " + newWeight);
		}
}

package oopsconcept;

	class Helper {

	
		static int Multiply(int a, int b)
		{

		
			return a * b;
		}

		
		static double Multiply(double a, double b)
		{

			
			return a * b;
		}
	}

	
	class Polymorphism {

		
		public static void main(String[] args)
		{

			
			System.out.println(Helper.Multiply(3, 5));
			System.out.println(Helper.Multiply(6.5, 5.4));
		}
	}

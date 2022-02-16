package oopsconcept;

	class Encapsulate {
	private String Employee_Name;
		private int Employee_No;
		private int Employee_Age;

		public int getAge(){
			return Employee_Age;
			}
		public String getName() {
			return Employee_Name;
			}
		public int getNo() {
			return Employee_No;
			}
		
		public void setAge(int newAge) {
			Employee_Age = newAge; 
			}
		
		public void setName(String newName)
		{
			Employee_Name = newName;
		}
		
		public void setNo(int newNo) {
			Employee_No = newNo;
			}
	}

	public class Encapsulation {
		public static void main(String[] args)
		{
			Encapsulate obj = new Encapsulate();
			obj.setName("Hashita");
			obj.setAge(22);
			obj.setNo(13);
			System.out.println("Employee name: " + obj.getName());
			System.out.println("Employee age: " + obj.getAge());
			System.out.println("Employee roll: " + obj.getNo());
		}
	}





	class testOld {

		public static Integer i1=34; 
		
		public static void main (String [] args) {
		
			int i2 = 43;
			String s1 = "Hello "+"World";

			prStr(s1);
			prInt(i1);
			intpr(i2);
		}
		
		public static void prStr (String StrParam) {
			System.out.println (StrParam);
		}

		public static void intpr (int intParam) {
                        System.out.println(intParam);
                }
		
		public static void prInt (Integer IntegerParam) {
                        System.out.println(IntegerParam);
                }

	}
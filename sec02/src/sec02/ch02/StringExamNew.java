package sec02.ch02;

public class StringExamNew {

	public static void main(String[] args) {
		String str1 = ""+
				"{\n\t\"id\":\"winter\",\n" +
				"\t\"name\":\"눈송이\"\n" +
				"}";
		System.out.println(str1);
		
//		||
		
		String str2 = """
				{
					"id":"winter", 
					"name":"눈송이"
				}
				""";
		System.out.println(str2);
	}

}

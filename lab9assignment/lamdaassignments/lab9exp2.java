package lamdaassignments;

public class lab9exp2 {
	public static void main(String[] args) {
		StringBuffer stringBuffer=new StringBuffer();
		exp2 a=(str)->{
			for(int i=0;i<str.length();i++) {
				stringBuffer.append(str.charAt(i)+" ");
			}
			return stringBuffer;
		};
		StringBuffer s=a.sb("Madhushree");
		System.out.println(s);
			
	}	
}

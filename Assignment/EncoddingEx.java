public class EncoddingEx{
public static void main(String[] args){
	String str="AabBsdE";
	String encodingStr="";
	for(int i=0;i<str.length();i++){
		char ch=Character.parseCharacter(str.charAt(i)+1));
		
	encodingStr=encodingStr+ch;
	}
	System.out.println(encodingStr);
}
}
package ch03;

public class If07 {

	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season = "";
		if(month ==12 ||month== 1||month==2) season ="겨울";
		else if(month ==3 ||month== 4||month==5) season ="봄";
		else if(month ==6 ||month== 7||month==8) season ="여름";
		else  season ="가을";
		
		System.out.println(season+"입니다.");
	}

}

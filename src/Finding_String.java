/*한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요
대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
*예시 입력
Computercooler
c

*예시 출력
2*/


//import 외부클래스 불러오기
// java.util.*; 와일드카드(*)문자활용 _java.util 패지키의 모든 클래스를 불러오기
import java.util.*;
class Main{
    public int solution(String str, char t){
        int answer=0;
//        스트링 전부 대문자로 바꾸기-> 입력 문자열의 대소문자 혼동 막기 위해서
        str=str.toUpperCase();
//        t 문자를 대문자로 전환
        t=Character.toUpperCase(t);

        System.out.println(str+" "+t);
//        str.charAt(i) 인덱스에 해당하는 문자 불러오는 함수
// --------인덱스로 만들기
		/*for(int i=0; i<str.length(); i++){
			if(str.charAt(i)==t) answer++;
		}*/

//---------str.toCharArray()가 들어오는 for문자리에는 스트링이 올 수 없다 -> 그러므로 toCharArray()로 문자배열로 변경
        for(char x : str.toCharArray()){
            if(x==t) answer++;
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
//      Scanner kb = new Scanner(System.in);줄 자체-> Scanner함수를 통해 키보드 입력값을 kb변수에 저장하는 명령어
//        Scanner함수 사용시 -> 위에서 선언한 import 필요
        Scanner kb = new Scanner(System.in);
//        .next(); 콘솔창에서 문자열 하나 읽기
//        입력문자열 저장
        String str=kb.next();
//        문자열에서 . 인덱스0번째 문자1개 불러오기
//        찾는 문자 저장
        char c=kb.next().charAt(0);
        System.out.print(T.solution(str, c));
    }
}
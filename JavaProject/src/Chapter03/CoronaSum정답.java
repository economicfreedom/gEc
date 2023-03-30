package Chapter03;

public class CoronaSum정답 {
	public static void main(String[] args) {
		int sum = 0;
		int corona[][]= {{11,12,13}
						,{21,22,23}
						,{31,32,33}
						,{41,42,43}
						,{51,52,53}
						,{61,62,63}
						,{71,72,73}
						,{81,82,83}
						,{91,92,93}
						,{101,102,103}
						,{111,112,113}
						,{121,122,123}};
		//행 기준 (1~12월), corona.legnth:12
		for (int month = 0; month < corona.length; month++) {
//			열 기준(3개의 도시), corona[month].length:3 
			for (int city = 0; city < corona[month].length; city++) {
				//최종 반복:행* 열 =12*3=36(11~123반복)
				sum+=corona[month][city];
			}
		}
		System.out.println("1년 전체 코로나 환자수는 "+sum);
	}
}

package com.example.jungip;

import java.util.Random;

public class C_DATAOBJ {
	// String ar[][]=new String[1][1];
	String ar;
	private int t, s;
	Random rand = new Random();
	String[] arrayStoreName = new String[5];
	public C_TEST[][][] cArData = new C_TEST[3][6][13];// C_TEST 자바 클래스를
														// [3][6][2]배열화 시키구
														// cArData라 이름 선언

	public C_DATAOBJ() {
		setData();
	};

	public void setAr() {
		// ar[0][0]="라라라라볶이";
		ar = "라라라라볶이";
	}

	public String getAr() {
		// return ar[0][0];
		return ar;
	}

	public void setData() {// for문으로 필요한 음식점들의 이름을 담을 배열 생성
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				for (int k = 0; k < 13; k++) {
					cArData[i][j][k] = new C_TEST();
				}
			}
		}
		// [정문,중문,후문]
		// [한식,중식,일식,양식,분식,기타]
		// [음식점 3개만 일단 만듦]
		// 음식점 저장 시작
		// [정문, 중문, 후문]
		// [한식, 중식, 일식, 양식, 분식, 기타]
		// [음식점 3개만 일단 만듦]
		// 음식점 저장 시작
		// 정문:
		// 한정식,살비찜,닭갈비,볶음밥,중국집,라멘,초밥,피자,스테이크,돈까스,김밥,떡볶이,패스트푸드,패밀리레스토랑,치킨,파스타16
		// 중문:한정식,갈비찜,닭갈비,볶음밥,중국집,라멘,초밥,피자,스테이크,돈까스,김밥,떡볶이,패스트푸드,패밀리레스토랑,파스타16

		// 후문:한정식,갈비찜,닭갈비,볶음밥,중국집,라멘,초밥,피자,스테이크,돈까스,김밥,떡볶이,,패밀리레스토랑덮밥,치킨,파스타,고기,덮밥,패밀리레스토랑16//고기?덮밥?패스트푸드,

		// 배열들어감cArData[0][5][0].setName("패밀리 레스토랑", "코푸플레이트", "02-466-7003");
		cArData[0][0][0].setName("한정식", "송림식당", "02-457-5473",
				"http://map.naver.com/local/siteview.nhn?code=11717380");
		cArData[0][0][1].setName("갈비찜", "마시찜", "02-2218-3316",
				"http://map.naver.com/local/siteview.nhn?code=35326175");
		cArData[0][0][2].setName("한정식", "송림식당", "02-457-5473",
				"http://map.naver.com/local/siteview.nhn?code=11717380");
		cArData[0][0][3].setName("갈비찜", "마시찜", "02-2218-3316",
				"http://map.naver.com/local/siteview.nhn?code=35326175");
		cArData[0][0][4].setName("한정식", "송림식당", "02-457-5473",
				"http://map.naver.com/local/siteview.nhn?code=11717380");
		cArData[0][0][5].setName("닭갈비", "춘천닭갈비", "02-468-6032",
				"http://map.naver.com/local/siteview.nhn?code=18018447");
		cArData[0][0][6].setName("볶음밥", "봄채", "02-2218-3982",
				"http://map.naver.com/local/siteview.nhn?code=19877839");
		cArData[0][0][7].setName("한정식", "송림식당", "02-457-5473",
				"http://map.naver.com/local/siteview.nhn?code=11717380");
		cArData[0][0][8].setName("갈비찜", "마시찜", "02-2218-3316",
				"http://map.naver.com/local/siteview.nhn?code=35326175");
		cArData[0][0][9].setName("한정식", "송림식당", "02-457-5473",
				"http://map.naver.com/local/siteview.nhn?code=11717380");
		cArData[0][0][10].setName("갈비찜", "마시찜", "02-2218-3316",
				"http://map.naver.com/local/siteview.nhn?code=35326175");
		cArData[0][0][11].setName("한정식", "송림식당", "02-457-5473",
				"http://map.naver.com/local/siteview.nhn?code=11717380");
		cArData[0][0][12].setName("닭갈비", "춘천닭갈비", "02-468-6032",
				"http://map.naver.com/local/siteview.nhn?code=18018447");
		cArData[0][1][0].setName("중국집", "취영루", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][1][1].setName("중국집", "취영루", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][1][2].setName("중국집", "취영루", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][1][3].setName("중국집", "취영루", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][1][4].setName("중국집", "취영루", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][1][5].setName("중국집", "취영루", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][1][6].setName("중국집", "취영루", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][1][7].setName("중국집", "취영루", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][1][8].setName("중국집", "취영루", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][1][9].setName("중국집", "취영루", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][1][10].setName("중국집", "취영루", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][1][11].setName("중국집", "취영루", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][1][12].setName("중국집", "취영루", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][2][0].setName("초밥", "스시쿠니", "02-2024-1302",
				"http://map.naver.com/local/siteview.nhn?code=17998530");
		cArData[0][2][1].setName("라멘", "구루구루라멘", "02-2024-1309",
				"http://map.naver.com/local/siteview.nhn?code=31950191");
		cArData[0][2][2].setName("초밥", "스시쿠니", "02-2024-1302",
				"http://map.naver.com/local/siteview.nhn?code=17998530");
		cArData[0][2][3].setName("라멘", "구루구루라멘", "02-2024-1309",
				"http://map.naver.com/local/siteview.nhn?code=31950191");
		cArData[0][2][4].setName("초밥", "스시쿠니", "02-2024-1302",
				"http://map.naver.com/local/siteview.nhn?code=17998530");
		cArData[0][2][5].setName("라멘", "구루구루라멘", "02-2024-1309",
				"http://map.naver.com/local/siteview.nhn?code=31950191");
		cArData[0][2][6].setName("초밥", "스시쿠니", "02-2024-1302",
				"http://map.naver.com/local/siteview.nhn?code=17998530");
		cArData[0][2][7].setName("라멘", "구루구루라멘", "02-2024-1309",
				"http://map.naver.com/local/siteview.nhn?code=31950191");
		cArData[0][2][8].setName("초밥", "스시쿠니", "02-2024-1302",
				"http://map.naver.com/local/siteview.nhn?code=17998530");
		cArData[0][2][9].setName("라멘", "구루구루라멘", "02-2024-1309",
				"http://map.naver.com/local/siteview.nhn?code=31950191");
		cArData[0][2][10].setName("초밥", "스시쿠니", "02-2024-1302",
				"http://map.naver.com/local/siteview.nhn?code=17998530");
		cArData[0][2][11].setName("라멘", "구루구루라멘", "02-2024-1309",
				"http://map.naver.com/local/siteview.nhn?code=31950191");
		cArData[0][2][12].setName("초밥", "스시쿠니", "02-2024-1302",
				"http://map.naver.com/local/siteview.nhn?code=17998530");
		cArData[0][3][0].setName("피자", "파파존스", "02-454-6464",
				"http://map.naver.com/local/siteview.nhn?code=13397556");
		cArData[0][3][1].setName("피자", "도미노피자", "02-1577-3082",
				"http://map.naver.com/local/siteview.nhn?code=11781864");
		cArData[0][3][2].setName("스테이크", "벨피아또", "02-446-0006",
				"http://map.naver.com/local/siteview.nhn?code=13176580");
		cArData[0][3][3].setName("스테이크", "옐로우스푼", "02-467-8885",
				"http://map.naver.com/local/siteview.nhn?code=34489967");
		cArData[0][3][4].setName("피자", "파파존스", "02-454-6464",
				"http://map.naver.com/local/siteview.nhn?code=13397556");
		cArData[0][3][5].setName("피자", "도미노피자", "02-1577-3082",
				"http://map.naver.com/local/siteview.nhn?code=11781864");
		cArData[0][3][6].setName("스테이크", "벨피아또", "02-446-0006",
				"http://map.naver.com/local/siteview.nhn?code=13176580");
		cArData[0][3][7].setName("스테이크", "옐로우스푼", "02-467-8885",
				"http://map.naver.com/local/siteview.nhn?code=34489967");
		cArData[0][3][8].setName("피자", "파파존스", "02-454-6464",
				"http://map.naver.com/local/siteview.nhn?code=13397556");
		cArData[0][3][9].setName("피자", "도미노피자", "02-1577-3082",
				"http://map.naver.com/local/siteview.nhn?code=11781864");
		cArData[0][3][10].setName("스테이크", "벨피아또", "02-446-0006",
				"http://map.naver.com/local/siteview.nhn?code=13176580");
		cArData[0][3][11].setName("돈까스", "김추일국민돈가스", "02-499-0575",
				"http://map.naver.com/local/siteview.nhn?code=35753292");
		cArData[0][3][12].setName("파스타", "꿈베르티니", "02-2024-8824",
				"http://map.naver.com/local/siteview.nhn?code=11884583");
		cArData[0][4][0].setName("김밥", "김밥천국", "02-452-4114",
				"http://map.naver.com/local/siteview.nhn?code=20866980");
		cArData[0][4][1].setName("김밥", "김밥천국", "02-452-4114",
				"http://map.naver.com/local/siteview.nhn?code=20866980");
		cArData[0][4][2].setName("김밥", "김밥천국", "02-452-4114",
				"http://map.naver.com/local/siteview.nhn?code=20866980");
		cArData[0][4][3].setName("떡볶이", "전설의떡볶이", "02-456-8444",
				"http://map.naver.com/local/siteview.nhn?code=33704301");
		cArData[0][4][4].setName("김밥", "김밥천국", "02-452-4114",
				"http://map.naver.com/local/siteview.nhn?code=20866980");
		cArData[0][4][5].setName("김밥", "김밥천국", "02-452-4114",
				"http://map.naver.com/local/siteview.nhn?code=20866980");
		cArData[0][4][6].setName("김밥", "김밥천국", "02-452-4114",
				"http://map.naver.com/local/siteview.nhn?code=20866980");
		cArData[0][4][7].setName("떡볶이", "전설의떡볶이", "02-456-8444",
				"http://map.naver.com/local/siteview.nhn?code=33704301");
		cArData[0][4][8].setName("김밥", "김밥천국", "02-452-4114",
				"http://map.naver.com/local/siteview.nhn?code=20866980");
		cArData[0][4][9].setName("김밥", "김밥천국", "02-452-4114",
				"http://map.naver.com/local/siteview.nhn?code=20866980");
		cArData[0][4][10].setName("김밥", "김밥천국", "02-452-4114",
				"http://map.naver.com/local/siteview.nhn?code=20866980");
		cArData[0][4][11].setName("떡볶이", "전설의떡볶이", "02-456-8444",
				"http://map.naver.com/local/siteview.nhn?code=33704301");
		cArData[0][4][12].setName("김밥", "김밥천국", "02-452-4114",
				"http://map.naver.com/local/siteview.nhn?code=20866980");
		cArData[0][5][0].setName("패밀리 레스토랑", "코푸플레이트", "02-466-7003",
				"http://map.naver.com/local/siteview.nhn?code=34490873");
		cArData[0][5][1].setName("패스트푸드", "버거킹", "02-2024-1366",
				"http://map.naver.com/local/siteview.nhn?code=12056429");
		cArData[0][5][2].setName("패밀리 레스토랑", "코푸플레이트", "02-466-7003",
				"http://map.naver.com/local/siteview.nhn?code=34490873");
		cArData[0][5][3].setName("패스트푸드", "버거킹", "02-2024-1366",
				"http://map.naver.com/local/siteview.nhn?code=12056429");
		cArData[0][5][4].setName("패밀리 레스토랑", "코푸플레이트", "02-466-7003",
				"http://map.naver.com/local/siteview.nhn?code=34490873");
		cArData[0][5][5].setName("패스트푸드", "버거킹", "02-2024-1366",
				"http://map.naver.com/local/siteview.nhn?code=12056429");
		cArData[0][5][6].setName("패밀리 레스토랑", "코푸플레이트", "02-466-7003",
				"http://map.naver.com/local/siteview.nhn?code=34490873");
		cArData[0][5][7].setName("패스트푸드", "버거킹", "02-2024-1366",
				"http://map.naver.com/local/siteview.nhn?code=12056429");
		cArData[0][5][8].setName("치킨", "네네치킨", "02-452-9200",
				"http://map.naver.com/local/siteview.nhn?code=11779383");
		cArData[0][5][9].setName("치킨", "호식이 두마리치킨", "02-447-1045",
				"http://map.naver.com/local/siteview.nhn?code=32773062");
		cArData[0][5][10].setName("패스트푸드", "버거킹", "02-2024-1366",
				"http://map.naver.com/local/siteview.nhn?code=12056429");
		cArData[0][5][11].setName("치킨", "네네치킨", "02-452-9200",
				"http://map.naver.com/local/siteview.nhn?code=11779383");
		cArData[0][5][12].setName("치킨", "호식이 두마리치킨", "02-447-1045",
				"http://map.naver.com/local/siteview.nhn?code=32773062");

		// //////정문(10개)
		cArData[1][0][0].setName("한정식", "낭풍", "070-8232-5201",
				"http://map.naver.com/local/siteview.nhn?code=31283077");
		cArData[1][0][1].setName("갈비찜", "함지박 치즈등갈비", "02-468-7080",
				"http://map.naver.com/local/siteview.nhn?code=35425025");
		cArData[1][0][2].setName("닭갈비", "춘천닭갈비", "02-462-4745",
				"http://map.naver.com/local/siteview.nhn?code=18003134");
		cArData[1][0][3].setName("볶음밥", "딱따구리", "070-4503-0016",
				"http://map.naver.com/local/siteview.nhn?code=21289925");
		cArData[1][0][4].setName("한정식", "낭풍", "070-8232-5201",
				"http://map.naver.com/local/siteview.nhn?code=31283077");
		cArData[1][0][5].setName("갈비찜", "함지박 치즈등갈비", "02-468-7080",
				"http://map.naver.com/local/siteview.nhn?code=35425025");
		cArData[1][0][6].setName("닭갈비", "춘천닭갈비", "02-462-4745",
				"http://map.naver.com/local/siteview.nhn?code=18003134");
		cArData[1][0][7].setName("볶음밥", "딱따구리", "070-4503-0016",
				"http://map.naver.com/local/siteview.nhn?code=21289925");
		cArData[1][0][8].setName("한정식", "낭풍", "070-8232-5201",
				"http://map.naver.com/local/siteview.nhn?code=31283077");
		cArData[1][0][9].setName("갈비찜", "함지박 치즈등갈비", "02-468-7080",
				"http://map.naver.com/local/siteview.nhn?code=35425025");
		cArData[1][0][10].setName("닭갈비", "춘천닭갈비", "02-462-4745",
				"http://map.naver.com/local/siteview.nhn?code=18003134");
		cArData[1][0][11].setName("볶음밥", "딱따구리", "070-4503-0016",
				"http://map.naver.com/local/siteview.nhn?code=21289925");
		cArData[1][0][12].setName("한정식", "낭풍", "070-8232-5201",
				"http://map.naver.com/local/siteview.nhn?code=31283077");
		cArData[1][1][0].setName("중국집", "매화반점", "02-462-1939",
				"http://map.naver.com/local/siteview.nhn?code=11864410");
		cArData[1][1][1].setName("중국집", "차이나팩토리", "02-455-5126",
				"http://map.naver.com/local/siteview.nhn?code=18003876");
		cArData[1][1][2].setName("중국집", "매화반점", "02-462-1939",
				"http://map.naver.com/local/siteview.nhn?code=11864410");
		cArData[1][1][3].setName("중국집", "차이나팩토리", "02-455-5126",
				"http://map.naver.com/local/siteview.nhn?code=18003876");
		cArData[1][1][4].setName("중국집", "매화반점", "02-462-1939",
				"http://map.naver.com/local/siteview.nhn?code=11864410");
		cArData[1][1][5].setName("중국집", "차이나팩토리", "02-455-5126",
				"http://map.naver.com/local/siteview.nhn?code=18003876");
		cArData[1][1][6].setName("중국집", "매화반점", "02-462-1939",
				"http://map.naver.com/local/siteview.nhn?code=11864410");
		cArData[1][1][7].setName("중국집", "차이나팩토리", "02-455-5126",
				"http://map.naver.com/local/siteview.nhn?code=18003876");
		cArData[1][1][8].setName("중국집", "매화반점", "02-462-1939",
				"http://map.naver.com/local/siteview.nhn?code=11864410");
		cArData[1][1][9].setName("중국집", "차이나팩토리", "02-455-5126",
				"http://map.naver.com/local/siteview.nhn?code=18003876");
		cArData[1][1][10].setName("중국집", "매화반점", "02-462-1939",
				"http://map.naver.com/local/siteview.nhn?code=11864410");
		cArData[1][1][11].setName("중국집", "차이나팩토리", "02-455-5126",
				"http://map.naver.com/local/siteview.nhn?code=18003876");
		cArData[1][1][12].setName("중국집", "매화반점", "02-462-1939",
				"http://map.naver.com/local/siteview.nhn?code=11864410");
		cArData[1][2][0].setName("라멘", "가츠라", "02-2218-4595",
				"http://map.naver.com/local/siteview.nhn?code=13477235");
		cArData[1][2][1].setName("라멘", "우마이도", "02-467-8788",
				"http://map.naver.com/local/siteview.nhn?code=12764501");
		cArData[1][2][2].setName("초밥", "호야초밥참치", "02-461-3739",
				"http://map.naver.com/local/siteview.nhn?code=32089668");
		cArData[1][2][3].setName("초밥", "스시오", "02-463-5955",
				"http://map.naver.com/local/siteview.nhn?code=34352358");
		cArData[1][2][4].setName("초밥", "쿠우쿠우", "02-466-6274",
				"http://map.naver.com/local/siteview.nhn?code=34268216");
		cArData[1][2][5].setName("초밥", "초밥짓는원숭이", "02-467-8238",
				"http://map.naver.com/local/siteview.nhn?code=18003246");
		cArData[1][2][6].setName("라멘", "멘야산다이메", "02-467-4129",
				"http://map.naver.com/local/siteview.nhn?code=31564527");
		cArData[1][2][7].setName("라멘", "카도야라멘", "02-2205-5090",
				"http://map.naver.com/local/siteview.nhn?code=35545857");
		cArData[1][2][8].setName("라멘", "가츠라", "02-2218-4595",
				"http://map.naver.com/local/siteview.nhn?code=13477235");
		cArData[1][2][9].setName("라멘", "우마이도", "02-467-8788",
				"http://map.naver.com/local/siteview.nhn?code=12764501");
		cArData[1][2][10].setName("초밥", "호야초밥참치", "02-461-3739",
				"http://map.naver.com/local/siteview.nhn?code=32089668");
		cArData[1][2][11].setName("초밥", "스시오", "02-463-5955",
				"http://map.naver.com/local/siteview.nhn?code=34352358");
		cArData[1][2][12].setName("초밥", "쿠우쿠우", "02-466-6274",
				"http://map.naver.com/local/siteview.nhn?code=34268216");
		cArData[1][3][0].setName("스테이크", "스테이크빌리", "02-466-7003",
				"http://map.naver.com/local/siteview.nhn?code=11595271");
		cArData[1][3][1].setName("스테이크", "모모스테이크", "02-466-8048",
				"http://map.naver.com/local/siteview.nhn?code=35085200");
		cArData[1][3][2].setName("스테이크", "몽 로얄 스테이크하우스", "02-2024-8733",
				"http://map.naver.com/local/siteview.nhn?code=32315794");
		cArData[1][3][3].setName("파스타", "페스타마레", "02-497-9982",
				"http://map.naver.com/local/siteview.nhn?code=11833999");
		cArData[1][3][4].setName("돈까스", "밀피유", "02-6012-5004",
				"http://map.naver.com/local/siteview.nhn?code=31420343");
		cArData[1][3][5].setName("돈까스", "포크포크", "02-466-5090",
				"http://map.naver.com/local/siteview.nhn?code=35404915");
		cArData[1][3][6].setName("파스타", "니뽕내뽕", "02-499-1828",
				"http://map.naver.com/local/siteview.nhn?code=19713482");
		cArData[1][3][7].setName("피자", "미스터피자", "02-465-1045",
				"http://map.naver.com/local/siteview.nhn?code=11826533");
		cArData[1][3][8].setName("피자", "피자마루", "02-463-8210",
				"http://map.naver.com/local/siteview.nhn?code=33409548");
		cArData[1][3][9].setName("파스타", "파스타타임", "02-497-4318",
				"http://map.naver.com/local/siteview.nhn?code=35003758");
		cArData[1][3][10].setName("스테이크", "르빠니에 블루", "02-468-1358",
				"http://map.naver.com/local/siteview.nhn?code=13469132");
		cArData[1][3][11].setName("스테이크", "블라인드 레스토랑", "070-7519-2182",
				"http://map.naver.com/local/siteview.nhn?code=11869115");
		cArData[1][3][12].setName("스테이크", "케미팬", "02-465-3663",
				"http://map.naver.com/local/siteview.nhn?code=35787887");
		cArData[1][4][0].setName("떡볶이", "동대문 엽기떡볶이", "02-465-3007",
				"http://map.naver.com/local/siteview.nhn?code=33586035");
		cArData[1][4][1].setName("떡볶이", "먹쉬돈나", "070-7521-8089",
				"http://map.naver.com/local/siteview.nhn?code=20742759");
		cArData[1][4][2].setName("떡볶이", "죠스떡볶이", "02-461-1174",
				"http://map.naver.com/local/siteview.nhn?code=20510897");
		cArData[1][4][3].setName("김밥", "김밥천국", "02",
				"http://map.naver.com/local/siteview.nhn?code=18834914");
		cArData[1][4][4].setName("떡볶이", "동대문 엽기떡볶이", "02-465-3007",
				"http://map.naver.com/local/siteview.nhn?code=33586035");
		cArData[1][4][5].setName("떡볶이", "먹쉬돈나", "070-7521-8089",
				"http://map.naver.com/local/siteview.nhn?code=20742759");
		cArData[1][4][6].setName("떡볶이", "죠스떡볶이", "02-461-1174",
				"http://map.naver.com/local/siteview.nhn?code=20510897");
		cArData[1][4][7].setName("김밥", "김밥천국", "02",
				"http://map.naver.com/local/siteview.nhn?code=18834914");
		cArData[1][4][8].setName("떡볶이", "동대문 엽기떡볶이", "02-465-3007",
				"http://map.naver.com/local/siteview.nhn?code=33586035");
		cArData[1][4][9].setName("떡볶이", "먹쉬돈나", "070-7521-8089",
				"http://map.naver.com/local/siteview.nhn?code=20742759");
		cArData[1][4][10].setName("떡볶이", "죠스떡볶이", "02-461-1174",
				"http://map.naver.com/local/siteview.nhn?code=20510897");
		cArData[1][4][11].setName("김밥", "김밥천국", "02",
				"http://map.naver.com/local/siteview.nhn?code=18834914");
		cArData[1][4][12].setName("떡볶이", "죠스떡볶이", "02-461-1174",
				"http://map.naver.com/local/siteview.nhn?code=20510897");
		cArData[1][5][0].setName("패밀리 레스토랑", "무스쿠스", "02-2218-4500",
				"http://map.naver.com/local/siteview.nhn?code=13226811");
		cArData[1][5][1].setName("패밀리 레스토랑", "애슐리", "02-3436-1033",
				"http://map.naver.com/local/siteview.nhn?code=13350073");
		cArData[1][5][2].setName("패밀리 레스토랑", "T.G.I FRIDAYS", "02-2218-3316",
				"http://map.naver.com/local/siteview.nhn?code=13525531");
		cArData[1][5][3].setName("패밀리 레스토랑", "서가앤쿡", "02-469-3500",
				"http://map.naver.com/local/siteview.nhn?code=35744127");
		cArData[1][5][4].setName("패밀리 레스토랑", "로니로티", "02-498-7999",
				"http://map.naver.com/local/siteview.nhn?code=33451555");
		cArData[1][5][5].setName("치킨", "뿔레치킨", "02-467-3005",
				"http://map.naver.com/local/siteview.nhn?code=33118951");
		cArData[1][5][6].setName("패스트푸드", "롯데리아", "02-2218-4550",
				"http://map.naver.com/local/siteview.nhn?code=18006363");
		cArData[1][5][7].setName("패밀리 레스토랑", "엘리스키친", "02-461-8845",
				"http://map.naver.com/local/siteview.nhn?code=35425427");
		cArData[1][5][8].setName("치킨", "솜리치킨", "02-461-0008",
				"http://map.naver.com/local/siteview.nhn?code=13122827");
		cArData[1][5][9].setName("패밀리 레스토랑", "무스쿠스", "02-2218-4500",
				"http://map.naver.com/local/siteview.nhn?code=13226811");
		cArData[1][5][10].setName("패밀리 레스토랑", "애슐리", "02-3436-1033",
				"http://map.naver.com/local/siteview.nhn?code=13350073");
		cArData[1][5][11].setName("패밀리 레스토랑", "T.G.I FRIDAYS", "02-2218-3316",
				"http://map.naver.com/local/siteview.nhn?code=13525531");
		cArData[1][5][12].setName("패밀리 레스토랑", "서가앤쿡", "02-469-3500",
				"http://map.naver.com/local/siteview.nhn?code=35744127");

		// ////중문(38개)
		cArData[2][0][0].setName("볶음밥", "개미집", "010-6209-2806",
				"http://map.naver.com/local/siteview.nhn?code=11834800");
		cArData[2][0][1].setName("볶음밥", "샘터골", "02",
				"http://map.naver.com/local/siteview.nhn?code=18835160");
		cArData[2][0][2].setName("덮밥", "코코도리", "070-4384-1631",
				"http://map.naver.com/local/siteview.nhn?code=30849682");
		cArData[2][0][3].setName("볶음밥", "개미집", "010-6209-2806",
				"http://map.naver.com/local/siteview.nhn?code=11834800");
		cArData[2][0][4].setName("볶음밥", "샘터골", "02",
				"http://map.naver.com/local/siteview.nhn?code=18835160");
		cArData[2][0][5].setName("덮밥", "코코도리", "070-4384-1631",
				"http://map.naver.com/local/siteview.nhn?code=30849682");
		cArData[2][0][6].setName("볶음밥", "개미집", "010-6209-2806",
				"http://map.naver.com/local/siteview.nhn?code=11834800");
		cArData[2][0][7].setName("볶음밥", "샘터골", "02",
				"http://map.naver.com/local/siteview.nhn?code=18835160");
		cArData[2][0][8].setName("덮밥", "코코도리", "070-4384-1631",
				"http://map.naver.com/local/siteview.nhn?code=30849682");
		cArData[2][0][9].setName("볶음밥", "개미집", "010-6209-2806",
				"http://map.naver.com/local/siteview.nhn?code=11834800");
		cArData[2][0][10].setName("갈비찜", "돼지갈비찜생삼겹살", "02",
				"http://map.naver.com/local/siteview.nhn?code=20912889");
		cArData[2][0][11].setName("닭갈비", "싼티포와춘천닭갈비", "02-461-1312",
				"http://map.naver.com/local/siteview.nhn?code=31148635");
		cArData[2][0][12].setName("한정식", "먹고또먹고", "02-2215-8775",
				"http://map.naver.com/local/siteview.nhn?code=30839864");
		cArData[2][1][0].setName("중국집", "홍콩중화요리", "02-454-0045",
				"http://map.naver.com/local/siteview.nhn?code=13086008");
		cArData[2][1][1].setName("중국집", "화원", "02-454-1888",
				"http://map.naver.com/local/siteview.nhn?code=32960376");
		cArData[2][1][2].setName("중국집", "홍콩중화요리", "02-454-0045",
				"http://map.naver.com/local/siteview.nhn?code=13086008");
		cArData[2][1][3].setName("중국집", "화원", "02-454-1888",
				"http://map.naver.com/local/siteview.nhn?code=32960376");
		cArData[2][1][4].setName("중국집", "홍콩중화요리", "02-454-0045",
				"http://map.naver.com/local/siteview.nhn?code=13086008");
		cArData[2][1][5].setName("중국집", "화원", "02-454-1888",
				"http://map.naver.com/local/siteview.nhn?code=32960376");
		cArData[2][1][6].setName("중국집", "홍콩중화요리", "02-454-0045",
				"http://map.naver.com/local/siteview.nhn?code=13086008");
		cArData[2][1][7].setName("중국집", "화원", "02-454-1888",
				"http://map.naver.com/local/siteview.nhn?code=32960376");
		cArData[2][1][0].setName("중국집", "홍콩중화요리", "02-454-0045",
				"http://map.naver.com/local/siteview.nhn?code=13086008");
		cArData[2][1][8].setName("중국집", "화원", "02-454-1888",
				"http://map.naver.com/local/siteview.nhn?code=32960376");
		cArData[2][1][9].setName("중국집", "홍콩중화요리", "02-454-0045",
				"http://map.naver.com/local/siteview.nhn?code=13086008");
		cArData[2][1][10].setName("중국집", "화원", "02-454-1888",
				"http://map.naver.com/local/siteview.nhn?code=32960376");
		cArData[2][1][11].setName("중국집", "홍콩중화요리", "02-454-0045",
				"http://map.naver.com/local/siteview.nhn?code=13086008");
		cArData[2][1][12].setName("중국집", "화원", "02-454-1888",
				"http://map.naver.com/local/siteview.nhn?code=32960376");
		cArData[2][2][0].setName("라멘", "히이로", "02-444-4343",
				"http://map.naver.com/local/siteview.nhn?code=21012435");
		cArData[2][2][1].setName("초밥", "스시붐", "02-466-6077",
				"http://map.naver.com/local/siteview.nhn?code=34333161");
		cArData[2][2][2].setName("라멘", "히이로", "02-444-4343",
				"http://map.naver.com/local/siteview.nhn?code=21012435");
		cArData[2][2][3].setName("라멘", "히이로", "02-444-4343",
				"http://map.naver.com/local/siteview.nhn?code=21012435");
		cArData[2][2][4].setName("초밥", "스시붐", "02-466-6077",
				"http://map.naver.com/local/siteview.nhn?code=34333161");
		cArData[2][2][5].setName("라멘", "히이로", "02-444-4343",
				"http://map.naver.com/local/siteview.nhn?code=21012435");
		cArData[2][2][6].setName("초밥", "스시붐", "02-466-6077",
				"http://map.naver.com/local/siteview.nhn?code=34333161");
		cArData[2][2][7].setName("라멘", "히이로", "02-444-4343",
				"http://map.naver.com/local/siteview.nhn?code=21012435");
		cArData[2][2][8].setName("초밥", "스시붐", "02-466-6077",
				"http://map.naver.com/local/siteview.nhn?code=34333161");
		cArData[2][2][9].setName("라멘", "히이로", "02-444-4343",
				"http://map.naver.com/local/siteview.nhn?code=21012435");
		cArData[2][2][10].setName("초밥", "스시붐", "02-466-6077",
				"http://map.naver.com/local/siteview.nhn?code=34333161");
		cArData[2][2][11].setName("라멘", "히이로", "02-444-4343",
				"http://map.naver.com/local/siteview.nhn?code=21012435");
		cArData[2][2][12].setName("초밥", "스시붐", "02-466-6077",
				"http://map.naver.com/local/siteview.nhn?code=34333161");
		cArData[2][3][0].setName("피자", "미스터피자", "02-456-6503",
				"http://map.naver.com/local/siteview.nhn?code=12894524");
		cArData[2][3][1].setName("스테이크", "팍스그릴", "070-4404-0166",
				"http://map.naver.com/local/siteview.nhn?code=20399541");
		cArData[2][3][2].setName("돈까스", "짱 돈까스", "02-499-6630",
				"http://map.naver.com/local/siteview.nhn?code=20870989");
		cArData[2][3][3].setName("파스타", "롤앤파스타", "02-454-4995",
				"http://map.naver.com/local/siteview.nhn?code=13155561");
		cArData[2][3][4].setName("피자", "미스터피자", "02-456-6503",
				"http://map.naver.com/local/siteview.nhn?code=12894524");
		cArData[2][3][5].setName("스테이크", "팍스그릴", "070-4404-0166",
				"http://map.naver.com/local/siteview.nhn?code=20399541");
		cArData[2][3][6].setName("돈까스", "짱 돈까스", "02-499-6630",
				"http://map.naver.com/local/siteview.nhn?code=20870989");
		cArData[2][3][7].setName("파스타", "롤앤파스타", "02-454-4995",
				"http://map.naver.com/local/siteview.nhn?code=13155561");
		cArData[2][3][8].setName("피자", "미스터피자", "02-456-6503",
				"http://map.naver.com/local/siteview.nhn?code=12894524");
		cArData[2][3][9].setName("스테이크", "팍스그릴", "070-4404-0166",
				"http://map.naver.com/local/siteview.nhn?code=20399541");
		cArData[2][3][10].setName("돈까스", "짱 돈까스", "02-499-6630",
				"http://map.naver.com/local/siteview.nhn?code=20870989");
		cArData[2][3][11].setName("파스타", "롤앤파스타", "02-454-4995",
				"http://map.naver.com/local/siteview.nhn?code=13155561");
		cArData[2][3][12].setName("피자", "미스터피자", "02-456-6503",
				"http://map.naver.com/local/siteview.nhn?code=12894524");
		cArData[2][4][0].setName("김밥", "김밥대학 라면학과", "02",
				"http://map.naver.com/local/siteview.nhn?code=20835959");
		cArData[2][4][1].setName("떡볶이", "불난떡볶이", "02", "http://map.naver.com");
		cArData[2][4][2].setName("김밥", "김밥대학 라면학과", "02",
				"http://map.naver.com/local/siteview.nhn?code=20835959");
		cArData[2][4][3].setName("떡볶이", "불난떡볶이", "02", "http://map.naver.com");
		cArData[2][4][4].setName("김밥", "김밥대학 라면학과", "02",
				"http://map.naver.com/local/siteview.nhn?code=20835959");
		cArData[2][4][5].setName("김밥", "김밥대학 라면학과", "02",
				"http://map.naver.com/local/siteview.nhn?code=20835959");
		cArData[2][4][6].setName("떡볶이", "불난떡볶이", "02", "http://map.naver.com");
		cArData[2][4][7].setName("김밥", "김밥대학 라면학과", "02",
				"http://map.naver.com/local/siteview.nhn?code=20835959");
		cArData[2][4][8].setName("떡볶이", "불난떡볶이", "02", "http://map.naver.com");
		cArData[2][4][9].setName("김밥", "김밥대학 라면학과", "02",
				"http://map.naver.com/local/siteview.nhn?code=20835959");
		cArData[2][4][10].setName("김밥", "김밥대학 라면학과", "02",
				"http://map.naver.com/local/siteview.nhn?code=20835959");
		cArData[2][4][11].setName("떡볶이", "불난떡볶이", "02", "http://map.naver.com");
		cArData[2][4][12].setName("김밥", "김밥대학 라면학과", "02",
				"http://map.naver.com/local/siteview.nhn?code=20835959");
		cArData[2][5][0].setName("패밀리 레스토랑", "아웃백 스테이크하우스", "02-3436-2691",
				"http://map.naver.com/local/siteview.nhn?code=11849224");
		cArData[2][5][1].setName("고기", "주먹구구", "02-446-2244",
				"http://map.naver.com/local/siteview.nhn?code=19866374");
		cArData[2][5][2].setName("패밀리 레스토랑", "아웃백 스테이크하우스", "02-3436-2691",
				"http://map.naver.com/local/siteview.nhn?code=11849224");
		cArData[2][5][3].setName("고기", "주먹구구", "02-446-2244",
				"http://map.naver.com/local/siteview.nhn?code=19866374");
		cArData[2][5][4].setName("패밀리 레스토랑", "아웃백 스테이크하우스", "02-3436-2691",
				"http://map.naver.com/local/siteview.nhn?code=11849224");
		cArData[2][5][5].setName("고기", "주먹구구", "02-446-2244",
				"http://map.naver.com/local/siteview.nhn?code=19866374");
		cArData[2][5][6].setName("패밀리 레스토랑", "아웃백 스테이크하우스", "02-3436-2691",
				"http://map.naver.com/local/siteview.nhn?code=11849224");
		cArData[2][5][7].setName("패스트푸드", "맥도날드", "02-461-3645",
				"http://map.naver.com/local/siteview.nhn?code=31316700");
		cArData[2][5][8].setName("치킨", "오늘통닭", "02-3437-9595",
				"http://map.naver.com/local/siteview.nhn?code=33342592");
		cArData[2][5][9].setName("패밀리 레스토랑", "아웃백 스테이크하우스", "02-3436-2691",
				"http://map.naver.com/local/siteview.nhn?code=11849224");
		cArData[2][5][10].setName("고기", "주먹구구", "02-446-2244",
				"http://map.naver.com/local/siteview.nhn?code=19866374");
		cArData[2][5][11].setName("패밀리 레스토랑", "아웃백 스테이크하우스", "02-3436-2691",
				"http://map.naver.com/local/siteview.nhn?code=11849224");
		cArData[2][5][12].setName("고기", "주먹구구", "02-446-2244",
				"http://map.naver.com/local/siteview.nhn?code=19866374");
	}

	public String getName(int nNum, int nNum2, int nNum3) {
		return cArData[nNum][nNum2][nNum3].getName();// cArData[0][0][0].getName();이
														// 되면 "춘천닭갈비"가 화면에 띄워짐

	}

	public String[] storeName(int value1, int kindOfFoodNum, String selectedMenu) {
		int t = 0, s = 0;
		
		for (t = 0; t < 13; t++) {
			if (cArData[value1][kindOfFoodNum][t].getData1().equals(
					selectedMenu))

			{
				arrayStoreName[s] = cArData[value1][kindOfFoodNum][t]
						.getData2();
				s++;
				if (s == 5)
					break;

			} else
				continue;

		}
		return arrayStoreName;

	}
	
	public String selectedUrl(String foodStoreName, String url){		//주소 찾기
		for (int a=0; a<3; a++){
			for(int b=0; b<6; b++){
				for(int c=0; c<13; c++){
					
					if(cArData[a][b][c].getData2().equals(foodStoreName)){
						url = cArData[a][b][c].getData4();
					}
				}
			}
		}
		return url;
	}
	public String selectedTel(String foodStoreName, String tel){		//번호 찾기
		for (int a=0; a<3; a++){
			for(int b=0; b<6; b++){
				for(int c=0; c<13; c++){
					
					if(cArData[a][b][c].getData2().equals(foodStoreName)){
						tel = cArData[a][b][c].getData3();
					}
				}
			}
		}
		return tel;
	}




	public String selectedMenu(int kindOfFoodNum) {
		t = rand.nextInt(3);
		s = rand.nextInt(13); // 5대신 3차원 배열의 제일 끝값이 들어가야
		/* return cArData[k][value][j].getData1(); */
		return cArData[t][kindOfFoodNum][s].getData1();

	}

}

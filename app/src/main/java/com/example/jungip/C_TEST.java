package com.example.jungip;


public class C_TEST {

	private String m_nName;// 음식이름
	private String m_nName1;// 음식점이름
	private String m_nNum;// 전화번호
	private String m_map;
	private int m_Num;// 한식,일식,분식 ~을 0부터 5까지
	public void setName(String m_nName, String m_nName1, String m_nNum, String m_map) {
		this.m_nName = m_nName;
		this.m_nName1 = m_nName1;
		this.m_nNum = m_nNum;
		this.m_map=m_map;
	}

	public String getData1() { // 음식이름 반환하는 함수
		return m_nName;
	}
	public String getData2() { // 음식점 반환하는 함수
		return m_nName1;
	}
	public String getData3() { // 전화번호반환하는 함수
		return m_nNum;
	}
	public String getData4() {	// 주소 반환하는 함수
		return m_map;
	}


	public String getName() {// getData와 getName은 setName과 setData에서 받아온 값들을
								// 되돌려주는 역할
		return m_nName;

	}

	public void setNumber(int Num) {// Second_Rank.java에서 한식,중식,일식,양식,분식,기타를
									// 0~5로 받아옴
		m_Num = Num;// 이외에도 cArData[nNum][nNum2][nNum3]에 들어갈 nNum,nNum2,nNum3을
					// 받아올 수 있음
	}

	public int getNumber() {// Second_Rank.java에서 받아온 한식,중식,일식,양식,분식,기타를
							// Second_Rank2.java에게 전달함
		return m_Num;// 이외에도 받아온 cArData[nNum][nNum2][nNum3]에 들어갈
						// nNum,nNum2,nNum3를 전달함
	}
	


}

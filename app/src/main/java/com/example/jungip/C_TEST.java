package com.example.jungip;


public class C_TEST {

	private String m_nName;// �����̸�
	private String m_nName1;// �������̸�
	private String m_nNum;// ��ȭ��ȣ
	private String m_map;
	private int m_Num;// �ѽ�,�Ͻ�,�н� ~�� 0���� 5����
	public void setName(String m_nName, String m_nName1, String m_nNum, String m_map) {
		this.m_nName = m_nName;
		this.m_nName1 = m_nName1;
		this.m_nNum = m_nNum;
		this.m_map=m_map;
	}

	public String getData1() { // �����̸� ��ȯ�ϴ� �Լ�
		return m_nName;
	}
	public String getData2() { // ������ ��ȯ�ϴ� �Լ�
		return m_nName1;
	}
	public String getData3() { // ��ȭ��ȣ��ȯ�ϴ� �Լ�
		return m_nNum;
	}
	public String getData4() {	// �ּ� ��ȯ�ϴ� �Լ�
		return m_map;
	}


	public String getName() {// getData�� getName�� setName�� setData���� �޾ƿ� ������
								// �ǵ����ִ� ����
		return m_nName;

	}

	public void setNumber(int Num) {// Second_Rank.java���� �ѽ�,�߽�,�Ͻ�,���,�н�,��Ÿ��
									// 0~5�� �޾ƿ�
		m_Num = Num;// �̿ܿ��� cArData[nNum][nNum2][nNum3]�� �� nNum,nNum2,nNum3��
					// �޾ƿ� �� ����
	}

	public int getNumber() {// Second_Rank.java���� �޾ƿ� �ѽ�,�߽�,�Ͻ�,���,�н�,��Ÿ��
							// Second_Rank2.java���� ������
		return m_Num;// �̿ܿ��� �޾ƿ� cArData[nNum][nNum2][nNum3]�� ��
						// nNum,nNum2,nNum3�� ������
	}
	


}

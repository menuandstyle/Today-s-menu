package com.example.jungip;

import java.util.Random;

public class C_DATAOBJ {
	// String ar[][]=new String[1][1];
	String ar;
	private int t, s;
	Random rand = new Random();
	String[] arrayStoreName = new String[5];
	public C_TEST[][][] cArData = new C_TEST[3][6][13];// C_TEST �ڹ� Ŭ������
														// [3][6][2]�迭ȭ ��Ű��
														// cArData�� �̸� ����

	public C_DATAOBJ() {
		setData();
	};

	public void setAr() {
		// ar[0][0]="�������";
		ar = "�������";
	}

	public String getAr() {
		// return ar[0][0];
		return ar;
	}

	public void setData() {// for������ �ʿ��� ���������� �̸��� ���� �迭 ����
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 6; j++) {
				for (int k = 0; k < 13; k++) {
					cArData[i][j][k] = new C_TEST();
				}
			}
		}
		// [����,�߹�,�Ĺ�]
		// [�ѽ�,�߽�,�Ͻ�,���,�н�,��Ÿ]
		// [������ 3���� �ϴ� ����]
		// ������ ���� ����
		// [����, �߹�, �Ĺ�]
		// [�ѽ�, �߽�, �Ͻ�, ���, �н�, ��Ÿ]
		// [������ 3���� �ϴ� ����]
		// ������ ���� ����
		// ����:
		// ������,�����,�߰���,������,�߱���,���,�ʹ�,����,������ũ,���,���,������,�н�ƮǪ��,�йи��������,ġŲ,�Ľ�Ÿ16
		// �߹�:������,������,�߰���,������,�߱���,���,�ʹ�,����,������ũ,���,���,������,�н�ƮǪ��,�йи��������,�Ľ�Ÿ16

		// �Ĺ�:������,������,�߰���,������,�߱���,���,�ʹ�,����,������ũ,���,���,������,,�йи������������,ġŲ,�Ľ�Ÿ,���,����,�йи��������16//���?����?�н�ƮǪ��,

		// �迭��cArData[0][5][0].setName("�йи� �������", "��Ǫ�÷���Ʈ", "02-466-7003");
		cArData[0][0][0].setName("������", "�۸��Ĵ�", "02-457-5473",
				"http://map.naver.com/local/siteview.nhn?code=11717380");
		cArData[0][0][1].setName("������", "������", "02-2218-3316",
				"http://map.naver.com/local/siteview.nhn?code=35326175");
		cArData[0][0][2].setName("������", "�۸��Ĵ�", "02-457-5473",
				"http://map.naver.com/local/siteview.nhn?code=11717380");
		cArData[0][0][3].setName("������", "������", "02-2218-3316",
				"http://map.naver.com/local/siteview.nhn?code=35326175");
		cArData[0][0][4].setName("������", "�۸��Ĵ�", "02-457-5473",
				"http://map.naver.com/local/siteview.nhn?code=11717380");
		cArData[0][0][5].setName("�߰���", "��õ�߰���", "02-468-6032",
				"http://map.naver.com/local/siteview.nhn?code=18018447");
		cArData[0][0][6].setName("������", "��ä", "02-2218-3982",
				"http://map.naver.com/local/siteview.nhn?code=19877839");
		cArData[0][0][7].setName("������", "�۸��Ĵ�", "02-457-5473",
				"http://map.naver.com/local/siteview.nhn?code=11717380");
		cArData[0][0][8].setName("������", "������", "02-2218-3316",
				"http://map.naver.com/local/siteview.nhn?code=35326175");
		cArData[0][0][9].setName("������", "�۸��Ĵ�", "02-457-5473",
				"http://map.naver.com/local/siteview.nhn?code=11717380");
		cArData[0][0][10].setName("������", "������", "02-2218-3316",
				"http://map.naver.com/local/siteview.nhn?code=35326175");
		cArData[0][0][11].setName("������", "�۸��Ĵ�", "02-457-5473",
				"http://map.naver.com/local/siteview.nhn?code=11717380");
		cArData[0][0][12].setName("�߰���", "��õ�߰���", "02-468-6032",
				"http://map.naver.com/local/siteview.nhn?code=18018447");
		cArData[0][1][0].setName("�߱���", "�뿵��", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][1][1].setName("�߱���", "�뿵��", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][1][2].setName("�߱���", "�뿵��", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][1][3].setName("�߱���", "�뿵��", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][1][4].setName("�߱���", "�뿵��", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][1][5].setName("�߱���", "�뿵��", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][1][6].setName("�߱���", "�뿵��", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][1][7].setName("�߱���", "�뿵��", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][1][8].setName("�߱���", "�뿵��", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][1][9].setName("�߱���", "�뿵��", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][1][10].setName("�߱���", "�뿵��", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][1][11].setName("�߱���", "�뿵��", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][1][12].setName("�߱���", "�뿵��", "02-2024-8880",
				"http://map.naver.com/local/siteview.nhn?code=13555272");
		cArData[0][2][0].setName("�ʹ�", "�������", "02-2024-1302",
				"http://map.naver.com/local/siteview.nhn?code=17998530");
		cArData[0][2][1].setName("���", "���籸����", "02-2024-1309",
				"http://map.naver.com/local/siteview.nhn?code=31950191");
		cArData[0][2][2].setName("�ʹ�", "�������", "02-2024-1302",
				"http://map.naver.com/local/siteview.nhn?code=17998530");
		cArData[0][2][3].setName("���", "���籸����", "02-2024-1309",
				"http://map.naver.com/local/siteview.nhn?code=31950191");
		cArData[0][2][4].setName("�ʹ�", "�������", "02-2024-1302",
				"http://map.naver.com/local/siteview.nhn?code=17998530");
		cArData[0][2][5].setName("���", "���籸����", "02-2024-1309",
				"http://map.naver.com/local/siteview.nhn?code=31950191");
		cArData[0][2][6].setName("�ʹ�", "�������", "02-2024-1302",
				"http://map.naver.com/local/siteview.nhn?code=17998530");
		cArData[0][2][7].setName("���", "���籸����", "02-2024-1309",
				"http://map.naver.com/local/siteview.nhn?code=31950191");
		cArData[0][2][8].setName("�ʹ�", "�������", "02-2024-1302",
				"http://map.naver.com/local/siteview.nhn?code=17998530");
		cArData[0][2][9].setName("���", "���籸����", "02-2024-1309",
				"http://map.naver.com/local/siteview.nhn?code=31950191");
		cArData[0][2][10].setName("�ʹ�", "�������", "02-2024-1302",
				"http://map.naver.com/local/siteview.nhn?code=17998530");
		cArData[0][2][11].setName("���", "���籸����", "02-2024-1309",
				"http://map.naver.com/local/siteview.nhn?code=31950191");
		cArData[0][2][12].setName("�ʹ�", "�������", "02-2024-1302",
				"http://map.naver.com/local/siteview.nhn?code=17998530");
		cArData[0][3][0].setName("����", "��������", "02-454-6464",
				"http://map.naver.com/local/siteview.nhn?code=13397556");
		cArData[0][3][1].setName("����", "���̳�����", "02-1577-3082",
				"http://map.naver.com/local/siteview.nhn?code=11781864");
		cArData[0][3][2].setName("������ũ", "���Ǿƶ�", "02-446-0006",
				"http://map.naver.com/local/siteview.nhn?code=13176580");
		cArData[0][3][3].setName("������ũ", "���ο콺Ǭ", "02-467-8885",
				"http://map.naver.com/local/siteview.nhn?code=34489967");
		cArData[0][3][4].setName("����", "��������", "02-454-6464",
				"http://map.naver.com/local/siteview.nhn?code=13397556");
		cArData[0][3][5].setName("����", "���̳�����", "02-1577-3082",
				"http://map.naver.com/local/siteview.nhn?code=11781864");
		cArData[0][3][6].setName("������ũ", "���Ǿƶ�", "02-446-0006",
				"http://map.naver.com/local/siteview.nhn?code=13176580");
		cArData[0][3][7].setName("������ũ", "���ο콺Ǭ", "02-467-8885",
				"http://map.naver.com/local/siteview.nhn?code=34489967");
		cArData[0][3][8].setName("����", "��������", "02-454-6464",
				"http://map.naver.com/local/siteview.nhn?code=13397556");
		cArData[0][3][9].setName("����", "���̳�����", "02-1577-3082",
				"http://map.naver.com/local/siteview.nhn?code=11781864");
		cArData[0][3][10].setName("������ũ", "���Ǿƶ�", "02-446-0006",
				"http://map.naver.com/local/siteview.nhn?code=13176580");
		cArData[0][3][11].setName("���", "�����ϱ��ε�����", "02-499-0575",
				"http://map.naver.com/local/siteview.nhn?code=35753292");
		cArData[0][3][12].setName("�Ľ�Ÿ", "�޺���Ƽ��", "02-2024-8824",
				"http://map.naver.com/local/siteview.nhn?code=11884583");
		cArData[0][4][0].setName("���", "���õ��", "02-452-4114",
				"http://map.naver.com/local/siteview.nhn?code=20866980");
		cArData[0][4][1].setName("���", "���õ��", "02-452-4114",
				"http://map.naver.com/local/siteview.nhn?code=20866980");
		cArData[0][4][2].setName("���", "���õ��", "02-452-4114",
				"http://map.naver.com/local/siteview.nhn?code=20866980");
		cArData[0][4][3].setName("������", "�����Ƕ�����", "02-456-8444",
				"http://map.naver.com/local/siteview.nhn?code=33704301");
		cArData[0][4][4].setName("���", "���õ��", "02-452-4114",
				"http://map.naver.com/local/siteview.nhn?code=20866980");
		cArData[0][4][5].setName("���", "���õ��", "02-452-4114",
				"http://map.naver.com/local/siteview.nhn?code=20866980");
		cArData[0][4][6].setName("���", "���õ��", "02-452-4114",
				"http://map.naver.com/local/siteview.nhn?code=20866980");
		cArData[0][4][7].setName("������", "�����Ƕ�����", "02-456-8444",
				"http://map.naver.com/local/siteview.nhn?code=33704301");
		cArData[0][4][8].setName("���", "���õ��", "02-452-4114",
				"http://map.naver.com/local/siteview.nhn?code=20866980");
		cArData[0][4][9].setName("���", "���õ��", "02-452-4114",
				"http://map.naver.com/local/siteview.nhn?code=20866980");
		cArData[0][4][10].setName("���", "���õ��", "02-452-4114",
				"http://map.naver.com/local/siteview.nhn?code=20866980");
		cArData[0][4][11].setName("������", "�����Ƕ�����", "02-456-8444",
				"http://map.naver.com/local/siteview.nhn?code=33704301");
		cArData[0][4][12].setName("���", "���õ��", "02-452-4114",
				"http://map.naver.com/local/siteview.nhn?code=20866980");
		cArData[0][5][0].setName("�йи� �������", "��Ǫ�÷���Ʈ", "02-466-7003",
				"http://map.naver.com/local/siteview.nhn?code=34490873");
		cArData[0][5][1].setName("�н�ƮǪ��", "����ŷ", "02-2024-1366",
				"http://map.naver.com/local/siteview.nhn?code=12056429");
		cArData[0][5][2].setName("�йи� �������", "��Ǫ�÷���Ʈ", "02-466-7003",
				"http://map.naver.com/local/siteview.nhn?code=34490873");
		cArData[0][5][3].setName("�н�ƮǪ��", "����ŷ", "02-2024-1366",
				"http://map.naver.com/local/siteview.nhn?code=12056429");
		cArData[0][5][4].setName("�йи� �������", "��Ǫ�÷���Ʈ", "02-466-7003",
				"http://map.naver.com/local/siteview.nhn?code=34490873");
		cArData[0][5][5].setName("�н�ƮǪ��", "����ŷ", "02-2024-1366",
				"http://map.naver.com/local/siteview.nhn?code=12056429");
		cArData[0][5][6].setName("�йи� �������", "��Ǫ�÷���Ʈ", "02-466-7003",
				"http://map.naver.com/local/siteview.nhn?code=34490873");
		cArData[0][5][7].setName("�н�ƮǪ��", "����ŷ", "02-2024-1366",
				"http://map.naver.com/local/siteview.nhn?code=12056429");
		cArData[0][5][8].setName("ġŲ", "�׳�ġŲ", "02-452-9200",
				"http://map.naver.com/local/siteview.nhn?code=11779383");
		cArData[0][5][9].setName("ġŲ", "ȣ���� �θ���ġŲ", "02-447-1045",
				"http://map.naver.com/local/siteview.nhn?code=32773062");
		cArData[0][5][10].setName("�н�ƮǪ��", "����ŷ", "02-2024-1366",
				"http://map.naver.com/local/siteview.nhn?code=12056429");
		cArData[0][5][11].setName("ġŲ", "�׳�ġŲ", "02-452-9200",
				"http://map.naver.com/local/siteview.nhn?code=11779383");
		cArData[0][5][12].setName("ġŲ", "ȣ���� �θ���ġŲ", "02-447-1045",
				"http://map.naver.com/local/siteview.nhn?code=32773062");

		// //////����(10��)
		cArData[1][0][0].setName("������", "��ǳ", "070-8232-5201",
				"http://map.naver.com/local/siteview.nhn?code=31283077");
		cArData[1][0][1].setName("������", "������ ġ����", "02-468-7080",
				"http://map.naver.com/local/siteview.nhn?code=35425025");
		cArData[1][0][2].setName("�߰���", "��õ�߰���", "02-462-4745",
				"http://map.naver.com/local/siteview.nhn?code=18003134");
		cArData[1][0][3].setName("������", "��������", "070-4503-0016",
				"http://map.naver.com/local/siteview.nhn?code=21289925");
		cArData[1][0][4].setName("������", "��ǳ", "070-8232-5201",
				"http://map.naver.com/local/siteview.nhn?code=31283077");
		cArData[1][0][5].setName("������", "������ ġ����", "02-468-7080",
				"http://map.naver.com/local/siteview.nhn?code=35425025");
		cArData[1][0][6].setName("�߰���", "��õ�߰���", "02-462-4745",
				"http://map.naver.com/local/siteview.nhn?code=18003134");
		cArData[1][0][7].setName("������", "��������", "070-4503-0016",
				"http://map.naver.com/local/siteview.nhn?code=21289925");
		cArData[1][0][8].setName("������", "��ǳ", "070-8232-5201",
				"http://map.naver.com/local/siteview.nhn?code=31283077");
		cArData[1][0][9].setName("������", "������ ġ����", "02-468-7080",
				"http://map.naver.com/local/siteview.nhn?code=35425025");
		cArData[1][0][10].setName("�߰���", "��õ�߰���", "02-462-4745",
				"http://map.naver.com/local/siteview.nhn?code=18003134");
		cArData[1][0][11].setName("������", "��������", "070-4503-0016",
				"http://map.naver.com/local/siteview.nhn?code=21289925");
		cArData[1][0][12].setName("������", "��ǳ", "070-8232-5201",
				"http://map.naver.com/local/siteview.nhn?code=31283077");
		cArData[1][1][0].setName("�߱���", "��ȭ����", "02-462-1939",
				"http://map.naver.com/local/siteview.nhn?code=11864410");
		cArData[1][1][1].setName("�߱���", "���̳����丮", "02-455-5126",
				"http://map.naver.com/local/siteview.nhn?code=18003876");
		cArData[1][1][2].setName("�߱���", "��ȭ����", "02-462-1939",
				"http://map.naver.com/local/siteview.nhn?code=11864410");
		cArData[1][1][3].setName("�߱���", "���̳����丮", "02-455-5126",
				"http://map.naver.com/local/siteview.nhn?code=18003876");
		cArData[1][1][4].setName("�߱���", "��ȭ����", "02-462-1939",
				"http://map.naver.com/local/siteview.nhn?code=11864410");
		cArData[1][1][5].setName("�߱���", "���̳����丮", "02-455-5126",
				"http://map.naver.com/local/siteview.nhn?code=18003876");
		cArData[1][1][6].setName("�߱���", "��ȭ����", "02-462-1939",
				"http://map.naver.com/local/siteview.nhn?code=11864410");
		cArData[1][1][7].setName("�߱���", "���̳����丮", "02-455-5126",
				"http://map.naver.com/local/siteview.nhn?code=18003876");
		cArData[1][1][8].setName("�߱���", "��ȭ����", "02-462-1939",
				"http://map.naver.com/local/siteview.nhn?code=11864410");
		cArData[1][1][9].setName("�߱���", "���̳����丮", "02-455-5126",
				"http://map.naver.com/local/siteview.nhn?code=18003876");
		cArData[1][1][10].setName("�߱���", "��ȭ����", "02-462-1939",
				"http://map.naver.com/local/siteview.nhn?code=11864410");
		cArData[1][1][11].setName("�߱���", "���̳����丮", "02-455-5126",
				"http://map.naver.com/local/siteview.nhn?code=18003876");
		cArData[1][1][12].setName("�߱���", "��ȭ����", "02-462-1939",
				"http://map.naver.com/local/siteview.nhn?code=11864410");
		cArData[1][2][0].setName("���", "������", "02-2218-4595",
				"http://map.naver.com/local/siteview.nhn?code=13477235");
		cArData[1][2][1].setName("���", "�츶�̵�", "02-467-8788",
				"http://map.naver.com/local/siteview.nhn?code=12764501");
		cArData[1][2][2].setName("�ʹ�", "ȣ���ʹ���ġ", "02-461-3739",
				"http://map.naver.com/local/siteview.nhn?code=32089668");
		cArData[1][2][3].setName("�ʹ�", "���ÿ�", "02-463-5955",
				"http://map.naver.com/local/siteview.nhn?code=34352358");
		cArData[1][2][4].setName("�ʹ�", "������", "02-466-6274",
				"http://map.naver.com/local/siteview.nhn?code=34268216");
		cArData[1][2][5].setName("�ʹ�", "�ʹ����¿�����", "02-467-8238",
				"http://map.naver.com/local/siteview.nhn?code=18003246");
		cArData[1][2][6].setName("���", "��߻���̸�", "02-467-4129",
				"http://map.naver.com/local/siteview.nhn?code=31564527");
		cArData[1][2][7].setName("���", "ī���߶��", "02-2205-5090",
				"http://map.naver.com/local/siteview.nhn?code=35545857");
		cArData[1][2][8].setName("���", "������", "02-2218-4595",
				"http://map.naver.com/local/siteview.nhn?code=13477235");
		cArData[1][2][9].setName("���", "�츶�̵�", "02-467-8788",
				"http://map.naver.com/local/siteview.nhn?code=12764501");
		cArData[1][2][10].setName("�ʹ�", "ȣ���ʹ���ġ", "02-461-3739",
				"http://map.naver.com/local/siteview.nhn?code=32089668");
		cArData[1][2][11].setName("�ʹ�", "���ÿ�", "02-463-5955",
				"http://map.naver.com/local/siteview.nhn?code=34352358");
		cArData[1][2][12].setName("�ʹ�", "������", "02-466-6274",
				"http://map.naver.com/local/siteview.nhn?code=34268216");
		cArData[1][3][0].setName("������ũ", "������ũ����", "02-466-7003",
				"http://map.naver.com/local/siteview.nhn?code=11595271");
		cArData[1][3][1].setName("������ũ", "�������ũ", "02-466-8048",
				"http://map.naver.com/local/siteview.nhn?code=35085200");
		cArData[1][3][2].setName("������ũ", "�� �ξ� ������ũ�Ͽ콺", "02-2024-8733",
				"http://map.naver.com/local/siteview.nhn?code=32315794");
		cArData[1][3][3].setName("�Ľ�Ÿ", "�佺Ÿ����", "02-497-9982",
				"http://map.naver.com/local/siteview.nhn?code=11833999");
		cArData[1][3][4].setName("���", "������", "02-6012-5004",
				"http://map.naver.com/local/siteview.nhn?code=31420343");
		cArData[1][3][5].setName("���", "��ũ��ũ", "02-466-5090",
				"http://map.naver.com/local/siteview.nhn?code=35404915");
		cArData[1][3][6].setName("�Ľ�Ÿ", "�ϻͳ���", "02-499-1828",
				"http://map.naver.com/local/siteview.nhn?code=19713482");
		cArData[1][3][7].setName("����", "�̽�������", "02-465-1045",
				"http://map.naver.com/local/siteview.nhn?code=11826533");
		cArData[1][3][8].setName("����", "���ڸ���", "02-463-8210",
				"http://map.naver.com/local/siteview.nhn?code=33409548");
		cArData[1][3][9].setName("�Ľ�Ÿ", "�Ľ�ŸŸ��", "02-497-4318",
				"http://map.naver.com/local/siteview.nhn?code=35003758");
		cArData[1][3][10].setName("������ũ", "�����Ͽ� ���", "02-468-1358",
				"http://map.naver.com/local/siteview.nhn?code=13469132");
		cArData[1][3][11].setName("������ũ", "����ε� �������", "070-7519-2182",
				"http://map.naver.com/local/siteview.nhn?code=11869115");
		cArData[1][3][12].setName("������ũ", "�ɹ���", "02-465-3663",
				"http://map.naver.com/local/siteview.nhn?code=35787887");
		cArData[1][4][0].setName("������", "���빮 ���ⶱ����", "02-465-3007",
				"http://map.naver.com/local/siteview.nhn?code=33586035");
		cArData[1][4][1].setName("������", "�Խ�����", "070-7521-8089",
				"http://map.naver.com/local/siteview.nhn?code=20742759");
		cArData[1][4][2].setName("������", "�ҽ�������", "02-461-1174",
				"http://map.naver.com/local/siteview.nhn?code=20510897");
		cArData[1][4][3].setName("���", "���õ��", "02",
				"http://map.naver.com/local/siteview.nhn?code=18834914");
		cArData[1][4][4].setName("������", "���빮 ���ⶱ����", "02-465-3007",
				"http://map.naver.com/local/siteview.nhn?code=33586035");
		cArData[1][4][5].setName("������", "�Խ�����", "070-7521-8089",
				"http://map.naver.com/local/siteview.nhn?code=20742759");
		cArData[1][4][6].setName("������", "�ҽ�������", "02-461-1174",
				"http://map.naver.com/local/siteview.nhn?code=20510897");
		cArData[1][4][7].setName("���", "���õ��", "02",
				"http://map.naver.com/local/siteview.nhn?code=18834914");
		cArData[1][4][8].setName("������", "���빮 ���ⶱ����", "02-465-3007",
				"http://map.naver.com/local/siteview.nhn?code=33586035");
		cArData[1][4][9].setName("������", "�Խ�����", "070-7521-8089",
				"http://map.naver.com/local/siteview.nhn?code=20742759");
		cArData[1][4][10].setName("������", "�ҽ�������", "02-461-1174",
				"http://map.naver.com/local/siteview.nhn?code=20510897");
		cArData[1][4][11].setName("���", "���õ��", "02",
				"http://map.naver.com/local/siteview.nhn?code=18834914");
		cArData[1][4][12].setName("������", "�ҽ�������", "02-461-1174",
				"http://map.naver.com/local/siteview.nhn?code=20510897");
		cArData[1][5][0].setName("�йи� �������", "������", "02-2218-4500",
				"http://map.naver.com/local/siteview.nhn?code=13226811");
		cArData[1][5][1].setName("�йи� �������", "�ֽ���", "02-3436-1033",
				"http://map.naver.com/local/siteview.nhn?code=13350073");
		cArData[1][5][2].setName("�йи� �������", "T.G.I FRIDAYS", "02-2218-3316",
				"http://map.naver.com/local/siteview.nhn?code=13525531");
		cArData[1][5][3].setName("�йи� �������", "��������", "02-469-3500",
				"http://map.naver.com/local/siteview.nhn?code=35744127");
		cArData[1][5][4].setName("�йи� �������", "�δϷ�Ƽ", "02-498-7999",
				"http://map.naver.com/local/siteview.nhn?code=33451555");
		cArData[1][5][5].setName("ġŲ", "�Է�ġŲ", "02-467-3005",
				"http://map.naver.com/local/siteview.nhn?code=33118951");
		cArData[1][5][6].setName("�н�ƮǪ��", "�Ե�����", "02-2218-4550",
				"http://map.naver.com/local/siteview.nhn?code=18006363");
		cArData[1][5][7].setName("�йи� �������", "������Űģ", "02-461-8845",
				"http://map.naver.com/local/siteview.nhn?code=35425427");
		cArData[1][5][8].setName("ġŲ", "�ظ�ġŲ", "02-461-0008",
				"http://map.naver.com/local/siteview.nhn?code=13122827");
		cArData[1][5][9].setName("�йи� �������", "������", "02-2218-4500",
				"http://map.naver.com/local/siteview.nhn?code=13226811");
		cArData[1][5][10].setName("�йи� �������", "�ֽ���", "02-3436-1033",
				"http://map.naver.com/local/siteview.nhn?code=13350073");
		cArData[1][5][11].setName("�йи� �������", "T.G.I FRIDAYS", "02-2218-3316",
				"http://map.naver.com/local/siteview.nhn?code=13525531");
		cArData[1][5][12].setName("�йи� �������", "��������", "02-469-3500",
				"http://map.naver.com/local/siteview.nhn?code=35744127");

		// ////�߹�(38��)
		cArData[2][0][0].setName("������", "������", "010-6209-2806",
				"http://map.naver.com/local/siteview.nhn?code=11834800");
		cArData[2][0][1].setName("������", "���Ͱ�", "02",
				"http://map.naver.com/local/siteview.nhn?code=18835160");
		cArData[2][0][2].setName("����", "���ڵ���", "070-4384-1631",
				"http://map.naver.com/local/siteview.nhn?code=30849682");
		cArData[2][0][3].setName("������", "������", "010-6209-2806",
				"http://map.naver.com/local/siteview.nhn?code=11834800");
		cArData[2][0][4].setName("������", "���Ͱ�", "02",
				"http://map.naver.com/local/siteview.nhn?code=18835160");
		cArData[2][0][5].setName("����", "���ڵ���", "070-4384-1631",
				"http://map.naver.com/local/siteview.nhn?code=30849682");
		cArData[2][0][6].setName("������", "������", "010-6209-2806",
				"http://map.naver.com/local/siteview.nhn?code=11834800");
		cArData[2][0][7].setName("������", "���Ͱ�", "02",
				"http://map.naver.com/local/siteview.nhn?code=18835160");
		cArData[2][0][8].setName("����", "���ڵ���", "070-4384-1631",
				"http://map.naver.com/local/siteview.nhn?code=30849682");
		cArData[2][0][9].setName("������", "������", "010-6209-2806",
				"http://map.naver.com/local/siteview.nhn?code=11834800");
		cArData[2][0][10].setName("������", "���������������", "02",
				"http://map.naver.com/local/siteview.nhn?code=20912889");
		cArData[2][0][11].setName("�߰���", "��Ƽ������õ�߰���", "02-461-1312",
				"http://map.naver.com/local/siteview.nhn?code=31148635");
		cArData[2][0][12].setName("������", "�԰�Ǹ԰�", "02-2215-8775",
				"http://map.naver.com/local/siteview.nhn?code=30839864");
		cArData[2][1][0].setName("�߱���", "ȫ����ȭ�丮", "02-454-0045",
				"http://map.naver.com/local/siteview.nhn?code=13086008");
		cArData[2][1][1].setName("�߱���", "ȭ��", "02-454-1888",
				"http://map.naver.com/local/siteview.nhn?code=32960376");
		cArData[2][1][2].setName("�߱���", "ȫ����ȭ�丮", "02-454-0045",
				"http://map.naver.com/local/siteview.nhn?code=13086008");
		cArData[2][1][3].setName("�߱���", "ȭ��", "02-454-1888",
				"http://map.naver.com/local/siteview.nhn?code=32960376");
		cArData[2][1][4].setName("�߱���", "ȫ����ȭ�丮", "02-454-0045",
				"http://map.naver.com/local/siteview.nhn?code=13086008");
		cArData[2][1][5].setName("�߱���", "ȭ��", "02-454-1888",
				"http://map.naver.com/local/siteview.nhn?code=32960376");
		cArData[2][1][6].setName("�߱���", "ȫ����ȭ�丮", "02-454-0045",
				"http://map.naver.com/local/siteview.nhn?code=13086008");
		cArData[2][1][7].setName("�߱���", "ȭ��", "02-454-1888",
				"http://map.naver.com/local/siteview.nhn?code=32960376");
		cArData[2][1][0].setName("�߱���", "ȫ����ȭ�丮", "02-454-0045",
				"http://map.naver.com/local/siteview.nhn?code=13086008");
		cArData[2][1][8].setName("�߱���", "ȭ��", "02-454-1888",
				"http://map.naver.com/local/siteview.nhn?code=32960376");
		cArData[2][1][9].setName("�߱���", "ȫ����ȭ�丮", "02-454-0045",
				"http://map.naver.com/local/siteview.nhn?code=13086008");
		cArData[2][1][10].setName("�߱���", "ȭ��", "02-454-1888",
				"http://map.naver.com/local/siteview.nhn?code=32960376");
		cArData[2][1][11].setName("�߱���", "ȫ����ȭ�丮", "02-454-0045",
				"http://map.naver.com/local/siteview.nhn?code=13086008");
		cArData[2][1][12].setName("�߱���", "ȭ��", "02-454-1888",
				"http://map.naver.com/local/siteview.nhn?code=32960376");
		cArData[2][2][0].setName("���", "���̷�", "02-444-4343",
				"http://map.naver.com/local/siteview.nhn?code=21012435");
		cArData[2][2][1].setName("�ʹ�", "���ú�", "02-466-6077",
				"http://map.naver.com/local/siteview.nhn?code=34333161");
		cArData[2][2][2].setName("���", "���̷�", "02-444-4343",
				"http://map.naver.com/local/siteview.nhn?code=21012435");
		cArData[2][2][3].setName("���", "���̷�", "02-444-4343",
				"http://map.naver.com/local/siteview.nhn?code=21012435");
		cArData[2][2][4].setName("�ʹ�", "���ú�", "02-466-6077",
				"http://map.naver.com/local/siteview.nhn?code=34333161");
		cArData[2][2][5].setName("���", "���̷�", "02-444-4343",
				"http://map.naver.com/local/siteview.nhn?code=21012435");
		cArData[2][2][6].setName("�ʹ�", "���ú�", "02-466-6077",
				"http://map.naver.com/local/siteview.nhn?code=34333161");
		cArData[2][2][7].setName("���", "���̷�", "02-444-4343",
				"http://map.naver.com/local/siteview.nhn?code=21012435");
		cArData[2][2][8].setName("�ʹ�", "���ú�", "02-466-6077",
				"http://map.naver.com/local/siteview.nhn?code=34333161");
		cArData[2][2][9].setName("���", "���̷�", "02-444-4343",
				"http://map.naver.com/local/siteview.nhn?code=21012435");
		cArData[2][2][10].setName("�ʹ�", "���ú�", "02-466-6077",
				"http://map.naver.com/local/siteview.nhn?code=34333161");
		cArData[2][2][11].setName("���", "���̷�", "02-444-4343",
				"http://map.naver.com/local/siteview.nhn?code=21012435");
		cArData[2][2][12].setName("�ʹ�", "���ú�", "02-466-6077",
				"http://map.naver.com/local/siteview.nhn?code=34333161");
		cArData[2][3][0].setName("����", "�̽�������", "02-456-6503",
				"http://map.naver.com/local/siteview.nhn?code=12894524");
		cArData[2][3][1].setName("������ũ", "�Ž��׸�", "070-4404-0166",
				"http://map.naver.com/local/siteview.nhn?code=20399541");
		cArData[2][3][2].setName("���", "¯ ���", "02-499-6630",
				"http://map.naver.com/local/siteview.nhn?code=20870989");
		cArData[2][3][3].setName("�Ľ�Ÿ", "�Ѿ��Ľ�Ÿ", "02-454-4995",
				"http://map.naver.com/local/siteview.nhn?code=13155561");
		cArData[2][3][4].setName("����", "�̽�������", "02-456-6503",
				"http://map.naver.com/local/siteview.nhn?code=12894524");
		cArData[2][3][5].setName("������ũ", "�Ž��׸�", "070-4404-0166",
				"http://map.naver.com/local/siteview.nhn?code=20399541");
		cArData[2][3][6].setName("���", "¯ ���", "02-499-6630",
				"http://map.naver.com/local/siteview.nhn?code=20870989");
		cArData[2][3][7].setName("�Ľ�Ÿ", "�Ѿ��Ľ�Ÿ", "02-454-4995",
				"http://map.naver.com/local/siteview.nhn?code=13155561");
		cArData[2][3][8].setName("����", "�̽�������", "02-456-6503",
				"http://map.naver.com/local/siteview.nhn?code=12894524");
		cArData[2][3][9].setName("������ũ", "�Ž��׸�", "070-4404-0166",
				"http://map.naver.com/local/siteview.nhn?code=20399541");
		cArData[2][3][10].setName("���", "¯ ���", "02-499-6630",
				"http://map.naver.com/local/siteview.nhn?code=20870989");
		cArData[2][3][11].setName("�Ľ�Ÿ", "�Ѿ��Ľ�Ÿ", "02-454-4995",
				"http://map.naver.com/local/siteview.nhn?code=13155561");
		cArData[2][3][12].setName("����", "�̽�������", "02-456-6503",
				"http://map.naver.com/local/siteview.nhn?code=12894524");
		cArData[2][4][0].setName("���", "������ ����а�", "02",
				"http://map.naver.com/local/siteview.nhn?code=20835959");
		cArData[2][4][1].setName("������", "�ҳ�������", "02", "http://map.naver.com");
		cArData[2][4][2].setName("���", "������ ����а�", "02",
				"http://map.naver.com/local/siteview.nhn?code=20835959");
		cArData[2][4][3].setName("������", "�ҳ�������", "02", "http://map.naver.com");
		cArData[2][4][4].setName("���", "������ ����а�", "02",
				"http://map.naver.com/local/siteview.nhn?code=20835959");
		cArData[2][4][5].setName("���", "������ ����а�", "02",
				"http://map.naver.com/local/siteview.nhn?code=20835959");
		cArData[2][4][6].setName("������", "�ҳ�������", "02", "http://map.naver.com");
		cArData[2][4][7].setName("���", "������ ����а�", "02",
				"http://map.naver.com/local/siteview.nhn?code=20835959");
		cArData[2][4][8].setName("������", "�ҳ�������", "02", "http://map.naver.com");
		cArData[2][4][9].setName("���", "������ ����а�", "02",
				"http://map.naver.com/local/siteview.nhn?code=20835959");
		cArData[2][4][10].setName("���", "������ ����а�", "02",
				"http://map.naver.com/local/siteview.nhn?code=20835959");
		cArData[2][4][11].setName("������", "�ҳ�������", "02", "http://map.naver.com");
		cArData[2][4][12].setName("���", "������ ����а�", "02",
				"http://map.naver.com/local/siteview.nhn?code=20835959");
		cArData[2][5][0].setName("�йи� �������", "�ƿ��� ������ũ�Ͽ콺", "02-3436-2691",
				"http://map.naver.com/local/siteview.nhn?code=11849224");
		cArData[2][5][1].setName("���", "�ָԱ���", "02-446-2244",
				"http://map.naver.com/local/siteview.nhn?code=19866374");
		cArData[2][5][2].setName("�йи� �������", "�ƿ��� ������ũ�Ͽ콺", "02-3436-2691",
				"http://map.naver.com/local/siteview.nhn?code=11849224");
		cArData[2][5][3].setName("���", "�ָԱ���", "02-446-2244",
				"http://map.naver.com/local/siteview.nhn?code=19866374");
		cArData[2][5][4].setName("�йи� �������", "�ƿ��� ������ũ�Ͽ콺", "02-3436-2691",
				"http://map.naver.com/local/siteview.nhn?code=11849224");
		cArData[2][5][5].setName("���", "�ָԱ���", "02-446-2244",
				"http://map.naver.com/local/siteview.nhn?code=19866374");
		cArData[2][5][6].setName("�йи� �������", "�ƿ��� ������ũ�Ͽ콺", "02-3436-2691",
				"http://map.naver.com/local/siteview.nhn?code=11849224");
		cArData[2][5][7].setName("�н�ƮǪ��", "�Ƶ�����", "02-461-3645",
				"http://map.naver.com/local/siteview.nhn?code=31316700");
		cArData[2][5][8].setName("ġŲ", "�������", "02-3437-9595",
				"http://map.naver.com/local/siteview.nhn?code=33342592");
		cArData[2][5][9].setName("�йи� �������", "�ƿ��� ������ũ�Ͽ콺", "02-3436-2691",
				"http://map.naver.com/local/siteview.nhn?code=11849224");
		cArData[2][5][10].setName("���", "�ָԱ���", "02-446-2244",
				"http://map.naver.com/local/siteview.nhn?code=19866374");
		cArData[2][5][11].setName("�йи� �������", "�ƿ��� ������ũ�Ͽ콺", "02-3436-2691",
				"http://map.naver.com/local/siteview.nhn?code=11849224");
		cArData[2][5][12].setName("���", "�ָԱ���", "02-446-2244",
				"http://map.naver.com/local/siteview.nhn?code=19866374");
	}

	public String getName(int nNum, int nNum2, int nNum3) {
		return cArData[nNum][nNum2][nNum3].getName();// cArData[0][0][0].getName();��
														// �Ǹ� "��õ�߰���"�� ȭ�鿡 �����

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
	
	public String selectedUrl(String foodStoreName, String url){		//�ּ� ã��
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
	public String selectedTel(String foodStoreName, String tel){		//��ȣ ã��
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
		s = rand.nextInt(13); // 5��� 3���� �迭�� ���� ������ ����
		/* return cArData[k][value][j].getData1(); */
		return cArData[t][kindOfFoodNum][s].getData1();

	}

}

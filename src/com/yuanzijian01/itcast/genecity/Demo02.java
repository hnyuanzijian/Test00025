package com.yuanzijian01.itcast.genecity;

/*
 * �Զ��巺�ͣ� �Զ��巺�Ϳ������Ϊ��һ���������͵�ռλ�������������Ϊ��һ���������͵ı�����
 
 ���ͷ�����
	
	���ͷ����Ķ����ʽ�� 
		
		���η�   <�����Զ��巺��>����ֵ����       ������(�β��б�..){
		
		}

ע�⣺
	1. �ڷ����ϵ��Զ��巺�͵ľ������������ǵ��ø÷�����ʱ����ʵ�ε�ʱ��ȷ���ġ�
	2. �Զ��巺��ʹ�õı�ʶ��ֻҪ���ϱ�ʶ�����������򼴿ɡ�



 ���� ����һ���������Խ����������͵Ĳ�����Ҫ�����ķ���ֵ������ʵ�ε���������Ҫһ�¡�
 * */

public class Demo02 {
	public static void main(String[] args) {
		 Integer i = print(12);
		 String str = print("abc");
		 
		 System.out.println(str);
	}
	
	public static <abc> abc print(abc o){
		return o;
	}
}

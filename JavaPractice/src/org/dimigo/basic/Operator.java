package org.dimigo.basic;

public class Operator {
	public static void main(String[] args) {
		int la = 9, lb = 10;
		int sa = 9;
		double lh = 5.8, sh = 5.4;
		double ladder = (double)((la + lb) * lh * 0.5);
		double sqaure = (double)(sa * sh);
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + ladder);
		System.out.println("평행사변형 넓이 : " + sqaure);
		System.out.println("\n\n");
		System.out.println("사다리꼴이 평행사변형 보다 " + (ladder - sqaure) + " " + "더 큽니다.");
	}
}

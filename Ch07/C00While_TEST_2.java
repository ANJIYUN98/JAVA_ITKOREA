package Ch07;

import java.util.Scanner;
public class C00While_TEST_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//구구단 출력(2단-9단)
		
//		int i;
//		int dan =2;
//		
//		while(dan<=9) {
//			
//			i=1;
//			
//			while(i<=9) {
//				
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			
//			dan++;
//		}
		
		
		//구구단 출력(9단-2단)
//		int i;
//		int dan=9;
//		
//		while (dan>=2) {
//			i=9;
//			
//			while(i>=2) {
//				System.out.printf("%d X %d = %d\n",dan, i, dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}
//		
		
		//구구단 출력(2단 - N단)
		//N은 Scanner로 받습니다.
		
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		while(n>9) {
//		
//			System.out.println("다시입력하세요.");
//			n = sc.nextInt();
//		}
//		
//		int dan=2;
//		int i;
//		
//		
//		while(dan<=n) {
//			i=1;
//			
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		
		//4행 별찍기 -> 높이 입력 별찍기
		//****
		//****
		//****
		//****
		
		
//		int i=0; //행증가
//		int j=0; //별찍기
//		while(i<4) {
//			
//			j=0;
//			while(j<4) {
//				System.out.print("*");
//				j++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		
		
		//4행 별찍기 -> 높이 입력받아 별찍기
		//높이 :n
		//****
		//****
	    //****
	    //****
		
//		높이 : n
//		행증가(i)		별찍기(j)
//		0		0~3
//		1		0~3
//		2		0~3
//		3		0~3
//		..
//		n-1		0~3
//		------------------------------------------
//		i=0		j=0
//		i<n		j<4
//		i++		j++
		
		
		//정사각형 만들려면 j<4를 j<n으로 바꿔주면 됨
				
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i=0; //행증가
//		int j=0; //별찍기
//		while(i<n) {
//					
//			j=0;
//			while(j<4) {
//				System.out.print("*");
//				j++;
//			}
//					
//			System.out.println();
//			i++;
//		}
		
		
		
		//*
		//**
		//***
		//****
		
//		i		j
//		0		0-0
//		1		0-1
//		2		0-2
//		3		0-3
//		----------------------------
//		i=0		j=0
//		i<4		j<=i  j는 i의 수보다 작다가 똑같아지므로
//		i++		j++
		
//		
//		int i=0; //행증가
//		int j=0; //별찍기
//		while(i<4) {
//			
//			j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		
		
//		높이 입력받아 별찍기
		//*
		//**
		//***
		//****
		
//		i		j
//		0		0-0
//		1		0-1
//		2		0-2
//		3		0-3
//		----------------------------
//		i=0		j=0
//		i<n		j<=i  j는 i의 수보다 작다가 똑같아지므로
//		i++		j++
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i=0; //행증가
//		int j=0; //별찍기
//		while(i<n) {
//					
//			j=0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//					
//			System.out.println();
//			i++;
//		}
		
		
		
		
		//000*
		//00***
		//0*****
		//*******
		//0은 공백

//		int i=0; //행증가
//		int j=0; //공백
//		int k=0; //별찍기
//		
//		while(i<4) {
//			
//			//공백먼저찍기
//			j=0;
//			while(j<=2-i) {
//				System.out.print(" ");
//				j++;
//			}
//			//별찍기
//			k=0;
//			while(k<=2*i) {
//				System.out.print("*");
//				k++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		
		// 높이 입력받아서
		//000*
		//00***
		//0*****
		//*******
		//0은 공백
		
		
		//------------------------------------
//		i(행증가)	 	j(공백)		k(별)	
//		------------------------------------
//		0		    0-2		    0-0	
//		1		    0-1	     	0-2
//		2		    0-0		    0-4
//		3		     x		    0-6
//      ...
//      n-1         
//		-------------------------------------
//		i=0		    j=0	    	k=0
//		i++		    j++	    	k++
//		i<4		    j<=2-i		k<=2*i
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//
//				int i=0; //행증가
//				int j=0; //공백
//				int k=0; //별찍기
//				
//				while(i<n) {
//					
//					//공백먼저찍기
//					j=0;  //항상 0으로 초기화
//					while(j<=(n-2)-i) {
//						System.out.print(" ");
//						j++;
//					}
//					//별찍기
//					k=0;
//					while(k<=2*i) {
//						System.out.print("*");
//						k++;
//					}
//					
//					System.out.println();
//					i++;
//				}
				
				
				
				
				
				
				//*******
				// *****	
				//  ***
				//   *

//				----------------------------------
//				i(행)		j(공백)		k(별)
//				----------------------------------
//				0		     x		    0-8
//				1		    0-0		    0-6
//				2		    0-1		    0-4
//				3		    0-2		    0-2
//				4		    0-3	 	    0-0
		
		
//      		n-1
//				----------------------------------
//				i=0		    j=0		    k=0
//				i++		    j++		    k++
//				i<h		    j<=i-1		k<=(h-1)*2-(2*i)
				
				
				
				
		
//		        Scanner sc = new Scanner(System.in);
//		        int n = sc.nextInt();
//		
//		
//				int i = 0;
//				int j = 0;
//				int k = 0;
//				
//				
//				while(i<n) {
//					
//					//공백
//					j=0;
//					while(j<=i-1) {
//						System.out.print(" ");
//						j++;
//					}
//					
//					
//					//별
//					k=0;
//					while(k<=(n-1)*2-2*i) {
//						System.out.print("*");
//						k++;
//					}
//					
//					
//					System.out.println();
//					i++;
//				}
//				
				
				
				
				
				
				
				
				
				
				
				
				
				
			    //   *
				//  ***
				// *****
				//*******
				// *****	
				//  ***
				//   *

//				-------------------------------------
//				i(행증가)		j(공백)		    k(별)
//				-------------------------------------
//				0		    0-(n/2)-1-0     0-0
//				1		    0-1		        0-2
//				2		    0-0		        0-4
//				3		     x		        0-6
//				n/2
//				--------------------------------------
//						    j=0		        k=0
//						    j++		        k++
//						    j<=(n/2-1)-i	k<=2*i
		//
//				4		    0-0		        0-4
//				5		    0-1		        0-2
//				6		    0-2		        0-0
//				--------------------------------------
//						    j=0		        k=0
//						    j++		        k++
//						    j<=i-(n/2)-1	k<=((n/2)*2)-2*1
				
		
				
				
				
				
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				
				int i=0;
				int j=0;
				int k=0;
				
				while(i<n) {
					
					if(i<(n/2)+1) {
					
						//공백
						j=0;
						while(j<=(n/2-1)-i) {
							
							System.out.print(" ");
							j++;
						}

					
						//별
						k=0;
						while(k<=2*i) {
							System.out.print("*");
							k++;
						}
					
					}else {
						
						//공백
						j=0;
						while(j<=i-(n/2)-1) {
							
							System.out.print(" ");
							j++;
						}
						
						
						//별
						k=0;
						while(k<=(((n/2)*2)*2)-2*1) {
							System.out.print("*");
							k++;
						}
							
					
					}
					
					System.out.println();
					i++;
					
				}
		
	}

}

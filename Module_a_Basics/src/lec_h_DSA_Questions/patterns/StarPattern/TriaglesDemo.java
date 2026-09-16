package lec_h_DSA_Questions.patterns.StarPattern;

import java.util.Scanner;

public class TriaglesDemo {

    // Prints increasing star triangle
    public static void printIncreasingTriangle(Scanner sc) {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Prints decreasing star triangle
    public static void printDecreasingTriangle(Scanner sc) {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Prints Floyd's triangle
    public static void printFloydsTriangle(Scanner sc) {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        int number = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    // Prints binary triangle using flag
    public static void printBinaryTriangleUsingFlag(Scanner sc) {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {

            boolean flag = (i % 2 == 0);

            for (int j = 0; j <= i; j++) {
                System.out.print(flag ? "1 " : "0 ");
                flag = !flag;
            }

            System.out.println();
        }
    }

    // Prints binary triangle using parity
    public static void printBinaryTriangleUsingParity(Scanner sc) {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {

                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    // Prints odd number triangle
    public static void printOddNumberTriangle(Scanner sc) {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((2 * j + 1) + " ");
            }
            System.out.println();
        }
    }

    // Prints right aligned star triangle
    public static void printRightAlignedTriangle(Scanner sc) {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // Prints rhombus pattern
    public static void printRhombus(Scanner sc) {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) {

            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j < rows; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    
    
    
    // inverted right triangle
    
    public static void invertedStarTriangle(Scanner sc) {
    	System.out.println("Enter the number of rows : ");
    	int rows=sc.nextInt();
    	System.out.println();
    	
    	for(int i=0;i<rows;i++) {
    		for(int j=0;j<i;j++) {
    			System.out.print("   ");
    		}
    		
    		for(int j=0;j<rows-i;j++) {
    			System.out.print(" * ");
    		}
    		
    		System.out.println();
    	}
    	
    	
    	
    
    }
    
    // pyramid printing
    
    public static void Pyramid(Scanner sc) {
    	
    	System.out.println("Enter the number of rows : ");
    	int rows=sc.nextInt();
    	System.out.println();
    	
    	for(int i=0;i<rows;i++) {
    		
    		for(int j=0;j<rows-i;j++) {
    			System.out.print("   ");
    		}
    		for(int j=0;j<2*i+1;j++) {
    			System.out.print(" * ");
    		}
    		System.out.println();
    	}
    }
    
    
    
    // Printing Pyramid with Variables
    
    public static void Pyramid2(Scanner sc) {
    	System.out.println("Enter the number of rows : ");
    	int rows=sc.nextInt();
    	int nsp=rows-1,nst=1;
    	
    	
    	for(int i=0;i<rows;i++) {
    		
    		for(int j=0;j<nsp;j++) {
    			System.out.print("   ");
    		}
    		
    		for(int j=0;j<nst;j++) {
    			System.out.print(" * ");
    		}
    		nst+=2;
    		nsp--;
    		
    		System.out.println();
    	}
    }

    
    // Print Diamond Pattern
    
    public static void Diamond(Scanner sc) {
    	System.out.println("Enter the number of rows : ");
    	int rows=sc.nextInt();
    	System.out.println();
    	
    	int nsp=rows-1,nst=1;
    	
    	for(int i=0;i<rows;i++) {
    		for(int j=0;j<nsp;j++) {
    			System.out.print("   ");
    		}
    		
    		for(int j=0;j<nst;j++) {
    			System.out.print(" * ");
    		}
    		nsp--;
    		nst+=2;
    		System.out.println();
    	}
    	
    	 nsp=1;
    	 nst=2*rows-3;
     	
     	for(int i=0;i<rows-1;i++) {
     		for(int j=0;j<nsp;j++) {
     			System.out.print("   ");
     		}
     		
     		for(int j=0;j<nst;j++) {
     			System.out.print(" * ");
     		}
     		nsp++;
     		nst-=2;
     		System.out.println();
     	}
    }
    
    
    // Print Bridge Pattern
    
    public static void Bridge(Scanner sc) {
    	System.out.println("Enter the number of rows : ");
    	int rows=sc.nextInt();
    	System.out.println();
    	
    	int nsp=1;
    	
    	for(int j=0;j<2*rows-1;j++) {
			System.out.print(" * ");
		}
    	System.out.println();
    	
    	for(int i=0;i<rows-1;i++) {
    		
    		
    		for(int j=0;j<rows-i-1;j++) {
    		System.out.print(" * ");	
    		}
    		
    		for(int j=0;j<nsp;j++) {
    			System.out.print("   ");
    		}
    		
    		for(int j=0;j<rows-i-1;j++) {
        		System.out.print(" * ");	
        		}
    		
    		nsp+=2;
    		System.out.println();
    	}
    	
    }
    
    
    // Print Number Spiral
    
    public static void Spiral(Scanner sc) {
    	System.out.println("Enter the number of rows : ");
    	int rows=sc.nextInt();
    	
    	for(int i = 1; i <= 2*rows-1; i++) {
    	    for(int j = 1; j <= 2*rows-1; j++) {
    	        int a = i, b = j;

    	        if(i > rows) a = 2*rows - i;
    	        if(j > rows) b = 2*rows- j;

    	        System.out.print(Math.min(a, b) + " ");
    	    }
    	    System.out.println();
    	}
    	
    }
    // Displays menu
    public static void displayMenu() {
        System.out.println("\n===== Pattern Menu =====");
        System.out.println("1. Increasing Triangle");
        System.out.println("2. Decreasing Triangle");
        System.out.println("3. Floyd's Triangle");
        System.out.println("4. Binary Triangle (Flag Method)");
        System.out.println("5. Binary Triangle (Parity Method)");
        System.out.println("6. Odd Number Triangle");
        System.out.println("7. Right Aligned Triangle");
        System.out.println("8. Rhombus");
        System.out.println("9. Inverted Right Triangle Pattern");
        System.out.println("10.Pyramid");
        System.out.println("11.Pyramid Method 2");
        System.out.println("12.Diamond");
        System.out.println("13.Bridge");
        System.out.println("14.Number Spiral");
        System.out.println("15.Exit");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            displayMenu();
            choice = sc.nextInt();

            System.out.println();

            switch (choice) {

                case 1:
                    printIncreasingTriangle(sc);
                    break;

                case 2:
                    printDecreasingTriangle(sc);
                    break;

                case 3:
                    printFloydsTriangle(sc);
                    break;

                case 4:
                    printBinaryTriangleUsingFlag(sc);
                    break;

                case 5:
                    printBinaryTriangleUsingParity(sc);
                    break;

                case 6:
                    printOddNumberTriangle(sc);
                    break;

                case 7:
                    printRightAlignedTriangle(sc);
                    break;

                case 8:
                    printRhombus(sc);
                    break;

                case 9:
                	invertedStarTriangle(sc);
                    break;
                    
                case 10: 
                	Pyramid(sc);
                	break;
                	
                case 11:
                	Pyramid2(sc);
                	break;
                	
                case 12:
                	Diamond(sc);
                	break;
                case 13:
                	Bridge(sc);
                	break;

                case 14:
                	Spiral(sc);
                	break;
                	
                case 15 :
                  System.out.println("Program terminated.");

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();

        } while (choice != 15);

        sc.close();
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package btap04;

import java.util.Scanner;

/**
 *
 * @author Thang dep trai
 */
public class Btap04 {

    /**
     * @param args the command line arguments
     * @return
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("nhập vào m: ");
//        int m = sc.nextInt();
//        System.out.print("nhâp vào n: ");
//        int n = sc.nextInt();
//        System.out.print("nhập vào a: ");
//        int a = sc.nextInt();
//        System.out.print("nhập vào b: ");
//        int b = sc.nextInt();
//        int[][] arr = new int[m][n];
//        int[][] arr1 = new int[a][b];
//        int c[][] = new int[m][b];
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.println("nhap phan tu thứ [" + i + "," + j + "]");
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i < a; i++) {
//            for (int j = 0; j < b; j++) {
//                System.out.println("nhap phan tu thứ [" + i + "," + j + "]");
//                arr1[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < b; j++) {
//                if (a == m && b == n) {
//                    c[i][j] = arr[i][j] + arr1[i][j];
//
//                    System.out.println(c[i][j] + "");
//                } else {
//                    System.out.println("KHÔNG CỘNG ĐƯỢC");
//                }
//            }
//        }
//
//    }
        //ex2
        //        System.out.print("nhap vao so a: ");
        //        int a = sc.nextInt();
        //        System.out.print("nhap vao so b: ");
        //        int b = sc.nextInt();
        //        if ((a * b) % 3 == 0 && (a * b) % 5 == 0) {
        //            System.out.println("true");
        //
        //        } else {
        //            System.out.println("false");
        //        }
        //    }
        //EX3
        System.out.print("nhập vào kích thước mảng: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < A.length; i++) {
            System.out.println("nhập vào phần tử thứ" + i + ":");
            A[i] = sc.nextInt();}
            int x = check(int A,int n);
    }

    static boolean check(int A[], int n) {
        if (IsASC1(A, n)) {
            System.out.print(1);
        } else if (IsDESC1(A, n)) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
       static boolean IsASC1(int a[], int n) {
        int dem = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i + 1] >= a[i]) {
                dem++;
            }
        }
        if (dem == n - 1) {
            return true;
        } else {
            return false;
        }
    }

    static boolean IsDESC1(int a[], int n) {
        int dem = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i + 1] <= a[i]) {
                dem++;
            }
        }
        if (dem == n - 1) {
            return true;
        } else {
            return false;
        }
    }

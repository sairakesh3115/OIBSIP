import java.io.*;
import java.util.*;

import javax.swing.JLabel;

import java.lang.*;
class Number_Guessing_levels{
	static int max_num;
	static int min_num;
	static int rand_num;
	static int i=1;
	//static boolean ext=false;
	public static void easy() {
		max_num=10;
		min_num=1;
		rand_num=min_num+(int)(Math.random()*(max_num-min_num+1));
}
	public static void medium() {
		max_num=50;
		min_num=1;
		rand_num=min_num+(int)(Math.random()*(max_num-min_num+1));
}
	public static void hard() {
		max_num=100;
		min_num=1;
		rand_num=min_num+(int)(Math.random()*(max_num-min_num+1));
}
	public int compare_guess(int n1,int n2) {
		if(n1==n2) {
			return 1;
		}
		else if(n1<n2) {
			return 0;
		}
		else {
			return 2;
		}
	}
}
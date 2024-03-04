package com.topic.StackNQueue;

public class CircularTour {
	static int tour(int p[],int d[]) {
		int start = 0;
		int req =0;
		int extra = 0;
		
		for(int i=0;i<p.length;i++) {
			extra=extra+p[i]-d[i];
			if(extra<0) {
				start=i+1;
				req=req+extra;
				extra=0;
			}
		}
		if(req+extra>=0)		
		return start; 
		else
		return -1;
	}
	
	public static void main(String[] args) {
		int petrol[] = {4 ,6 ,7 ,4};
		int distance[] ={6 ,5 ,3 ,5};
		System.out.print(tour(petrol,distance));
	}
}

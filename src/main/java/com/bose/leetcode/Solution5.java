package com.bose.leetcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by arijitbose on 6/5/16.
 * Merge intervals
 */
public class Solution5 {

    public List<Interval> merge(List<Interval> intervals) {

        int index = 0;
        int minStart = Integer.MAX_VALUE;
        int maxEnd = Integer.MIN_VALUE;

        if(intervals == null)
            return null;



        while(intervals.get(index) != null && index+1 < intervals.size()){

            Interval current = intervals.get(index);
            Interval next = intervals.get(index+1);

            intervals.sort(new Comparator<Interval>() {
                public int compare(Interval o1, Interval o2) {
                    return (o1.start > o2.start)? 1 : -1;
                }
            });

            intervals = verifyOrder(intervals, index);

            if(current.end >= next.start){

                int start =  current.start;
                int end = next.end;

                if(next.start < current.start)
                    start = next.start;
                if(next.end < current.end)
                    end = current.end;

                Interval temp = new Interval(start, end);
                //intervals.remove(index);
                 intervals.remove(index+1);
                intervals.set(index,temp);

                current = intervals.get(index);
            }
            else
                index++;
        }

        return intervals;
    }


    List<Interval> verifyOrder(List<Interval> intervals, int index){


        Interval current = intervals.get(index);
        Interval next = intervals.get(index+1);

        if(current.start > next.start && current.start > next.end){

            intervals.set(index, next);
            intervals.set(index+1, current);
        }

        return intervals;
    }

    public void displayList(List<Interval> list){

        for(Interval interval : list) {

            System.out.println("[" + interval.start+","+interval.end+"],");
        }

    }

    //[1,3],[2,6],[8,10],[15,18]
    //[[2,3],[4,5],[6,7],[8,9],[1,10]]
    public static void main(String[] args) {

        Solution5 sol = new Solution5();
        Interval int1 = new Interval(1,3);
        Interval int2 = new Interval(2,6);
        Interval int3 = new Interval(8,10);
        Interval int4 = new Interval(15,18);

        List<Interval> intervals = new LinkedList<Interval>();
        intervals.add(int1); intervals.add(int2);
        intervals.add(int3); intervals.add(int4);

        intervals = sol.merge(intervals);
        sol.displayList(intervals);
        System.out.println();

    }

    //
}


 class Interval{

     int start;
     int end;

     public Interval(){
         start =0;
         end = 0;
     }

     public Interval(int start, int end){

         this.start = start;
         this.end =  end;
     }

}
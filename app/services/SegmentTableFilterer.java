package services;

import java.util.ArrayList;
import java.util.Iterator;

public class SegmentTableFilterer {
	
	public SegmentTableFilterer()
	{
		
	}
	
	public void removeSegmentsOfLessArea(SegmentTable st, int area)
	{
		ArrayList<Segment> segList = st.getSegmentTableAsList();
		
		Iterator<Segment> i = segList.iterator();
		while (i.hasNext()) {
		   Segment s = i.next();
		   if(s.getArea() <= area)
		   {
			   i.remove();
		   }
		}
		/*
		Iterator<Segment> i = segList.iterator();
		while (i.hasNext()) {
		   Segment s = i.next();
		   if(s.getArea() <= area)
		   {
			   int segmentLabel = segList.indexOf(s);
			   st.removeSegment(segmentLabel);
		   }
		}
		*/
	}
}

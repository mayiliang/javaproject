package sorttest;

import java.util.ArrayList;
import java.util.List;

public class SortUtils {
		public static List<Student> stu=new ArrayList<Student>();
		public static List<Teacher> tea=new ArrayList<Teacher>();
 		
 		public static <E> void add(E e) {
 			if(e.getClass()==Student.class) {
 				Student s1=(Student) e;
 				
 				stu.add(s1);
 				
 			}
 			else if(e.getClass()==Teacher.class) {
 				Teacher s1=(Teacher) e;
 				
 				
 				tea.add(s1);
 				
 			}
 			
 		}
 		public static void stusort() {
 			String value=stu.get(stu.size()-1).getId();
 			if(stu.size()==1) {
 				return;
 			}
 			if(stu.size()==2) {
 				if(stu.get(0).getId().compareTo(stu.get(1).getId())<0) {
 					String xt=stu.get(0).getId();
 					stu.get(0).setId(stu.get(1).getId());
 					stu.get(1).setId(xt);
 				}
 				return;
 			}
 			if(stu.get(0).getId().compareTo(value)<=0) {
 				for(int j=stu.size()-1;j>=0;j--) {
					
					if(j==0) {
						
						stu.get(j).setId(value);
						
					}
					else {
						stu.get(j).setId(stu.get(j-1).getId());
					}
				}
 				return;
 			}
 			for(int i=0;i<stu.size()-2;i++) {
 					
					if(stu.get(i).getId().compareTo(value)>0 && stu.get(i+1).getId().compareTo(value)<0 ) {
						
						for(int j=stu.size()-1;j>=i+1;j--) {
							
							if(j==i+1) {
								
								stu.get(j).setId(value);
								
							}
							else {
								stu.get(j).setId(stu.get(j-1).getId());
							}
						}
						break;
					}
					
				}
 		}
 		public static void teasort() {
 			String value=tea.get(tea.size()-1).getId();
 			if(tea.size()==1) {
 				return;
 			}
 			if(tea.size()==2) {
 				if(tea.get(0).getId().compareTo(tea.get(1).getId())<0) {
 					String xt=tea.get(0).getId();
 					tea.get(0).setId(tea.get(1).getId());
 					tea.get(1).setId(xt);
 				}
 				return;
 			}
 			if(tea.get(0).getId().compareTo(value)<=0) {
 				for(int j=tea.size()-1;j>=0;j--) {
					
					if(j==0) {
						
						tea.get(j).setId(value);
						
					}
					else {
						tea.get(j).setId(tea.get(j-1).getId());
					}
				}
 				return;
 			}
 			for(int i=0;i<tea.size()-2;i++) {
 					
					if(tea.get(i).getId().compareTo(value)>0 && tea.get(i+1).getId().compareTo(value)<0 ) {
						
						for(int j=tea.size()-1;j>=i+1;j--) {
							
							if(j==i+1) {
								
								tea.get(j).setId(value);
								
							}
							else {
								tea.get(j).setId(tea.get(j-1).getId());
							}
						}
						break;
					}
					
				}
 		}
		
}

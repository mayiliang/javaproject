package sorttest;
public class Main {
	public static <E> void main(String[] args) {
		for(int i=0;i<20;i++) {
			String value="stu"+(int)(Math.random()*100);
			Student s1=new Student();
			s1.setId(value);
			SortUtils.add(s1);
			SortUtils.stusort();
		}
		for(int i=0;i<20;i++) {
			String value="tea"+(int)(Math.random()*100);
			Teacher s1=new Teacher();
			s1.setId(value);
			SortUtils.add(s1);
			SortUtils.teasort();
		}
		System.out.println("student:");
		for(int i=0;i<20;i++) {
			System.out.print(SortUtils.stu.get(i).getId()+"  ");
		}
		System.out.println();
		System.out.println("teacher:");
		for(int i=0;i<20;i++) {
			System.out.print(SortUtils.tea.get(i).getId()+"  ");
		}
		System.out.println();
		
		
		
		
	}
}

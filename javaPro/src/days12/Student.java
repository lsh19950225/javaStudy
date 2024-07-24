package days12;

public class Student {

	// 필드
	public String name;
	public int kor, eng, mat, tot, rank;
	public double avg;
	
	public Student() {}
	
	public Student(String name, int kor, int eng, int mat, int tot, int rank, double avg) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.tot = tot;
		this.rank = rank;
		this.avg = avg;
	}

	// 메서드
	public void dispInfo() {
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n"
				,name,kor,eng,mat,tot,avg,rank);
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", tot=" + tot + ", rank="
				+ rank + ", avg=" + avg + "]";
	}

}

package nghiemle.maven.project.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SINHVIEN")
public class SinhVien {
	@Id @GeneratedValue
	@Column(name = "MASV")
	private int maSV;
	
	@Column(name= "HO")
	private String ho;
	
	@Column(name ="TEN")
	private String ten;

	@Column(name="NOISINH")
	private String noiSinh;

	public SinhVien(int maSV, String ho, String ten, String noiSinh) {
		super();
		this.maSV = maSV;
		this.ho = ho;
		this.ten = ten;
		this.noiSinh = noiSinh;
	}

	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNoiSinh() {
		return noiSinh;
	}

	public void setNoiSinh(String noiSinh) {
		this.noiSinh = noiSinh;
	}
	
	public String getHoTen(String ho, String ten)
	{
		return this.ho +" "+ this.ten;
	}
}

package quiz2;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Video {
	private String title;
	private String category;
	private boolean lend;
	private String lendName;
	private Date date;
	
	@Override
	public String toString() {
		return "Video [title=" + title + ", category=" + category + ", lend=" + lend + ", lendName=" + lendName
				+ ", date=" + date + "]\n";
	}
	public Video(String title, String category, boolean lend, String lendName) {
		super();
		this.title = title;
		this.category = category;
		this.lend = lend;
		this.lendName = lendName;
		Calendar calendar = Calendar.getInstance();
		this.date = calendar.getTime();
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public boolean isLend() {
		return lend;
	}
	public void setLend(boolean lend) {
		this.lend = lend;
	}
	public String getLendName() {
		return lendName;
	}
	public void setLendName(String lendName) {
		this.lendName = lendName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}

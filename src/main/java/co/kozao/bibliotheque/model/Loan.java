package co.kozao.bibliotheque.model;
import java.time.LocalDate;

public class Loan {
	
	private int id;
	private Books book;
	private String memberName;
	private LocalDate loanDate;
	private LocalDate plannedreturnDate;
	private LocalDate actualReturnDate;
	
	public Loan(int id, Books book, String memberName, LocalDate loanDate, LocalDate plannedreturnDate, LocalDate actualReturnDate) {
		this.id = id;
		this.book = book;
		this.memberName = memberName;
		this.loanDate = loanDate;
		this.plannedreturnDate = plannedreturnDate;
		this.actualReturnDate = actualReturnDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Books getBook() {
		return book;
	}

	public void setBook(Books book) {
		this.book = book;
	}

	public LocalDate getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(LocalDate loanDate) {
		this.loanDate = loanDate;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public LocalDate getPlannedreturnDate() {
		return plannedreturnDate;
	}

	public void setPlannedeturnDate(LocalDate plannedreturnDate) {
		this.plannedreturnDate = plannedreturnDate;
	}

	public LocalDate getActualReturnDate() {
		return actualReturnDate;
	}

	public void setActualReturnDate(LocalDate actualReturnDate) {
		this.actualReturnDate = actualReturnDate;
	}
	
	
}

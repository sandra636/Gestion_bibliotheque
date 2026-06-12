package co.kozao.bibliotheque.model;
import java.time.LocalDate;

public class Loan {
	
	private int id;
	private Books book;
	private String borrowerName;
	private LocalDate loanDate;
	private LocalDate plannedeturnDate;
	private LocalDate actualReturnDate;
	
	public Loan() {
		
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

	public String getBorrowerName() {
		return borrowerName;
	}

	public void setBorrowerName(String borrowerName) {
		this.borrowerName = borrowerName;
	}

	public LocalDate getPlannedeturnDate() {
		return plannedeturnDate;
	}

	public void setPlannedeturnDate(LocalDate plannedeturnDate) {
		this.plannedeturnDate = plannedeturnDate;
	}

	public LocalDate getActualReturnDate() {
		return actualReturnDate;
	}

	public void setActualReturnDate(LocalDate actualReturnDate) {
		this.actualReturnDate = actualReturnDate;
	}
	
	
}

package phonebookproject;

public class Directory {
Person[] book = new Person[0];

private Object alphabet;
public void addperson(Person newPerson) {

	Person[] temp = new Person[book.length + 1];
	for (int i = 0; i <book.length; i++) {
		temp[i] = book[i];
	}	
	temp[temp.length - 1]= newPerson;
	book = temp;
}

public Person[] getBook() {
	return book;
}
public void setBook(Person[] book) {
	this.book = book;
}
public Object getAlphabet() {
	return alphabet;
}
public void setAlphabet(Object alphabet) {
	this.alphabet = alphabet;
}
}
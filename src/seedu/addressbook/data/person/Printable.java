package seedu.addressbook.data.person;

public interface Printable {
    /**
     * Returns a concatenated version of the printable strings of each object.
     */
    default String getPrintableString() {
        return "A printable String! :)";
    }
}

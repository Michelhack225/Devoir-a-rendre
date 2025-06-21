public class Main {

    public static class Contact {
        String name;
        String phoneNumber;
        String email;

        public Contact(String name, String phoneNumber, String email) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }
    }

    public class ContactsManager {
        Contact[] contacts;
        int count;

        public ContactsManager() {
            contacts = new Contact[100];
            count = 0;
        }

        public void addContact(Contact contact) {
            if (count < contacts.length) {
                contacts[count] = contact;
                count++;
            }
        }

        public Contact searchContact(String searchName) {
            return null;
        }
    }
    public Contact searchContact(String name) {
        int count = 0;
        for (int i = 0; i < count; i++) {
            Contact[] contacts = new Contact[0];
            if (contacts[i].name.equalsIgnoreCase(name)) {
                return contacts[i];
            }
        }
        return null;
    }
    public class main {
        public void main(String[] args) {
            ContactsManager myContactsManager = new ContactsManager();


            myContactsManager.addContact(new Contact("Michel", "0701098544", "michel@example.com"));
            myContactsManager.addContact(new Contact("Alice", "0578361202", "alice@example.com"));
            myContactsManager.addContact(new Contact("tresor", "0101544896", "tresor@example.com"));
            myContactsManager.addContact(new Contact("Charlie", "0587410100", "charlie@example.com"));
            myContactsManager.addContact(new Contact("Diane", "0755639955", "diane@example.com"));
            String searchName = "Alice";
            Contact result = myContactsManager.searchContact(searchName);

            if (result != null) {
                System.out.println("Nom : " + result.name);
                System.out.println("Téléphone : " + result.phoneNumber);
                System.out.println("Email : " + result.email);
            } else {
                System.out.println("Contact non trouvé !");
            }
        }
    }

}

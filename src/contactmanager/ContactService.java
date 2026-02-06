package contactmanager;
import java.util.ArrayList;
public class ContactService {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(String name, String phone) {
        contacts.add(new Contact(name, phone));
        System.out.println("✅ Contact added");
    }
    public void showContacts(){
      if (contacts.isEmpty()){
          System.out.println("📭 Contactlar yo‘q");
          return;
      }
      for (Contact contact : contacts){
          System.out.println(contact);
      }
    }
    public void searchContact(String name){
        for (Contact contact : contacts){
            if (contact.getName().equalsIgnoreCase(name)){
                System.out.println("🔍 Found: " + contact);
                return;
            }
        }
        System.out.println("❌ Contact topilmadi");
    }
    public void deleteContact(String name){
        for (Contact contact : contacts){
            if (contact.getName().equalsIgnoreCase(name)){
                contacts.remove(contact);
                System.out.println("🗑️ Contact o‘chirildi");
                return;
            }
        }
        System.out.println("❌ Contact topilmadi");
    }

}

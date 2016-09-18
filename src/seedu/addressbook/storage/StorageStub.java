package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;

public class StorageStub implements StorageInterface {

    public StorageStub(String path) {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void save(AddressBook addressBook) throws StorageOperationException {        
    }

    @Override
    public AddressBook load() throws StorageOperationException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getPath() {
        // TODO Auto-generated method stub
        return null;
    }
    
}

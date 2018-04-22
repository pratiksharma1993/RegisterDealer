package com.ondemanddeals.data;


public class OwnerDetails {

	 private String lastName;

	    private int contactNum;

	    private String firstName;

	    public String getLastName ()
	    {
	        return lastName;
	    }

	    public void setLastName (String lastName)
	    {
	        this.lastName = lastName;
	    }

	    public int getContactNum ()
	    {
	        return contactNum;
	    }

	    public void setContactNum (int contactNum)
	    {
	        this.contactNum = contactNum;
	    }

	    public String getFirstName ()
	    {
	        return firstName;
	    }

	    public void setFirstName (String firstName)
	    {
	        this.firstName = firstName;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [lastName = "+lastName+", contactNum = "+contactNum+", firstName = "+firstName+"]";
	    }
}

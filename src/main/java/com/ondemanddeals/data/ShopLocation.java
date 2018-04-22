package com.ondemanddeals.data;


public class ShopLocation {

	 private int pinCode;

	    private String addressLine2;

	    private String addressLine1;

	    private String city;

	    public int getPinCode ()
	    {
	        return pinCode;
	    }

	    public void setPinCode (int pinCode)
	    {
	        this.pinCode = pinCode;
	    }

	    public String getAddressLine2 ()
	    {
	        return addressLine2;
	    }

	    public void setAddressLine2 (String addressLine2)
	    {
	        this.addressLine2 = addressLine2;
	    }

	    public String getAddressLine1 ()
	    {
	        return addressLine1;
	    }

	    public void setAddressLine1 (String addressLine1)
	    {
	        this.addressLine1 = addressLine1;
	    }

	    public String getCity ()
	    {
	        return city;
	    }

	    public void setCity (String city)
	    {
	        this.city = city;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [pinCode = "+pinCode+", addressLine2 = "+addressLine2+", addressLine1 = "+addressLine1+", city = "+city+"]";
	    }

}

package com.ondemanddeals.data;

public class Request {

	private ShopDetails shopDetails;

    private OwnerDetails ownerDetails;

    public ShopDetails getShopDetails ()
    {
        return shopDetails;
    }

    public void setShopDetails (ShopDetails shopDetails)
    {
        this.shopDetails = shopDetails;
    }

    public OwnerDetails getOwnerDetails ()
    {
        return ownerDetails;
    }

    public void setOwnerDetails (OwnerDetails ownerDetails)
    {
        this.ownerDetails = ownerDetails;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [shopDetails = "+shopDetails+", ownerDetails = "+ownerDetails+"]";
    }
}

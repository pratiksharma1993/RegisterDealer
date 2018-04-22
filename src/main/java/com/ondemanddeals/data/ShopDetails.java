package com.ondemanddeals.data;


public class ShopDetails {

	private String shopName;

    private long shopContactNum;

    private String shopCategory;

    private long altContactNum;

    private ShopLocation shopLocation;

    public String getShopName ()
    {
        return shopName;
    }

    public void setShopName (String shopName)
    {
        this.shopName = shopName;
    }

    public long getShopContactNum ()
    {
        return shopContactNum;
    }

    public void setShopContactNum (long shopContactNum)
    {
        this.shopContactNum = shopContactNum;
    }

    public String getShopCategory ()
    {
        return shopCategory;
    }

    public void setShopCategory (String shopCategory)
    {
        this.shopCategory = shopCategory;
    }

    public long getAltContactNum ()
    {
        return altContactNum;
    }

    public void setAltContactNum (long altContactNum)
    {
        this.altContactNum = altContactNum;
    }

    public ShopLocation getShopLocation ()
    {
        return shopLocation;
    }

    public void setShopLocation (ShopLocation shopLocation)
    {
        this.shopLocation = shopLocation;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [shopName = "+shopName+", shopContactNum = "+shopContactNum+", shopCategory = "+shopCategory+", altContactNum = "+altContactNum+", shopLocation = "+shopLocation+"]";
    }
}

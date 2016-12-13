package model;

public class Product {

    private long ProductID;
    private String ProductName;
    private Double ProductPrice;
    private String ProductSlug;
    private String ProductImage;
    private String ProductDescription;
    private long SupplieID;
    private long CategoryID;

    public Product() {
    }

    public Product(long ProductID, String ProductName, Double ProductPrice, String ProductSlug, String ProductImage, String ProductDescription) {
        this.ProductID = ProductID;
        this.ProductName = ProductName;
        this.ProductPrice = ProductPrice;
        this.ProductSlug = ProductSlug;
        this.ProductImage = ProductImage;
        this.ProductDescription = ProductDescription;
    }

    public long getProductID() {
        return ProductID;
    }

    public String getProductName() {
        return ProductName;
    }

    public Double getProductPrice() {
        return ProductPrice;
    }

    public String getProductSlug() {
        return ProductSlug;
    }

    public String getProductImage() {
        return ProductImage;
    }

    public String getProductDescription() {
        return ProductDescription;
    }

    public long getSupplieID() {
        return SupplieID;
    }

    public long getCategoryID() {
        return CategoryID;
    }

    public void setProductID(long ProductID) {
        this.ProductID = ProductID;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public void setProductPrice(Double ProductPrice) {
        this.ProductPrice = ProductPrice;
    }

    public void setProductSlug(String ProductSlug) {
        this.ProductSlug = ProductSlug;
    }

    public void setProductImage(String ProductImage) {
        this.ProductImage = ProductImage;
    }

    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }

    public void setSupplieID(long SupplieID) {
        this.SupplieID = SupplieID;
    }

    public void setCategoryID(long CategoryID) {
        this.CategoryID = CategoryID;
    }
    

  

}
